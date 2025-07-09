package br.com.pmtsupport.adpater.controller;

import br.com.pmtsupport.adpater.dto.PaymentRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

public interface IPaymentControllerSwagger {

    @Operation(
            description = "Create a payment request",
            operationId = "createPaymentId"
    )
    @RequestBody(
            description = "Payment request",
            required = true,
            content = @Content(
                    mediaType = "application/json",
                    examples = {
                            @ExampleObject(
                                    name = "Exemplo de Pagamento",
                                    summary = "Exemplo básico de uma requisição de pagamento",
                                    value = "{\"clientName\": \"Lucantoni\", \"amount\": 1500.0}"
                            )
                    }
            )
    )
    ResponseEntity<Void> createPayment(@Valid PaymentRequestDto paymentRequestDto);

}
