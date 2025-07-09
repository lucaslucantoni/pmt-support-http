package br.com.pmtsupport.adpater.controller;

import br.com.pmtsupport.adpater.dto.PaymentRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController implements IPaymentControllerSwagger {


    @GetMapping
    public ResponseEntity<Void> getPayments() {
        return ResponseEntity.ok().build();
    }

    @Override
    @PostMapping
    public ResponseEntity<Void> createPayment(PaymentRequestDto paymentRequestDto) {
        return null;
    }
}
