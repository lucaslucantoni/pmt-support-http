package br.com.pmtsupport.adpater.input.dto.request;

import lombok.Builder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
public record CreatePaymentRequestDto(

        @NotNull @NotBlank String correlationId,
        double amount

) {
}
