package dto

import com.fasterxml.jackson.annotation.JsonInclude
import groovy.transform.Canonical

@Canonical
@JsonInclude(JsonInclude.Include.NON_NULL)
class ApiErrorDTO {
    String errorCode
    String errorMessage
}