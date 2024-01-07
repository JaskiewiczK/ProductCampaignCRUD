package com.jaskiewiczk.campaignCRUD.service;

import java.util.List;

public interface CampaignKeywordsService {
    public void sampleKeywordsInit();
    public List<String> getMatchingKeywords(String prefix);
}