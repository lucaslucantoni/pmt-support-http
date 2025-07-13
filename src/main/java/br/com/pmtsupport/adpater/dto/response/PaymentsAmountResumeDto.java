package br.com.pmtsupport.adpater.dto.response;

import lombok.Builder;

@Builder
public record PaymentsAmountResumeDto(

        int totalRequests,
        double totalAmount
) {
}
