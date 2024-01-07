package com.jaskiewiczk.campaignCRUD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import lombok.Data;


import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "product_campaigns")
public class ProductCampaignModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private List<String> keywords;

    private BigDecimal bidAmount;

    private BigDecimal campaignFund;

    private boolean status;

    private String town;

    private int radius;

}