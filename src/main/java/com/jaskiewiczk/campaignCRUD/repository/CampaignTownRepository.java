package com.jaskiewiczk.campaignCRUD.repository;

import com.jaskiewiczk.campaignCRUD.model.CampaignTownModel;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Table(name="campaign_towns")
public interface CampaignTownRepository extends JpaRepository<CampaignTownModel, Long> {
    @Query("SELECT town FROM CampaignTownModel")
    public List<String> getTownsNames();
}