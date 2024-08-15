package no.fintlabs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FintCoreAdapterApplication

fun main(args: Array<String>) {
	runApplication<FintCoreAdapterApplication>(*args)
}
