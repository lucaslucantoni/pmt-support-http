package br.com.pmtsupport.domain.service;

import br.com.pmtsupport.adpater.output.mapper.PaymentMapper;
import br.com.pmtsupport.adpater.output.model.PaymentEntity;
import br.com.pmtsupport.adpater.output.repository.IPaymentRepository;
import br.com.pmtsupport.domain.exception.DuplicatedPaymentRequestException;
import br.com.pmtsupport.domain.model.PaymentModel;
import br.com.pmtsupport.port.output.IAzureSqlDbOutputPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AzureSqlDbService implements IAzureSqlDbOutputPort {

    private final IPaymentRepository repository;
    private final PaymentMapper mapper;

    @Override
    @Transactional
    public PaymentEntity createPayment(PaymentModel payment) throws DuplicatedPaymentRequestException {

        log.info("Creating payment {}", payment);
        try {
            return repository.saveAndFlush(mapper.toPaymentEntity(payment));
        } catch (DataIntegrityViolationException e) {
            log.error("Error creating payment {}", payment, e);
            if (e.getLocalizedMessage().contains("UNIQUE KEY"))
                throw new DuplicatedPaymentRequestException("Payment already exists for this correlation: " + payment);
            throw e;
        }
    }
}
