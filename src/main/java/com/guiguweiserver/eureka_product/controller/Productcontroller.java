package com.guiguweiserver.eureka_product.controller;


import com.guiguweiserver.eureka_product.domain.Order_pro;
import com.guiguweiserver.eureka_product.domain.Product;
import com.guiguweiserver.eureka_product.servers.Productserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.guiguweiserver.*;

@RestController
public class Productcontroller {
    @Autowired
    Productserver productserver;

    @GetMapping("/getproduct/{id}")
    public Product getproduct(@PathVariable("id") int id) {
        //com.guiguweiserver.eureka_domain.domain.Order_pro

        return productserver.getproduct(id);
    }

}
