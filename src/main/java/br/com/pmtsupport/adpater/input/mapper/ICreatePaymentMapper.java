package br.com.pmtsupport.adpater.input.mapper;

import br.com.pmtsupport.adpater.input.dto.request.CreatePaymentRequestDto;
import br.com.pmtsupport.adpater.input.dto.response.CreatePaymentResponseDto;
import br.com.pmtsupport.domain.model.CreatePaymentModel;
import br.com.pmtsupport.domain.model.CreatePaymentResponseModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICreatePaymentMapper {

    CreatePaymentModel toCreatePaymentModel(CreatePaymentRequestDto createPayment);
    CreatePaymentResponseDto toCreatePaymentResponseDto(CreatePaymentResponseModel createPaymentResponse);

}
