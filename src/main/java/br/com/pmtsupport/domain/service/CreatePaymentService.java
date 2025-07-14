package br.com.pmtsupport.domain.service;

import br.com.pmtsupport.adpater.output.mapper.IPaymentMapper;
import br.com.pmtsupport.config.PaymentConfig;
import br.com.pmtsupport.domain.model.CreatePaymentModel;
import br.com.pmtsupport.domain.model.CreatePaymentResponseModel;
import br.com.pmtsupport.port.input.ICreatePaymentInputPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreatePaymentService implements ICreatePaymentInputPort {

    private final PaymentConfig paymentConfig;
    private final IPaymentMapper paymentMapper;

    @Override
    public CreatePaymentResponseModel createPayment(CreatePaymentModel createPaymentModel) {

        log.info("Create payment {}", createPaymentModel);

        return null;
    }
}
