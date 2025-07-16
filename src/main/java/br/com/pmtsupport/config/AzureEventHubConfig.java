package br.com.pmtsupport.config;

import com.azure.identity.AzureAuthorityHosts;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.eventhubs.EventHubClientBuilder;
import com.azure.messaging.eventhubs.EventHubProducerClient;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class AzureEventHubConfig {

    @Value("${payments.eventHubs.namespace}")
    private String namespace;

    @Value("${payments.eventHubs.eventHub}")
    private String eventHubName;

    @Bean
    public EventHubProducerClient  getEventHubProperties() {
        return new EventHubClientBuilder()
                .fullyQualifiedNamespace(namespace)
                .eventHubName(eventHubName)
                .credential(defaultAzureCredential())
                .buildProducerClient();

    }

    public DefaultAzureCredential defaultAzureCredential() {
        return new DefaultAzureCredentialBuilder()
                .authorityHost(AzureAuthorityHosts.AZURE_PUBLIC_CLOUD)
                .build();
    }

}
