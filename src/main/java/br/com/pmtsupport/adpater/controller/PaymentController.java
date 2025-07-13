package br.com.pmtsupport.adpater.controller;

import br.com.pmtsupport.adpater.dto.request.CreatePaymentRequestDto;
import br.com.pmtsupport.adpater.dto.response.CreatePaymentResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PaymentController implements IPaymentControllerSwagger {

    @Override
    @PostMapping("/payments")
    public ResponseEntity<CreatePaymentResponseDto> createPayment(CreatePaymentRequestDto paymentRequestDto) {
        return null;
    }
}
