package com.jaskiewiczk.campaignCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CampaignCrudApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CampaignCrudApplication.class, args);
    }

}