package com.spring.skypro.service;

import java.util.List;

public interface ItemsService {

    void addItemCart(List<Integer> itemsID);

    List<Integer> getItemCart();

}
