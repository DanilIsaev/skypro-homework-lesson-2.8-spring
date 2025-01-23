package com.spring.skypro.service;

import com.spring.skypro.component.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    private final Cart cart;

    public ItemsServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addItemCart(List<Integer> itemsID) {
        cart.addItems(itemsID);
    }

    @Override
    public List<Integer> getItemCart() {
        return cart.getItems();
    }
}
