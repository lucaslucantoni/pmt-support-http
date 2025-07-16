package br.com.pmtsupport.adpater.output.evthub;

import com.azure.messaging.eventhubs.EventHubProducerClient;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class AzureEventHubClient {

    private final EventHubProducerClient producer;





}
