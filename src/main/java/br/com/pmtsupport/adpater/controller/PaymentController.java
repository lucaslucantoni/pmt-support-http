package br.com.pmtsupport.adpater.controller;

import br.com.pmtsupport.adpater.dto.request.CreatePaymentRequestDto;
import br.com.pmtsupport.adpater.dto.response.CreatePaymentResponseDto;
import br.com.pmtsupport.adpater.mapper.ICreatePaymentMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
@RequiredArgsConstructor
public class PaymentController implements IPaymentControllerSwagger {

    private final ICreatePaymentMapper createPmtMapper;

    @Override
    @PostMapping("/payments")
    public ResponseEntity<CreatePaymentResponseDto> createPayment(CreatePaymentRequestDto paymentRequestDto) {

        log.info("Processing request to create payment: {}", paymentRequestDto);

        return null;
    }
}
