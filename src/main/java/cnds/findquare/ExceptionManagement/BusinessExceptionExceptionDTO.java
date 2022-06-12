package cnds.findquare.ExceptionManagement;

import org.springframework.http.HttpStatus;

public class BusinessExceptionExceptionDTO {

    private String errorMessage;
    private String requestUrl;
    private String errorCode;
    private HttpStatus status;

    public BusinessExceptionExceptionDTO () {

    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
