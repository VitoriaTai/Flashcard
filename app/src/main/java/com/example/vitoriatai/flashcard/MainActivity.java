package com.example.vitoriatai.flashcard;

import android.content.Intent;
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

        findViewById(R.id.invisible).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choice_one).setVisibility(View.INVISIBLE);
                findViewById(R.id.choice_two).setVisibility(View.INVISIBLE);
                findViewById(R.id.choice_three).setVisibility(View.INVISIBLE);
                ((ImageView) findViewById(R.id.invisible)).setImageResource(R.drawable.eyeclosed);
                findViewById(R.id.invisible).setVisibility(View.INVISIBLE);
                findViewById(R.id.visibility).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.choice_one).setVisibility(View.VISIBLE);
                findViewById(R.id.choice_two).setVisibility(View.VISIBLE);
                findViewById(R.id.choice_three).setVisibility(View.VISIBLE);
                ((ImageView) findViewById(R.id.visibility)).setImageResource(R.drawable.eyeopen);
                findViewById(R.id.visibility).setVisibility(View.INVISIBLE);
                findViewById(R.id.invisible).setVisibility(View.VISIBLE);

            }
        });

        findViewById(R.id.myButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddCardActivity.class);
                MainActivity.this.startActivityForResult(intent, 100);
                ((ImageView) findViewById(R.id.myButton)).setImageResource(R.drawable.plussign);
            }
        });

    }

   // @Override
    //protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //if (requestCode == 100) {
            //String question = data.getExtras().getString("question");
            //String answer = data.getExtras().getString("answer");


}
