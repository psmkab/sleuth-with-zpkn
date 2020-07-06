package app.api

import app.service.ClientService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ClientController(
    private val clientService: ClientService
) {
    companion object {
        val log = LoggerFactory.getLogger(this::class.java)
    }

    @GetMapping("/hello")
    fun resources() {
        log.info("Get request from remote client")
        clientService.externalServices()
    }
}