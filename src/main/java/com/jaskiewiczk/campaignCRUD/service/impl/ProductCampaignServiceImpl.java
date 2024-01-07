package com.jaskiewiczk.campaignCRUD.service.impl;

import com.jaskiewiczk.campaignCRUD.exception.ProductCampaignNotFoundException;
import com.jaskiewiczk.campaignCRUD.model.ProductCampaignModel;
import com.jaskiewiczk.campaignCRUD.repository.ProductCampaignRepository;
import com.jaskiewiczk.campaignCRUD.service.ProductCampaignService;
import com.jaskiewiczk.campaignCRUD.service.SampleUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductCampaignServiceImpl implements ProductCampaignService {


    private final ProductCampaignRepository productCampaignRepository;
    private  final SampleUserService sampleUserService;

    @Autowired
    public ProductCampaignServiceImpl(ProductCampaignRepository productCampaignRepository, SampleUserService sampleUserService){
        this.productCampaignRepository = productCampaignRepository;
        this.sampleUserService = sampleUserService;
    }
    @Override
    public String createProductCampaign(ProductCampaignModel productCampaignModel) {
        productCampaignRepository.save(productCampaignModel);
        return "Create success";
    }

    @Override
    public String updateProductCampaign(ProductCampaignModel productCampaignModel) {
        productCampaignRepository.save(productCampaignModel);
        return "Update success";
    }

    @Override
    public String deleteProductCampaign(Long id) {
        productCampaignRepository.deleteById(id);
        return "Delete success";
    }

    @Override
    public ProductCampaignModel getProductCampaign(Long id) {
        if(productCampaignRepository.findById(id).isEmpty()){
            throw new ProductCampaignNotFoundException("Requested product campaign does not exist");
        }
        return productCampaignRepository.findById(id).get();
    }

    @Override
    public List<ProductCampaignModel> getAllProductCampaigns() {
        return productCampaignRepository.findAll();
    }

    @Transactional
    @Override
    public String startProductCampaign(ProductCampaignModel productCampaignModel) {
        if(sampleUserService.isUserAbleToPay(productCampaignModel.getCampaignFund())){
            productCampaignRepository.save(productCampaignModel);
            sampleUserService.withdrawFunds(productCampaignModel.getCampaignFund());
            return "Success";
        }
        return "User is not able to pay";
    }
}