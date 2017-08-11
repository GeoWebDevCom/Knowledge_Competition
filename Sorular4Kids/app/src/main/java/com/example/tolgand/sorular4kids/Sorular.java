package com.example.tolgand.sorular4kids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Sorular extends AppCompatActivity {
    private QuestionLibrary mQuestionLibrary=new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button   mButtonChoice1;
    private Button   mButtonChoice2;
    private Button   mButtonChoice3;
    private String   mAnswer;
    private int      mScore=0;
    private int      mQuestionNumber=0;
    Button           quit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorular);
        mScoreView=(TextView)findViewById(R.id.score);
        mQuestionView=(TextView)findViewById(R.id.question);
        mButtonChoice1=(Button)findViewById(R.id.choice1);
        mButtonChoice2=(Button)findViewById(R.id.choice2);
        mButtonChoice3=(Button)findViewById(R.id.choice3);
        quit=(Button)findViewById(R.id.quit);
        updateQuestion();

        //quit button starts.
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });//end quit

        //Start of Button Listener for Buttons
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonChoice1.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(Sorular.this,"Tebrikler Doğru Cevap",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Sorular.this,"Malesef Yanlış Cevap",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonChoice2.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(Sorular.this,"Tebrikler Doğru Cevap",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Sorular.this,"Malesef Yanlış Cevap",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonChoice3.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(Sorular.this,"Tebrikler Doğru Cevap",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Sorular.this,"Malesef Yanlış Cevap",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });//End of Button Listener for Buttons
    }//Oncreate Finished


    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mAnswer=mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }

    private void updateScore(int point){
        mScoreView.setText(""+mScore);
    }

}
