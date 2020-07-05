package tx.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import tx.service.LongTransactionService

@RestController
@RequestMapping("/api")
class Controller(
    private val longTransacationService: LongTransactionService
) {
    @GetMapping("/hello")
    fun hello(): String = "World"

    @GetMapping("/long/transactions")
    fun test(): String {
        return longTransacationService.longTx()
    }
}