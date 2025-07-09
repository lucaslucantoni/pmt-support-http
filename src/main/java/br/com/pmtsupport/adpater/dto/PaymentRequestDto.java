package br.com.pmtsupport.adpater.dto;

import lombok.Builder;

@Builder
public record PaymentRequestDto(

        String correlationId,
        float amount

) {
}
