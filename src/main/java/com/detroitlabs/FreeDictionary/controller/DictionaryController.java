package com.detroitlabs.FreeDictionary.controller;

import com.detroitlabs.FreeDictionary.model.MainDictionary;
import com.detroitlabs.FreeDictionary.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    //autowire instantiates this for me
    @Autowired
    private DictionaryService dictionaryService;

    @RequestMapping("/")
    public void testDefinition (){
        MainDictionary[] test = dictionaryService.retrieveDictionaryData("run");
        //
        System.out.println(test[0].getMeanings().get(1).getDefinitions().get(2).getDefinition());
    }

//    @RequestMapping("/search")
//    public String searchResult (@RequestParam("searchinput") String wordEntered, ModelMap modelMap){
//        MainDictionary[] userWordEntered = dictionaryService.retrieveDictionaryData(wordEntered);
//        modelMap.put("dictionaryKey", userWordEntered);
//        return "home";
//    }
}