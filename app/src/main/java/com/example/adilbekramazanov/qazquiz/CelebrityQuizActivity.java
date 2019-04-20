package com.example.adilbekramazanov.qazquiz;


//This class is still under development..


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class CelebrityQuizActivity extends AppCompatActivity {
    private RecyclerView answerslist;
    private AnswersAdapter answersAdapter;
    TextView questionTextView;
    ArrayList<AnswerButtonsModel> answers;

    public int Counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_celebrity_quiz);
        // Look up for the recycler view in activity layout
        RecyclerView rvAnswers = (RecyclerView) findViewById(R.id.recycler_view_answers);
//
        // Initialize answers
        answers = AnswerButtonsModel.createAnswersList();


//         Create the adapter
        AnswersAdapter adapter = new AnswersAdapter(answers);
        // Attach the adapter to the recycler view to populate items
        rvAnswers.setAdapter(adapter);
        // Set layout manager to position the items
        rvAnswers.setLayoutManager(new LinearLayoutManager(this));

        questionTextView = findViewById(R.id.question_text_view_celeb_test);

        Counter = 0;

        nextQuestion();


        rvAnswers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextQuestion();
            }
        });


    }

    public void rvClicked(View view){
        nextQuestion();
    }

    public void nextQuestion() {
        answers.clear();
        if (Counter == 0) {
            questionTextView.setText("Сколько вам лет");
            answers.add(0, new AnswerButtonsModel("до 13"));
            answers.add(0, new AnswerButtonsModel("13 - 24"));
            answers.add(0, new AnswerButtonsModel("25 - 36"));
            answers.add(0, new AnswerButtonsModel("37 - 48"));
            answers.add(0, new AnswerButtonsModel("49 и старше"));
            Counter++;

        }
        else if (Counter == 1){
            questionTextView.setText("Любите ли вы сладкое?");
            answers.add(0, new AnswerButtonsModel("Да"));
            answers.add(0, new AnswerButtonsModel("Нет"));

        }
    }
}
