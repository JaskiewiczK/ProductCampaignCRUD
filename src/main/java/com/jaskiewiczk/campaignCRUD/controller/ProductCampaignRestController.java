package com.jaskiewiczk.campaignCRUD.controller;

import com.jaskiewiczk.campaignCRUD.model.ProductCampaignModel;
import com.jaskiewiczk.campaignCRUD.service.ProductCampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@EnableAutoConfiguration
@RestController
@RequestMapping("/api/product-campaign")
public class ProductCampaignRestController {
    private final ProductCampaignService productCampaignService;
    @Autowired
    public ProductCampaignRestController(ProductCampaignService productCampaignService){
        this.productCampaignService = productCampaignService;
    }
    @PostMapping("/")
    public String createProductCampaign(@RequestBody ProductCampaignModel productCampaignModel){
        return productCampaignService.createProductCampaign(productCampaignModel);
    }

    @PutMapping("/{id}")
    public String updateProductCampaign(@RequestBody ProductCampaignModel productCampaignModel){
        return  productCampaignService.updateProductCampaign(productCampaignModel);
    }

    @PutMapping("/payment/{id}")
    public String startProductCampaign(@RequestBody ProductCampaignModel productCampaignModel){
        return  productCampaignService.startProductCampaign(productCampaignModel);
    }

    @GetMapping("/{id}")
    public ProductCampaignModel getProductCampaign(@PathVariable Long id){
        return productCampaignService.getProductCampaign(id);
    }
    @DeleteMapping("/{id}")
    public String deleteProductCampaign(@PathVariable Long id){
        return productCampaignService.deleteProductCampaign(id);
    }
}
