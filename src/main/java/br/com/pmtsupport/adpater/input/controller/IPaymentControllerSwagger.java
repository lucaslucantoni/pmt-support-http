package br.com.pmtsupport.adpater.input.controller;

import br.com.pmtsupport.adpater.input.dto.request.CreatePaymentRequestDto;
import br.com.pmtsupport.adpater.input.dto.response.CreatePaymentResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

public interface IPaymentControllerSwagger {

    @Operation(description = "Create a payment request", operationId = "createPaymentId")
    @RequestBody(description = "Payment request", required = true, content = @Content(
            mediaType = "application/json", examples = {
                            @ExampleObject(
                                    name = "Exemplo de Pagamento",
                                    summary = "Exemplo básico de uma requisição de pagamento",
                                    value = "{\"correlationId\": \"4a7901b8-7d26-4d9d-aa19-4dc1c7cf60b3\", \"amount\": 1500.0}")}))
    ResponseEntity<CreatePaymentResponseDto> createPayment(@Valid @RequestBody CreatePaymentRequestDto paymentRequestDto);


}
