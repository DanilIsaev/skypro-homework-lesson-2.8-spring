package com.spring.skypro.controller;

import com.spring.skypro.service.ItemsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemsController {
    private final ItemsService itemsService;

    public ItemsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @GetMapping(path = "/store/add")
    public void addItem(@RequestParam("itemId") List<Integer> itemID){
        itemsService.addItemCart(itemID);
    }

    @GetMapping(path = "store/get")
    public List<Integer> getItem(){
        return itemsService.getItemCart();
    }
}
