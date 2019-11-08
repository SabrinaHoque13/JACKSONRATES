package com.spartaglobal.ParsingJSON;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class RatesDesirealiser {
    public RatesDTO ratesMapped;

    public RatesDesirealiser(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ratesMapped = objectMapper.readValue(jsonString, RatesDTO.class);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
