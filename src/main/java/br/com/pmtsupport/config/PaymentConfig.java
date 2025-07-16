package br.com.pmtsupport.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
@NoArgsConstructor
public class PaymentConfig {

    @Value("${payments.gateway.tax}")
    private double paymentTax;
}
