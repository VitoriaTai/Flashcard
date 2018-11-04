package com.example.vitoriatai.flashcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.exitButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                ((ImageView) findViewById(R.id.exitButton)).setImageResource(R.drawable.xmark);
            }
        });

        findViewById(R.id.saveButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((EditText) findViewById(R.id.editText)).getText().toString();
                ((EditText) findViewById(R.id.editText2)).getText().toString();
                ((ImageView) findViewById(R.id.saveButton)).setImageResource(R.drawable.save);
            }
        });

        //Intent data = new Intent(AddCardActivity.this, MainActivity.class);
        //data.putExtra("question", "editText"); // puts one string into the Intent, with the key as 'string1'
        //data.putExtra("answer", "editText2"); // puts another string into the Intent, with the key as 'string2
        //setResult(RESULT_OK, data);
        //finish();

    }
}
