package apiservices

import dto.BookDTO
import dto.ResponseDTO
import feign.Headers
import feign.Param
import feign.RequestLine
import org.springframework.web.bind.annotation.RequestBody

@Headers("Content-Type: application/json")
interface BookApiService {

    @RequestLine("POST api/v1/book/create")
    ResponseDTO create(@RequestBody BookDTO book)

    @RequestLine("GET api/v1/book/{id}")
    ResponseDTO fetch(@Param("id") Long id)
}