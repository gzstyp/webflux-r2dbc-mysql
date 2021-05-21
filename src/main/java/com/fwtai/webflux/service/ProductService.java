package com.fwtai.webflux.service;

import com.fwtai.webflux.domain.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ProductService {

    Mono<Product> getProduct(final Long id);

    Flux<Product> getProducts(final List<Long> ids);

    Mono<Product> saveProducts(final String name);
}
