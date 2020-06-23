package com.guiguweiserver.eureka_product.servers;

import com.guiguweiserver.eureka_product.domain.Product;
import org.springframework.web.bind.annotation.PathVariable;

public interface Productserver {
    Product getproduct(int id);


}
