package enums

enum ErrorCode {

    METHOD_NOT_ALLOWED("Method_Not_Allowed", "Method not allowed.Please verify the method type."),
    METHOD_NOT_FOUND("Method_Not_Found", "No such method found.Please verify the url again."),
    ACCESS_DENIED("Access_Denied", "Access Denied."),
    INTERNAL_SERVER_ERROR("Ex_", "Some thing went wrong.Please try after some time."),
    NULL_REQUEST("Null_Request_Params", "No data received in request parameters."),
    NULL_RESPONSE("Null_Response_Data", "No data exists."),
    VALIDATION_FAILED("V_", "Validation Failed"),
    ACTION_REQUIRED("Ac_", "Perform Action"),
    ERROR_CODE("E_", "An Error has occured. Please try again")

    final String code
    final String message

    ErrorCode(String code, String message) {
        this.code = code
        this.message = message
    }
}