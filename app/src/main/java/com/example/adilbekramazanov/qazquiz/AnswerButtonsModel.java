package com.example.adilbekramazanov.qazquiz;

import java.util.ArrayList;

public class AnswerButtonsModel {

    private String mAnswerOption;

    public AnswerButtonsModel(String answerOption){
        mAnswerOption = answerOption;
    }

    public String getAnswer(){
        return mAnswerOption;
    }

    private static int  lastAnswerId = 0;

   public static ArrayList<AnswerButtonsModel> createAnswersList() {
       ArrayList<AnswerButtonsModel> answers = new ArrayList<AnswerButtonsModel>();

       return answers;
   }
}

