package tx.api

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import tx.service.ShortTransactionService

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/api")
class Controller(
    private val shortTransactionService: ShortTransactionService
) {
    companion object {
        val log = LoggerFactory.getLogger(this::class.java)
    }

    @GetMapping("/hello")
    fun hello() = "World"

    @GetMapping("/short/transactions")
    fun transactions(@RequestHeader headers: Map<String, String>): String {
        log.info("Get request..")
        headers.forEach {
            log.info("key: ${it.key}, value: ${it.value}")
        }
        return shortTransactionService.shortTx()
    }
}