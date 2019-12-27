package com.example.practice.ui.main.First;

public class Dictionary {
    private String Id;
    private String English;
    private String Korean;


    public Dictionary(String id, String english, String korean) {
        this.Id = id;
        this.English = english;
        this.Korean = korean;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }

    public String getKorean() {
        return Korean;
    }

    public void setKorean(String korean) {
        Korean = korean;
    }
}
