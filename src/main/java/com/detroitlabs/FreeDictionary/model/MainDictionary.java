package com.detroitlabs.FreeDictionary.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//parent level to host giant arraylist
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class MainDictionary {

    private List<Meaning> meanings = new ArrayList<>();
    private String word;


    public List<Meaning> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<Meaning> meanings) {
        this.meanings = meanings;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
