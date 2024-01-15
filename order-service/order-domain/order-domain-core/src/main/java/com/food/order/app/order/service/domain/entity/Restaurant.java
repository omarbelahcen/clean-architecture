package com.food.order.app.order.service.domain.entity;

import com.food.order.app.domain.entity.AggregateRoot;
import com.food.order.app.domain.valueobject.RestaurantId;

import java.util.List;

public class Restaurant extends AggregateRoot<RestaurantId> {

    private final List<Product> products;
    private boolean active;

    private Restaurant(Builder builder) {
        super.setId(builder.restaurantId);
        products = builder.products;
        active = builder.active;
    }


    public static final class Builder {
        private RestaurantId restaurantId;
        private final List<Product> products;
        private boolean active;

        public Builder(List<Product> products) {
            this.products = products;
        }

        public Builder id(RestaurantId val) {
            restaurantId = val;
            return this;
        }

        public Builder active(boolean val) {
            active = val;
            return this;
        }

        public Restaurant build() {
            return new Restaurant(this);
        }
    }
}
