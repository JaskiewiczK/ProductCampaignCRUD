package com.jaskiewiczk.campaignCRUD.controller;

import com.jaskiewiczk.campaignCRUD.service.CampaignKeywordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/campaign-keywords")
public class CampaignKeywordsRestController {
    private final CampaignKeywordsService campaignKeywordsService;
    @Autowired
    public CampaignKeywordsRestController(CampaignKeywordsService campaignKeywordsService){
        this.campaignKeywordsService = campaignKeywordsService;
    }

    @GetMapping("/{prefix}")
    public List<String> getMatchingKeywords(@PathVariable String prefix){
        return campaignKeywordsService.getMatchingKeywords(prefix);
    }
}
