package ar.edu.unq.desapp.grupoe.backenddesappapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@EnableMongoRepositories
@RestController
class BackendDesappApiApplication {

	@GetMapping("/")
	fun hola():String {
		return "Hola"
	}

}

fun main(args: Array<String>) {
	runApplication<BackendDesappApiApplication>(*args)
}
