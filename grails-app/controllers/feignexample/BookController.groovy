package feignexample

import apiservices.BookApiService
import dto.BookDTO
import dto.ResponseDTO
import grails.converters.JSON
import org.springframework.beans.factory.annotation.Autowired

class BookController {

    @Autowired
    BookApiService bookApiService

    def index(){
        render "Welcome to Feign Example"
    }

    def create() {
        BookDTO book = new BookDTO(title: "DUMMY", genre: "GENREDUMMY", author: "AUTHORDUMMY")
        ResponseDTO responseDTO = bookApiService.create(book)
        render ([status: responseDTO.status, message: responseDTO.message, data: responseDTO.data] as JSON)
    }

    def fetch(Long id){
        render  (bookApiService.fetch(id) as JSON)
    }
}
