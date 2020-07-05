package tx.service

import extension.nextIntWithBound
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.util.*

@Service
class LongTransactionService {
    companion object {
        const val TIME_MULTIPLIER = 1000
        private val r = Random()
    }

    /**
     * Mocking the long transaction service w/ random value.
     */
    fun longTx(): String {
        return try {
            Thread.sleep(r.nextIntWithBound(0, 5) * TIME_MULTIPLIER)
            "Success"
        } catch (e: Exception) {
            "Fail"
        }
    }
}