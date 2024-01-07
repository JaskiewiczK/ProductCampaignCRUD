package com.jaskiewiczk.campaignCRUD.exception;

public class ProductCampaignNotFoundException extends RuntimeException{
    public ProductCampaignNotFoundException(String message) {
        super(message);
    }

    public ProductCampaignNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
