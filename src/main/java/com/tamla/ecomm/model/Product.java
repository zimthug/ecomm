package com.tamla.ecomm.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 *
 * @author Mlangeni
 */
@Data
@Entity
@Table(name = "products")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_id")
    private Long productId;

    @Size(max = 100)
    @Column(name = "product_name")
    private String productName;

    @Min(value=1)
    @Max(value=99999)
    @Column(name = "price")
    private double price;

    @Min(value=1)
    @Max(value=99999)
    @Column(name = "stock_level")
    private int stockLevel;

}
