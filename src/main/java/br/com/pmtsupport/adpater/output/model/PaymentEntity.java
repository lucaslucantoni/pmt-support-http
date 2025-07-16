package br.com.pmtsupport.adpater.output.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "payments")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long transactionId;

    @Column(unique = true, nullable = false, updatable = false)
    private String correlationId;

    private double grossAmount;
    private double netAmount;
    private double taxAmount;
    private double chargedTax;

    @Override
    public String toString() {
        return  "correlationId='" + correlationId + '\'' +
                ", grossAmount=" + grossAmount;
    }
}
