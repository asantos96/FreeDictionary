package com.detroitlabs.FreeDictionary.service;

import com.detroitlabs.FreeDictionary.model.MainDictionary;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class DictionaryService {


    //JSON starts with a blank list
        public MainDictionary[] retrieveDictionaryData(String userEnteredWord){
            RestTemplate restTemplate = new RestTemplate();
            //Looks within this URL and coordinates what class it should be pulled into
            return restTemplate.getForObject("https://api.dictionaryapi.dev/api/v2/entries/en/" + userEnteredWord
                    , MainDictionary[].class);
        }
}
