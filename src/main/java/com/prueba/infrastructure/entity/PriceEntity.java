package com.prueba.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "prices")
@Data
@AllArgsConstructor
public class PriceEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer brandId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String priceList;
    private Integer productId;
    private Integer priority;
    private BigDecimal price;
    private String curr;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
}