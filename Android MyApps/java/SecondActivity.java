package com.example.sayhello;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    public static final String EXTRA_REPLY = "com.example.android.sayhello.extra.REPLY";

    private EditText mReply;


    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_dua);

        mReply = findViewById(R.id.editText_second);

        Intent muncul = getIntent();
        String isisurat = muncul.getStringExtra(FirstActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.text_message);
        textView.setText(isisurat);

    }

    public void returnReply(View view){
        String bales = mReply.getText().toString();
        Intent balesIntent = new Intent();

        balesIntent.putExtra(EXTRA_REPLY, bales);

        setResult(RESULT_OK, balesIntent);
        finish();
    }

}
