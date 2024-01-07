package com.jaskiewiczk.campaignCRUD.service.impl;

import com.jaskiewiczk.campaignCRUD.model.CampaignKeywordsModel;
import com.jaskiewiczk.campaignCRUD.repository.CampaignKeywordsRepository;
import com.jaskiewiczk.campaignCRUD.service.CampaignKeywordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class CampaignKeywordsServiceImpl implements CampaignKeywordsService {

    private final CampaignKeywordsRepository campaignKeywordsRepository;


    @Autowired
    public CampaignKeywordsServiceImpl(CampaignKeywordsRepository campaignKeywordsRepository){
        this.campaignKeywordsRepository = campaignKeywordsRepository;
    }

    @Override
    public void sampleKeywordsInit() {
        List<String> sampleKeywords = Arrays.asList("Advertising tactics", "Audience targeting",
                "Brand promotion", "Buzz marketing",
                "Campaign performance analysis", "Creative ad content",
                "Digital advertising strategies", "Demonstrations",
                "Email marketing campaigns", "Experiential marketing",
                "Flash sales", "Funnel optimization",
                "Guerrilla marketing", "Geo-targeting",
                "Guerrilla promotions", "Holiday promotions",
                "Influencer collaborations", "Integrated marketing",
                "Joint promotions", "Jingle marketing",
                "Keyword targeting", "Customer loyalty",
                "Limited-time offers", "Landing page optimization",
                "Multi-channel campaigns", "Mobile advertising",
                "Native advertising", "New product launch",
                "Product launch strategy", "Offer optimization",
                "Product marketing", "Promotional events",
                "Quality campaigns", "Quantitative analysis",
                "Retargeting campaigns", "ROI tracking",
                "Social media promotion", "Sales optimization",
                "Target audience engagement", "Testimonials",
                "User-generated content (UGC)", "Upselling strategies",
                "Viral campaigns", "Video marketing",
                "Website optimization", "Word-of-mouth promotion",
                "Cross-channel marketing", "eXperience-driven campaigns",
                "Year-end promotions", "YouTube advertising",
                "Zero-cost promotions", "Zenith of marketing");


        for (String keyword : sampleKeywords) {
            CampaignKeywordsModel keywordEntity = new CampaignKeywordsModel();
            keywordEntity.setKeyword(keyword);
            campaignKeywordsRepository.save(keywordEntity);
        }
    }

    @Override
    public List<String> getMatchingKeywords(String prefix) {
        return campaignKeywordsRepository.findKeywordsByPrefixWithIgnoreCase(prefix);
    }
}
