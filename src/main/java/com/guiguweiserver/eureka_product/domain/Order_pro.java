package com.guiguweiserver.eureka_product.domain;

import javax.persistence.*;

@Entity
@Table
public class Order_pro {
    @Id
    @Column
    private int oid;

    @Column
    private String admin_name;

    @OneToOne(targetEntity = Product.class)
    @JoinColumn(referencedColumnName = "pid", name = "o_p_id")
    private Product product;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
