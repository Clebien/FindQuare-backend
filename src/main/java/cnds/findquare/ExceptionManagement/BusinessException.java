package cnds.findquare.ExceptionManagement;

import org.springframework.http.HttpStatus;


public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private long resourcesId;
    private String errorCode;
    private HttpStatus status;

    public BusinessException (String message) {
        super(message);
    }

    public BusinessException (Long resourcesId, String message) {
        super(message);
        this.resourcesId = resourcesId;
    }

    public BusinessException (Long resourcesId, String message, HttpStatus status) {
        super(message);
        this.resourcesId = resourcesId;
        this.status = status;
    }

    public long getResourcesId() {
        return resourcesId;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setResourcesId(Long resourcesId) {
        this.resourcesId = resourcesId;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
