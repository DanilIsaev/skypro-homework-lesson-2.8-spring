package com.spring.skypro.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Cart {

    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItems(List<Integer> addedItems) {
        items.addAll(addedItems);
    }

    public List<Integer> getItems(){
        return Collections.unmodifiableList(items);
    }

}
