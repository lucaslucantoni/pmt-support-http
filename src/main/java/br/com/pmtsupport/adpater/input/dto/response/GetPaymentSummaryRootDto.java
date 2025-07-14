package br.com.pmtsupport.adpater.input.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record GetPaymentSummaryRootDto(

        @JsonProperty("default") PaymentsAmountResumeDto defaultPayments,
        @JsonProperty("fallback") PaymentsAmountResumeDto fallbackPayments
) {
}
