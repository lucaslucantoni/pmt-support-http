package br.com.pmtsupport.adpater.output.mapper;

import br.com.pmtsupport.adpater.output.model.PaymentEntity;
import br.com.pmtsupport.domain.model.PaymentModel;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface IPaymentMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            unmappedSourcePolicy = ReportingPolicy.IGNORE)
    PaymentEntity toPayment(PaymentModel paymentModel);

}
