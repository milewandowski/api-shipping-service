package com.lewandowski.apishippingservice.shipment.adapter.api;

import com.lewandowski.apishippingservice.shipment.domain.model.Order;
import com.lewandowski.apishippingservice.shipment.domain.port.ShippingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipment")
@RequiredArgsConstructor
class ShipmentController {

    private final ShippingService shippingService;

    @PostMapping
    Order makePayment(@RequestBody final Order order) {
        return shippingService.create(order);
    }
}
