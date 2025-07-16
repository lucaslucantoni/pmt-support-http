package br.com.pmtsupport.domain.model;

import lombok.Builder;

@Builder
public record CreatePaymentModel(

        String correlationId,
        float amount
) {
}
