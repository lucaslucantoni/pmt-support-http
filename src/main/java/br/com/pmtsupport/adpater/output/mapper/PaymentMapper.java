package br.com.pmtsupport.adpater.output.mapper;

import br.com.pmtsupport.adpater.output.model.PaymentEntity;
import br.com.pmtsupport.domain.model.PaymentModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PaymentMapper {

    public PaymentEntity toPaymentEntity(PaymentModel paymentModel) {

        log.info("Mapping PaymentModel to PaymentEntity");
        return PaymentEntity.builder()
                .chargedTax(paymentModel.getChargedTax())
                .correlationId(paymentModel.getCorrelationId())
                .grossAmount(paymentModel.getGrossAmount())
                .netAmount(paymentModel.getNetAmount())
                .taxAmount(paymentModel.getTaxAmount())
                .netAmount(paymentModel.getNetAmount())
                .build();

    }
}
