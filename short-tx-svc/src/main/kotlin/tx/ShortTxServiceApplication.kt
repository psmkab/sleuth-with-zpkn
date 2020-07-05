package tx

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration

@SpringBootApplication(
    exclude = [DataSourceAutoConfiguration::class]
)
class ShortTxServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(ShortTxServiceApplication::class.java, *args)
}