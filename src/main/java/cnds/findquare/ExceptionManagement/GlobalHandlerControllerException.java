package cnds.findquare.ExceptionManagement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalHandlerControllerException  extends ResponseEntityExceptionHandler {

    @InitBinder
    public void dataBinding (WebDataBinder binder) {

    }

    @ModelAttribute
    public void globalAttributes (Model model) {
        model.addAttribute("technicalError", "A technical error detected");
    }

    @ExceptionHandler(Exception.class) // For all another error
    public ResponseEntity<BusinessExceptionExceptionDTO> unknowError (HttpServletRequest request, Exception e) {
        BusinessExceptionExceptionDTO response = new BusinessExceptionExceptionDTO();
        response.setErrorCode("Technical Error");
        response.setErrorMessage(e.getMessage());
        response.setRequestUrl(request.getRequestURL().toString());
        return new ResponseEntity<BusinessExceptionExceptionDTO> (response,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<BusinessExceptionExceptionDTO> businessExceptionError (HttpServletRequest request, BusinessException e) {
        BusinessExceptionExceptionDTO businessExceptionExceptionDTO = new BusinessExceptionExceptionDTO();
        businessExceptionExceptionDTO.setStatus(e.getStatus());
        businessExceptionExceptionDTO.setErrorCode(e.getErrorCode());
        businessExceptionExceptionDTO.setErrorMessage(e.getMessage());
        businessExceptionExceptionDTO.setRequestUrl(request.getRequestURL().toString());
        return new ResponseEntity<BusinessExceptionExceptionDTO> (businessExceptionExceptionDTO,e.getStatus());
    }
}
