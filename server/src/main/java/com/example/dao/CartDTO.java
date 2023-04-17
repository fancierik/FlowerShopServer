package com.example.dao;

import com.example.entity.Cart;
import com.example.entity.Good;
import com.example.entity.Order;
import com.example.model.CartReciveModel;
import com.example.repository.CartRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class CartDTO {
    @Inject
    CartRepository cartRepository;
    public boolean CrateCart(List<Good> goods, Order order){
        boolean result = false;
        for (Good good:goods){
            Cart cart = new Cart();
            cart.setIdgod(good);
            cart.setIdorder(order);
            cartRepository.save(cart);
        }
        return result = true;
    }
}
