package ar.com.coder.hexagonal.commons.domain.data;


public class BuildResponse {

    private static final String SEPARATE= "-";

    public static <T> BaseResponse<T> Response(T object, String module, String className){
        String code = "0";
        String entity = object.getClass().getSimpleName();
        String type="";
        Long count=0L;
        //String type = UtilsComseg.getResponseType(object);
      //Long count = UtilsComseg.countCollection(object);
        return new BaseResponse(code,"200", entity,className,type,count, object);
    }

    public static BaseResponse ResponseError(int methodeCode, String message, Throwable exception, String method, String module, String details){
        String code = String.valueOf(methodeCode);
        String entity = exception.getClass().getSimpleName();
        Long count = 1L;
        return new BaseResponse(code,message, entity, method, module, count,details);
    }

    public static BaseResponse ResponseError(int methodeCode, String message, Throwable exception, String method, String module, String details, String trace) {
        String code = String.valueOf(methodeCode);
        String entity = exception.getClass().getSimpleName();
        Long count = 1L;
        return new BaseResponse(code,message, entity, method, module, count,details, trace);
    }


}
