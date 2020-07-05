package extension

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import java.util.*
import kotlin.test.assertTrue

@RunWith(MockitoJUnitRunner::class)
class RandomExtensionsTest {
    private val r = Random()

    @Test
    fun `when_value_is_matched`() {
        val result = r.nextIntWithBound(1, 4)
        assertTrue(result in 1..4)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `when_value_is_not_matched`() {
        val result = r.nextIntWithBound(4, 1)
    }
}