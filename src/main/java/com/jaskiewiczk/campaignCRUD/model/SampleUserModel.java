package com.jaskiewiczk.campaignCRUD.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Component
public class SampleUserModel {
    private String username = "Sample user";
    private BigDecimal funds = BigDecimal.valueOf(1000.00);
}