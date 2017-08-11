package com.example.tolgand.sorular4kids;

/**
 * Created by TolgaND on 24.06.2017.
 */

public class yetiskinQuestions {
    private String yQuestions[]={
            "“Sinekli Bakkal” Romanının Yazarı Aşağıdakilerden Hangisidir? ",
            "Aşağıdakilerden Hangisi Yazıyı İcat Etmiştir? ",
            "Tsunami Felaketinde En Fazla Zarar Gören Güney Asya Ülkesi?",
            "2003'de Euro Vizyona Katılan Sanatçımız Kimdir? ",
            "Hangisi Dünya Sağlık Örgütünün Kısaltılmış İsmidir? ",
            "Romen Rakamında Hangi Sayı Yoktur?",
            "Hangi Ülkenin İki Tane Başkenti Vardır? ",
            "Aspirinin Hammaddesi Nedir? ",
            "Bitti!,Çok Yakında Yeni ve Zor Sorularla Sizlerleyiz."
    };

    private String yChoices[][]={
            {"Reşat Nuri Güntekin","Halide Edip Adıvar"," Ziya Gökalp"},
            {"Hititler","Elamlar","Sümerler"},
            {"Endonezya","Srilanka","Tayland "},
            {"Grup Athena","Sertap Erener","Ajda Pekkan"},
            {"Uhw","Unıcef","Who"},
            {"0","50","100"},
            {"Güney Afrika","El Salvador","Kamboçya"},
            {"Söğüt","Köknar","Meşe"},
            {"","",""}

    };

    private String yCorrectAnswer[]={"Halide Edip Adıvar","Sümerler","Endonezya","Sertap Erener","Who","0","Güney Afrika","Söğüt",""};

    public String yGetQuestion(int b){
        String yQuestion=yQuestions[b];
        return yQuestion;
    }
    public String yGetChoice1(int b){
        String yChoice0=yChoices[b][0];
        return yChoice0;
    }
    public String yGetChoice2(int b){
        String yChoice1=yChoices[b][1];
        return yChoice1;
    }
    public String yGetChoice3(int b){
        String yChoice2=yChoices[b][2];
        return yChoice2;
    }
    public String yGetCorrectAnswer(int b){
        String yAnswer=yCorrectAnswer[b];
        return yAnswer;
    }



}//yQuestions Finished.
