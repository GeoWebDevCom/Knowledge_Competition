package com.example.tolgand.sorular4kids;

/**
 * Created by TolgaND on 23.06.2017.
 */
//For Kids
public class QuestionLibrary {
    private String mQuestions[]={
            "Aşağıdakilerden hangisi örnek bir davranıştır?",
            "Aşağıdakilerden hangisi 5 duyu organımızdan biri değildir?",
            "Dünyamızın uydusu aşağıdakilerden hangisidir?",
            "'Yaşlı' kelimesinin zıt anlamlısı aşağıdakilerden hangisidir?",
            "25+12=Kaçtır?",
            "Türkiye'deki il sayısı kaçtır?",
            "Görme duyu organımız hangisidir?",
            "Yalan söyleyince burnu uzayan masal kahramanı hangisidir?",
            "Türkiye'nin Başkenti hangi şehrimizdir?",
            "Erciyes dağı hangi ilimizdedir?",
            "Paris hangi ülke'nin başkentidir?",
            "Ampulu kim icat etmiştir?",
            "Saatin yelkovanı neyi gösterir?",
            "Şubat ayı kaç yılda bir 29 çeker?",
            "İngiltere hangi kıtadadır?",
            "Bitti!,Çok Yakında Yeni ve Keyifli Sorularla Sizlerleyiz."
    };
    private String mChoices[][]={
            {"Doğru Söylemek","Yalan Konuşmak","Hakaret Etmek"},
            {"Kulak","Göz","Kol"},
            {"Ay","Güneş","Mars"},
            {"Çocuk","Bebek","Genç"},
            {"28","47","37"},
            {"80","81","79"},
            {"Kulak","Burun","Göz"},
            {"Tazmanya Canavarı","Red Kit","Pinokyo"},
            {"Sinop","İstanbul","Ankara"},
            {"Erzurum","Isparta","Kayseri"},
            {"İtalya","Amerika","Fransa"},
            {"Edison","Tesla","Einstein"},
            {"Saniye","Dakika","Saat"},
            {"4","3","2"},
            {"Asya","Avrupa","Afrika"},
            {"","",""}
    };
    private String mCorrectAnswers[]={"Doğru Söylemek","Kol","Ay","Genç","37","81","Göz","Pinokyo","Ankara","Kayseri","Fransa","Edison",
            "Dakika","4","Avrupa",""};

    public String getQuestion(int a){
        String question=mQuestions[a];
        return question;
    }
    public  String getChoice1(int a){
        String choice0=mChoices[a][0];
        return choice0;
    }
    public  String getChoice2(int a){
        String choice1=mChoices[a][1];
        return choice1;
    }
    public  String getChoice3(int a){
        String choice2=mChoices[a][2];
        return choice2;
    }
    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswers[a];
        return answer;
    }


}
