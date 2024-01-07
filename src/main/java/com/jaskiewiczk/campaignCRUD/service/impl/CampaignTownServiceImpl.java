package com.jaskiewiczk.campaignCRUD.service.impl;

import com.jaskiewiczk.campaignCRUD.model.CampaignTownModel;
import com.jaskiewiczk.campaignCRUD.repository.CampaignTownRepository;
import com.jaskiewiczk.campaignCRUD.service.CampaignTownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class CampaignTownServiceImpl implements CampaignTownService {
    private CampaignTownRepository campaignTownRepository;

    @Autowired
    public CampaignTownServiceImpl(CampaignTownRepository campaignTownRepository){
        this.campaignTownRepository = campaignTownRepository;
    }

    @Override
    public void sampleTownsInit() {

        List<String> sampleTowns = Arrays.asList("Springfield",
                "Willowdale",
                "Maplewood",
                "Rivertown",
                "Harmony",
                "Lakeside",
                "Meadowview",
                "Pleasantville",
                "Cedar Hills",
                "Oceanview");

        for (String town : sampleTowns) {
            CampaignTownModel townEntity = new CampaignTownModel();
            townEntity.setTown(town);
            campaignTownRepository.save(townEntity);
        }

    }

    @Override
    public List<String> getListOfTownsNames() {
        return campaignTownRepository.getTownsNames();
    }
}