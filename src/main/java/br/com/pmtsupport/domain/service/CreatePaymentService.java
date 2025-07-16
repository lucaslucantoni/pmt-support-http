package br.com.pmtsupport.domain.service;

import br.com.pmtsupport.config.PaymentConfig;
import br.com.pmtsupport.domain.exception.DuplicatedPaymentRequestException;
import br.com.pmtsupport.domain.model.CreatePaymentModel;
import br.com.pmtsupport.domain.model.CreatePaymentResponseModel;
import br.com.pmtsupport.domain.model.PaymentModel;
import br.com.pmtsupport.port.input.ICreatePaymentInputPort;
import br.com.pmtsupport.port.output.IAzureSqlDbOutputPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreatePaymentService implements ICreatePaymentInputPort {

    private final PaymentConfig paymentConfig;
    private final IAzureSqlDbOutputPort databasePort;

    @Override
    public CreatePaymentResponseModel createPayment(CreatePaymentModel createPaymentModel) {

        log.info("Create payment {}", createPaymentModel);
        double taxValue = createPaymentModel.amount() * (paymentConfig.getPaymentTax() / 100);
        PaymentModel paymentRequest = PaymentModel.builder()
                .chargedTax(paymentConfig.getPaymentTax())
                .correlationId(createPaymentModel.correlationId())
                .grossAmount(createPaymentModel.amount())
                .taxAmount(taxValue)
                .netAmount(createPaymentModel.amount() - taxValue)
                .build();

        var paymentResponse = databasePort.createPayment(paymentRequest);
        log.info("Processed Payment {}", paymentResponse);
        assert paymentResponse != null;
        return new CreatePaymentResponseModel("CREATED", paymentResponse.toString());


    }
}
