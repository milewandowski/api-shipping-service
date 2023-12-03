package com.lewandowski.apishippingservice.shipment.adapter.shipmentpublisher;

import com.lewandowski.apishippingservice.shipment.domain.model.Order;
import com.lewandowski.apishippingservice.shipment.domain.model.Product;
import com.lewandowski.apishippingservice.shipment.domain.port.ShipmentPublisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
class MessageBrokerShipmentPublisher implements ShipmentPublisher {

    private final OrderToShipment orderToShipment;

    @Override
    public void send(Order order, List<Product> products) {
        Shipment shipment = orderToShipment.map(order, products);
        try {
            Thread.sleep(50L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Shipment sent: {}", shipment);
    }
}
