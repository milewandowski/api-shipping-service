package com.lewandowski.apishippingservice.shipment.domain.port;

import com.lewandowski.apishippingservice.shipment.domain.model.Order;
import com.lewandowski.apishippingservice.shipment.domain.model.Product;

import java.util.List;

public interface ShipmentPublisher {

    void send(Order order, List<Product> products);
}
