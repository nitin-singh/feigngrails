package dto

class ResponseDTO {
    String message
    Integer id
    boolean status
    Integer code
    def data
    List<ApiErrorDTO> apiErrors = []
}
