package br.com.pmtsupport.adpater.input.controller;

import br.com.pmtsupport.adpater.input.dto.request.CreatePaymentRequestDto;
import br.com.pmtsupport.adpater.input.dto.response.CreatePaymentResponseDto;
import br.com.pmtsupport.adpater.input.mapper.ICreatePaymentMapper;
import br.com.pmtsupport.domain.exception.DuplicatedPaymentRequestException;
import br.com.pmtsupport.domain.model.CreatePaymentResponseModel;
import br.com.pmtsupport.port.input.ICreatePaymentInputPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping
@RequiredArgsConstructor
public class PaymentController implements IPaymentControllerSwagger {

    private final ICreatePaymentMapper createPmtMapper;
    private final ICreatePaymentInputPort createPmtInputPort;

    @Override
    @PostMapping("/payments")
    public ResponseEntity<CreatePaymentResponseDto> createPayment(@Valid @RequestBody CreatePaymentRequestDto paymentRequestDto) {

        log.info("Processing request to create payment: {}", paymentRequestDto);
        try {
            CreatePaymentResponseModel response = createPmtInputPort.createPayment(
                    createPmtMapper.toCreatePaymentModel(paymentRequestDto));
            log.info("Create payment response: {}", response);
            return new ResponseEntity<>(createPmtMapper.toCreatePaymentResponseDto(response),
                    HttpStatusCode.valueOf(201));
        } catch (DuplicatedPaymentRequestException e) {
            log.error("Duplicated payment request: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
}
