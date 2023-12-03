package com.lewandowski.apishippingservice.shipment.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    String id;
    String sku;
    String name;
    String warehouse;
}
