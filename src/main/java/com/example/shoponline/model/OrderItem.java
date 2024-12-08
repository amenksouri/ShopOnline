package com.example.shoponline.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Date;

@Entity
@Table(name="ORDERITEM")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OrderItem {
    @Id
    @GeneratedValue
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product", insertable = false,updatable = false)
    @Fetch(FetchMode.JOIN)
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Column(name="qte")
    private int qte=1;
    public int getQte() {
        return qte;
    }
    public void setQte(int qte) {
        this.qte = qte;
    }

    @Column(name = "prix")
    private double prix;
    public double getPrix() {
        return this.prix;
    }
    public void setPrix(double prix) {
        this.prix=prix;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order", insertable = false,updatable = false)
    @Fetch(FetchMode.JOIN)
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Column(name = "added_date")
    private Date addeddDate;
    public Date getCreatedDate() {
        return addeddDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.addeddDate = createdDate;
    }

}
