package com.example.tolgand.sorular4kids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class yetiskinEkrani extends AppCompatActivity {
    private yetiskinQuestions yQuestionLibrary=new yetiskinQuestions();
    private TextView yScoreView;
    private TextView yQuestionView;
    private Button   yButtonChoice1;
    private Button   yButtonChoice2;
    private Button   yButtonChoice3;
    private String   yAnswer;
    private int      yScore=0;
    private int      yQuestionNumber=0;
    Button           yquit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yetiskin_ekrani);
        yScoreView=(TextView)findViewById(R.id.score2);
        yQuestionView=(TextView)findViewById(R.id.question2);
        yButtonChoice1=(Button)findViewById(R.id.ychoice1);
        yButtonChoice2=(Button)findViewById(R.id.ychoice2);
        yButtonChoice3=(Button)findViewById(R.id.ychoice3);
        yquit=(Button)findViewById(R.id.quit2);
        updateQuestion2();//Hazırladığımız Soruları Aktiviteye initial ediyor.

        //quit button
        yquit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
        //Start of Button Listener for Buttons
        yButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yButtonChoice1.getText()==yAnswer){
                    yScore=yScore+1;
                    updateScore2(yScore);
                    updateQuestion2();
                    Toast.makeText(yetiskinEkrani.this,"Tebrikler Doğru Cevap",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(yetiskinEkrani.this,"Malesef Yanlış Cevap",Toast.LENGTH_SHORT).show();
                    updateQuestion2();
                }
            }
        });
        yButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yButtonChoice2.getText()==yAnswer){
                    yScore=yScore+1;
                    updateScore2(yScore);
                    updateQuestion2();
                    Toast.makeText(yetiskinEkrani.this,"Tebrikler Doğru Cevap",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(yetiskinEkrani.this,"Malesef Yanlış Cevap",Toast.LENGTH_SHORT).show();
                    updateQuestion2();
                }

            }
        });
        yButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yButtonChoice3.getText()==yAnswer){
                    yScore=yScore+1;
                    updateScore2(yScore);
                    updateQuestion2();
                    Toast.makeText(yetiskinEkrani.this,"Tebrikler Doğru Cevap",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(yetiskinEkrani.this,"Malesef Yanlış Cevap",Toast.LENGTH_SHORT).show();
                    updateQuestion2();
                }
            }
        });

    }//onCreate Finished


    private void updateQuestion2(){
        yQuestionView.setText(yQuestionLibrary.yGetQuestion(yQuestionNumber));
        yButtonChoice1.setText(yQuestionLibrary.yGetChoice1(yQuestionNumber));
        yButtonChoice2.setText(yQuestionLibrary.yGetChoice2(yQuestionNumber));
        yButtonChoice3.setText(yQuestionLibrary.yGetChoice3(yQuestionNumber));
        yAnswer=yQuestionLibrary.yGetCorrectAnswer(yQuestionNumber);
        yQuestionNumber++;

    }//updateQuestion2 method finished.

    private void updateScore2(int point2){yScoreView.setText(""+yScore);}

















}//all completed
