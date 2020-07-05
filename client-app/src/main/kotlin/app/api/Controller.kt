package tx.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import tx.service.Service

@RestController
@RequestMapping("/api")
class Controller(
    private val service: Service
) {
    @GetMapping("/hello")
    fun hello(): String = "World"

    @GetMapping("/resources")
    fun resources() {
        service.externalServices()
    }
}