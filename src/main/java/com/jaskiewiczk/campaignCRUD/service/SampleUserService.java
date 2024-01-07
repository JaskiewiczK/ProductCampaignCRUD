package com.jaskiewiczk.campaignCRUD.service;

import com.jaskiewiczk.campaignCRUD.model.SampleUserModel;

import java.math.BigDecimal;

public interface SampleUserService {
    public SampleUserModel getUser();
    public boolean isUserAbleToPay(BigDecimal price);
    public void withdrawFunds(BigDecimal amount);
}