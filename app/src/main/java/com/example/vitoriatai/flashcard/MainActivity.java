package com.example.vitoriatai.flashcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);

            }
        });

        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.choice_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choice_one).setBackgroundColor(
                        getResources().getColor(R.color.red, null));
                findViewById(R.id.choice_two).setBackgroundColor(
                        getResources().getColor(R.color.green, null));
            }
        });

        findViewById(R.id.choice_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choice_two).setBackgroundColor(
                        getResources().getColor(R.color.green, null));
            }
        });

        findViewById(R.id.choice_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choice_three).setBackgroundColor(
                        getResources().getColor(R.color.red, null));
                findViewById(R.id.choice_two).setBackgroundColor(
                        getResources().getColor(R.color.green, null));
            }
        });

        findViewById(R.id.rootview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choice_one).setBackgroundColor(
                        getResources().getColor(R.color.orange));
                findViewById(R.id.choice_two).setBackgroundColor(
                        getResources().getColor(R.color.orange));
                findViewById(R.id.choice_three).setBackgroundColor(
                        getResources().getColor(R.color.orange));
            }
        });

        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isShowingAnswers = true;
                findViewById(R.id.choice_one).setVisibility(View.INVISIBLE);
                findViewById(R.id.choice_two).setVisibility(View.INVISIBLE);
                findViewById(R.id.choice_three).setVisibility(View.INVISIBLE);
                ((ImageView) findViewById(R.id.toggle_choices_visibility)).setImageResource(R.drawable.eyeclosed);

            }
        });


    }
}
