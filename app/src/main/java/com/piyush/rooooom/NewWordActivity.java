package com.piyush.rooooom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewWordActivity extends AppCompatActivity {
    EditText word;
public static final String EXTRA_REPLY ="extra_reply";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);
        word = findViewById(R.id.edit_word);
    }
    public void save(View v)
    {
        Intent i = new Intent();
        i.putExtra(EXTRA_REPLY, word.getText().toString());
        setResult(RESULT_OK,i);
        finish();
    }
}
