package com.lewandowski.apishippingservice.shipment.domain.port;

import com.lewandowski.apishippingservice.shipment.domain.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "product-service", url = "localhost:8083")
public interface ProductServiceClient {

    @PostMapping("/product/list")
    List<Product> getProductsByIds(List<String> productIds);
}
