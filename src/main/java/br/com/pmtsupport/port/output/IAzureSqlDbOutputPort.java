package br.com.pmtsupport.port.output;

import br.com.pmtsupport.adpater.output.model.PaymentEntity;
import br.com.pmtsupport.domain.exception.DuplicatedPaymentRequestException;
import br.com.pmtsupport.domain.model.PaymentModel;

public interface IAzureSqlDbOutputPort {

    PaymentEntity createPayment(PaymentModel payment) throws DuplicatedPaymentRequestException;

}
