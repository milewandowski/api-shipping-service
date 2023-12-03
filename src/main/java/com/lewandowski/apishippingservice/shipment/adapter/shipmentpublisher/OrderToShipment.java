package com.lewandowski.apishippingservice.shipment.adapter.shipmentpublisher;

import com.lewandowski.apishippingservice.shipment.domain.model.Order;
import com.lewandowski.apishippingservice.shipment.domain.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class OrderToShipment {

    Shipment map(Order order, List<Product> products) {
        return new Shipment(order.getId(),
                order.getName(),
                order.getPhoneNumber(),
                order.getEmailAddress(),
                order.getAddress().getCountry(),
                order.getAddress().getPostalCode(),
                order.getAddress().getCity(),
                order.getAddress().getAddress(),
                products);
    }
}
