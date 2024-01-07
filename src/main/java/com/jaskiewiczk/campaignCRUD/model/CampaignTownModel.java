package com.jaskiewiczk.campaignCRUD.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="product_campaign_towns")
public class CampaignTownModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String town;
}
