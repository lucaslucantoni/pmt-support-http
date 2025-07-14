package br.com.pmtsupport.adpater.output.repository;

import br.com.pmtsupport.adpater.output.model.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaymentRepository extends JpaRepository<PaymentEntity, Long> {


}
