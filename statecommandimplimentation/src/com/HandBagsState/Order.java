package com.HandBagsState;

public interface Order {
    Order Name();
    Order IDSNumber();
    Order POBoxNumber();
    OrderDeliveryService build();
}