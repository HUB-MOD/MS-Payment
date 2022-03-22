package com.nttdata.MSPayment.service;

import com.nttdata.MSPayment.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PaymentServiceBalancedImpl implements PaymentService {

    @Autowired
    @Qualifier("wcLoadBalanced")
    WebClient.Builder webClientBuilder;

    @Override
    public Mono<Payment> createPayment(Payment p) {
        return null;
    }

    @Override
    public Mono<Payment> updatePayment(Payment p) {
        return null;
    }

    @Override
    public Mono<Payment> findByPaymentId(Integer id) {
        return null;
    }

    @Override
    public Flux<Payment> findAllByCreditId(Integer id) {
        return null;
    }

    @Override
    public Mono<Void> deletePayment(Integer id) {
        return null;
    }
}
