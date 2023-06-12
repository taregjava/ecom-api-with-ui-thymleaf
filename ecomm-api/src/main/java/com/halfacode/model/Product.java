package com.halfacode.model;

import com.halfacode.util.DateTimeUtil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
public class Product {

    public Product() {
        this.created = DateTimeUtil.createCurrentDateAsString();
    }
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "PR_KEY")
    private String id;
    private String reference;
    private String name;
    private String description;
    private BigDecimal price;
    private Set<String> categories;
    //private List<Review> reviews = new ArrayList<>();
    private String created;


}
