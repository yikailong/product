package com.guiguweiserver.eureka_product.servers;

import com.guiguweiserver.eureka_product.dao.Productdao;
import com.guiguweiserver.eureka_product.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Productimpol implements Productserver {

    @Autowired
    Productdao productdao;

    @Override
    public Product getproduct(int id) {

        return productdao.findById(id).get();

    }
}
