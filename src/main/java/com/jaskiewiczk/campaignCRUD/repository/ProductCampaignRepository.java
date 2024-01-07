package com.jaskiewiczk.campaignCRUD.repository;

import com.jaskiewiczk.campaignCRUD.model.ProductCampaignModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCampaignRepository extends JpaRepository<ProductCampaignModel, Long> {

}
