package com.jaskiewiczk.campaignCRUD.service;

import com.jaskiewiczk.campaignCRUD.model.ProductCampaignModel;

import java.util.List;

public interface ProductCampaignService {
    public String createProductCampaign(ProductCampaignModel productCampaignModel);
    public String updateProductCampaign(ProductCampaignModel productCampaignModel);
    public String deleteProductCampaign(Long id);
    public ProductCampaignModel getProductCampaign(Long id);

    public List<ProductCampaignModel> getAllProductCampaigns();

    public String startProductCampaign(ProductCampaignModel productCampaignModel);
}