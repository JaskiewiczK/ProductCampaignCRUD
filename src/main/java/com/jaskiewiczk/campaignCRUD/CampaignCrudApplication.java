package com.jaskiewiczk.campaignCRUD;

import com.jaskiewiczk.campaignCRUD.service.CampaignKeywordsService;
import com.jaskiewiczk.campaignCRUD.service.CampaignTownService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CampaignCrudApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CampaignCrudApplication.class, args);

        // Initialize tables in the H2 in-memory database for testing purposes.
        // This step includes populating the 'product_campaign_keywords' table.
        CampaignKeywordsService initializationKeywordsService = context.getBean(CampaignKeywordsService.class);
        initializationKeywordsService.sampleKeywordsInit();

        // This step includes populating the 'campaign_towns' table
        CampaignTownService initializationTownsService = context.getBean(CampaignTownService.class);
        initializationTownsService.sampleTownsInit();
    }

}