package br.com.pmtsupport.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PaymentModel {

    private String correlationId;
    private double grossAmount;
    private double netAmount;
    private double taxAmount;
    private int chargedTax;

}
