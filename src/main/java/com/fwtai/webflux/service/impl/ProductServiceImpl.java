package com.fwtai.webflux.service.impl;

import lombok.RequiredArgsConstructor;
import com.fwtai.webflux.domain.Product;
import com.fwtai.webflux.repository.ProductRepository;
import com.fwtai.webflux.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Transactional(readOnly = true, transactionManager = "readTransactionManager")
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Mono<Product> getProduct(final Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Flux<Product> getProducts(List<Long> ids) {
        return Flux.fromIterable(ids).flatMap(id -> productRepository.findById(id));
        // return productRepository.findAllById(ids);
    }

    @Transactional(transactionManager = "writeTransactionManager")
    @Override
    public Mono<Product> saveProducts(final String name) {
        final Product product = new Product();
        product.setName(name);
        return productRepository.save(product);
        //return productRepository.saveAll(product)
        /*return Flux.fromStream(LongStream.rangeClosed(1,10).boxed())
                .map(it -> new Product(null,"12",LocalDateTime.now()))
                .flatMap(it -> productRepository.findBySupplierIdAndSupplierProductId(it.getId())
                        .switchIfEmpty(productRepository.save(it)));*/
    }
}
