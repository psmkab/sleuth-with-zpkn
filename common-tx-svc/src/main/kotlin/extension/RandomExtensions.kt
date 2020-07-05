package extension

import java.util.*

/**
 * if from = 2 & to = 4, return value is 2 ~ 4
 *
 * @param from
 * @param to
 * @return random value
 *
 * @exception IllegalArgumentException when from is bigger than to, throws exception.
 */
fun Random.nextIntWithBound(from: Int = 0, to: Int): Long {
    if(from > to) throw IllegalArgumentException("$from should be bigger than $to")

    return (this.nextInt(to - from) + from).toLong()
}