package tx.api

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import tx.service.LongTransactionService

@RestController
@RequestMapping("/api")
class LongTransactionController(
    private val longTransacationService: LongTransactionService
) {
    companion object {
        val log = LoggerFactory.getLogger(this::class.java)
    }

    @GetMapping("/long/transactions")
    fun transactions() {
        log.info("Get request from remote service client")
        longTransacationService.longTx()
    }
}