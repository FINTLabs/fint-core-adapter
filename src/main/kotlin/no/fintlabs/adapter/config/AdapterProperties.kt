package no.fintlabs.adapter.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding


@ConfigurationProperties(prefix = "fint")
data class AdapterProperties @ConstructorBinding constructor(
    val adapter: Adapter
) {
    data class Adapter(
        val id: String,
        val username: String,
        val password: String,
        val baseUrl: String,
        val orgId: String,
        val registrationId: String,
        val heartbeatInterval: Int,
        val capabilities: List<Capability>
    )

    data class Capability(
        val domainName: String,
        val packageName: String,
        val resource: String,
        val fullSyncIntervalInDays: Int,
        val deltaSyncInterval: String
    )
}