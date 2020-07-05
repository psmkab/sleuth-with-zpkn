package tx.service

import extension.nextIntWithBound
import org.springframework.stereotype.Service
import java.util.*

@Service
class ShortTransactionService {
    companion object {
        const val TIME_MULTIPLIER = 1000
        private val r = Random()
    }

    /**
     * Mocking the long transaction service w/ random value.
     */
    fun shortTx(): String {
        return try {
            Thread.sleep(r.nextIntWithBound(0, 2) * TIME_MULTIPLIER)
            "Success"
        } catch(e: Exception) {
            "Fail"
        }
    }
}