package ar.com.coder.hexagonal.commons.domain.data;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class BaseResponse<T> {
    private String code = ""; 
    private String message =""; 
    private String entity=""; 
    private String className="";
    private String type="";
    private Long count=0L;
    private T result;
     private String details = "";
    private String trace;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public BaseResponse(String code, String message, String entity, String className, String type, Long count, T result, String details) {
        setCode(code);
        setMessage(message);
        setEntity(entity);
        setClassName(className);
        setType(type);
        setCount(count);
        setResult(result);
        setDetails(details);
    }

    public  BaseResponse(String code, String property, String entity, String className, String type, Long count, T result) {
        setCode(code);
        setMessage(property);
        setEntity(entity);
        setClassName(className);
        setType(type);
        setCount(count);
        setResult(result);
        setDetails(details);
    }

    public  BaseResponse(String code, String property, String entity, String className, String type, Long count, String details) {
        setCode(code);
        setMessage(property);
        setEntity(entity);
        setClassName(className);
        setType(type);
        setCount(count);
        setResult(result);
        setDetails(details);
    }

    public  BaseResponse(String code, String property, String entity, String className, String type, Long count, String details, String trace) {
        setCode(code);
        setMessage(property);
        setEntity(entity);
        setClassName(className);
        setType(type);
        setCount(count);
        setResult(result);
        setDetails(details);
        setTrace(trace);
    }
}

