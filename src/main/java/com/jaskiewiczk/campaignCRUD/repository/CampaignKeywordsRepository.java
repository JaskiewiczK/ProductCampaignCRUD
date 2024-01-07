package com.jaskiewiczk.campaignCRUD.repository;

import com.jaskiewiczk.campaignCRUD.model.CampaignKeywordsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignKeywordsRepository extends JpaRepository<CampaignKeywordsModel, Long> {
    @Query("SELECT keyword FROM CampaignKeywordsModel WHERE LOWER(keyword) LIKE LOWER(CONCAT(:prefix, '%'))")
    public List<String> findKeywordsByPrefixWithIgnoreCase(@Param("prefix") String prefix);
}