package br.com.pmtsupport.domain.service;

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

    @Override
    public CreatePaymentResponseModel createPayment(CreatePaymentModel createPaymentModel) {
        return null;
    }
}
