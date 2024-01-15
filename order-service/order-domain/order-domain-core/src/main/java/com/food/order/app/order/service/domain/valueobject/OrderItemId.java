package com.food.order.app.order.service.domain.valueobject;

import com.food.order.app.domain.valueobject.BaseId;
import com.food.order.app.domain.valueobject.Money;
import com.food.order.app.domain.valueobject.OrderId;
import com.food.order.app.domain.valueobject.ProductId;
import com.food.order.app.order.service.domain.entity.Product;

public class OrderItemId extends BaseId<Long> {

    public OrderItemId(Long value) {
        super(value);
    }
}
