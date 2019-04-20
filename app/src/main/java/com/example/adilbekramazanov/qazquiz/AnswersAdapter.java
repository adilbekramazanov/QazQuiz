package com.example.adilbekramazanov.qazquiz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class AnswersAdapter extends RecyclerView.Adapter<AnswersAdapter.AnswerViewHolder> {





    class AnswerViewHolder extends RecyclerView.ViewHolder {

        public Button listItemAnswerView;

        public AnswerViewHolder(@NonNull View itemView) {
            super(itemView);

            listItemAnswerView = itemView.findViewById(R.id.answer_in_recycler_view1);

        }
    }
    private List<AnswerButtonsModel> mAnswers;

    public AnswersAdapter(List<AnswerButtonsModel> answers){
        mAnswers = answers;
    }

    @Override
    public AnswersAdapter.AnswerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View answerView = inflater.inflate(R.layout.answer_in_recyclerview, parent, false);

        // Return a new holder instance
        AnswerViewHolder answerViewHolder = new AnswerViewHolder(answerView);
        return answerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnswerViewHolder answerViewHolder, int i) {
        // Get the data model based on position
        AnswerButtonsModel answer = mAnswers.get(i);

        Button button = answerViewHolder.listItemAnswerView;
        button.setText(answer.getAnswer());

    }

    @Override
    public int getItemCount() {
        return mAnswers.size();
    }
}
