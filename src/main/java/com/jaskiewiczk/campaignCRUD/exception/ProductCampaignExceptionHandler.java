package com.jaskiewiczk.campaignCRUD.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductCampaignExceptionHandler {


    @ExceptionHandler(value = {ProductCampaignNotFoundException.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException
            (ProductCampaignNotFoundException cloudVendorNotFoundException)
    {
        ProductCampaignException cloudVendorException = new ProductCampaignException(
                cloudVendorNotFoundException.getMessage(),
                cloudVendorNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(cloudVendorException, HttpStatus.NOT_FOUND);
    }

}
