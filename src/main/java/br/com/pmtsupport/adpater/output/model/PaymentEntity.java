package br.com.pmtsupport.adpater.output.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "payments")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long transactionId;

    private String correlationId;
    private double grossAmount;
    private double netAmount;
    private double taxAmount;
    private double chargedTax;

    @Override
    public String toString() {
        return  "correlationId='" + correlationId + '\'' +
                ", grossAmount=" + grossAmount +
                ", netAmount=" + netAmount +
                ", taxAmount=" + taxAmount +
                ", chargedTax=" + chargedTax;
    }
}
