package br.com.pmtsupport.adpater.input.dto.response;

import lombok.Builder;

@Builder
public record PaymentsAmountResumeDto(

        int totalRequests,
        double totalAmount
) {
}
