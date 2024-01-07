package com.jaskiewiczk.campaignCRUD.service.impl;

import com.jaskiewiczk.campaignCRUD.model.SampleUserModel;
import com.jaskiewiczk.campaignCRUD.service.SampleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class SampleUserServiceImpl implements SampleUserService {

    private final SampleUserModel sampleUserModel;
    @Autowired
    public SampleUserServiceImpl(SampleUserModel sampleUserModel){
        this.sampleUserModel = sampleUserModel;
    }

    @Override
    public SampleUserModel getUser() {
        return sampleUserModel;
    }

    @Override
    public boolean isUserAbleToPay(BigDecimal price) {
        return sampleUserModel.getFunds().compareTo(price) >= 0;
    }

    @Override
    public void withdrawFunds(BigDecimal amount) {
        sampleUserModel.setFunds(sampleUserModel.getFunds().subtract(amount));
    }
}
