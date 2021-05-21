package com.fwtai.webflux.repository;

import com.fwtai.webflux.domain.Product;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ProductRepository extends ReactiveCrudRepository<Product,Long> {

    @Query("SELECT id,name,createdAt FROM product WHERE id = :id")
    Mono<Product> findBySupplierIdAndSupplierProductId(final Long id);

}
