package com.jaskiewiczk.campaignCRUD.controller;

import com.jaskiewiczk.campaignCRUD.service.CampaignTownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/campaign-towns")
public class CampaignTownRestController {
    private final CampaignTownService campaignTownService;
    @Autowired
    public CampaignTownRestController(CampaignTownService campaignTownService){
        this.campaignTownService = campaignTownService;
    }
    @GetMapping
    public List<String> getTownsNames(){
        return  campaignTownService.getListOfTownsNames();
    }
}
