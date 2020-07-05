package tx.api

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import tx.service.ShortTransactionService

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/api")
class Controller(
    private val shortTransactionService: ShortTransactionService
) {
    @GetMapping("/hello")
    fun hello() = "World"

    @GetMapping("/short/transactions")
    fun test(): String {
        return shortTransactionService.shortTx()
    }
}