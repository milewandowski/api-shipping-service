package com.lewandowski.apishippingservice.shipment.domain.port;

import com.lewandowski.apishippingservice.shipment.domain.model.Order;
import com.lewandowski.apishippingservice.shipment.domain.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public final class ShippingService {

    private final ProductServiceClient productServiceClient;
    private final ShipmentPublisher shipmentPublisher;

    public Order create(Order order) {
        List<Product> products = productServiceClient.getProductsByIds(order.getProductIds());
        shipmentPublisher.send(order, products);

        return order;
    }
}
