package com.jaskiewiczk.campaignCRUD.controller;

import com.jaskiewiczk.campaignCRUD.service.ProductCampaignService;
import com.jaskiewiczk.campaignCRUD.service.SampleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ProductCampaignViewController {
    private final ProductCampaignService productCampaignService;
    private  final SampleUserService sampleUserService;

    @Autowired
    public ProductCampaignViewController(ProductCampaignService productCampaignService, SampleUserService sampleUserService){
        this.productCampaignService = productCampaignService;
        this.sampleUserService = sampleUserService;
    }
    @GetMapping
    public ModelAndView displayProductCampaignHomePage(){
        ModelAndView modelAndView = new ModelAndView("product-campaign");
        modelAndView.addObject("productCampaigns",productCampaignService.getAllProductCampaigns());
        modelAndView.addObject("sampleUser", sampleUserService.getUser());
        return modelAndView;
    }
    @GetMapping("product-campaign/create")
    public ModelAndView displayCreateProductCampaignPage(){
        ModelAndView modelAndView = new ModelAndView("create-product-campaign");
        modelAndView.addObject("sampleUser", sampleUserService.getUser());
        return modelAndView;
    }
    @GetMapping("product-campaign/edit/{id}")
    public ModelAndView displayEditProductCampaignPage(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("edit-product-campaign");
        modelAndView.addObject("sampleUser", sampleUserService.getUser());
        modelAndView.addObject("productCampaign",productCampaignService.getProductCampaign(id));
        modelAndView.addObject("productCampaignKeywords" , String.join(", ", productCampaignService.getProductCampaign(id).getKeywords()));
        return modelAndView;
    }
}
