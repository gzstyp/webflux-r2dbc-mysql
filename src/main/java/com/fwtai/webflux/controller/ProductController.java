package com.fwtai.webflux.controller;

import com.fwtai.webflux.service.ProductService;
import lombok.RequiredArgsConstructor;
import com.fwtai.webflux.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    //http://127.0.0.1:8806/products/1
    @GetMapping("/products/{id}")
    public Mono<Product> product(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    //http://127.0.0.1:8806/products/byIds?ids=1,2,3
    @GetMapping("/products/byIds")//todo Flux或Mono 是Publisher,是发布者;而接收者是 Subscriber,是Subscriber;一个是发布者,一个是订阅接收者接收;这是这样通讯的;主要实现Publisher的class就能对外发布或提供信息
    public Flux<Product> product(@RequestParam List<Long> ids) {
        return productService.getProducts(ids);
    }

    //http://127.0.0.1:8806/products/saveProducts/iphone
    @GetMapping("/products/saveProducts/{name}")
    public Mono<Product> saveProducts(@PathVariable String name) {
        return productService.saveProducts(name);
    }
}
