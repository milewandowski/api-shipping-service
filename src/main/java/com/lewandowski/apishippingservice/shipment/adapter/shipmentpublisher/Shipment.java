package com.lewandowski.apishippingservice.shipment.adapter.shipmentpublisher;

import com.lewandowski.apishippingservice.shipment.domain.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Shipment {
    String id;
    String name;
    String phoneNumber;
    String emailAddress;
    String country;
    String postalCode;
    String city;
    String address;
    List<Product> products;
}
