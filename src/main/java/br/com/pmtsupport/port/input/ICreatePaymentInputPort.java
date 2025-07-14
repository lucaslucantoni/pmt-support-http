package br.com.pmtsupport.port.input;

import br.com.pmtsupport.domain.model.CreatePaymentModel;
import br.com.pmtsupport.domain.model.CreatePaymentResponseModel;

public interface ICreatePaymentInputPort {

    CreatePaymentResponseModel createPayment(CreatePaymentModel createPaymentModel);

}
