package com.guiguweiserver.eureka_product.dao;

import com.guiguweiserver.eureka_product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productdao extends JpaRepository<Product, Integer> {

}
