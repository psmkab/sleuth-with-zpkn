package tx.service

import extension.nextIntWithBound
import org.springframework.stereotype.Service
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
    fun longTx() {
        Thread.sleep(r.nextIntWithBound(0, 2) * TIME_MULTIPLIER)
    }
}