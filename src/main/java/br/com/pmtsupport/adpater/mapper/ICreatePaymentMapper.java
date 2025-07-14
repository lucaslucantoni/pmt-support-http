package br.com.pmtsupport.adpater.mapper;

import br.com.pmtsupport.adpater.dto.request.CreatePaymentRequestDto;
import br.com.pmtsupport.adpater.dto.response.CreatePaymentResponseDto;
import br.com.pmtsupport.domain.model.CreatePaymentModel;
import br.com.pmtsupport.domain.model.CreatePaymentResponseModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICreatePaymentMapper {

    CreatePaymentModel toCreatePaymentModel(CreatePaymentRequestDto createPayment);
    CreatePaymentResponseDto toCreatePaymentResponseDto(CreatePaymentResponseModel createPaymentResponse);

}
