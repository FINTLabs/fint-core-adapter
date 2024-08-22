package no.fintlabs.adapter

import no.fintlabs.adapter.config.AdapterProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@EnableConfigurationProperties(AdapterProperties::class)
@SpringBootApplication
class FintCoreAdapterApplication

fun main(args: Array<String>) {
    runApplication<FintCoreAdapterApplication>(*args)
}
