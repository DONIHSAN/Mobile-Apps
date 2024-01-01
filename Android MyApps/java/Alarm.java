package com.example.sayhello;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Alarm extends AppCompatActivity {

    Button button_Alarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        setLayout();
        setClick();

    }

    void setLayout(){

        button_Alarm = (Button) findViewById(R.id.button_Alarm);
    }

    void setClick(){
        button_Alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Get Up !");
                intent.putExtra(AlarmClock.EXTRA_HOUR, 10);
                intent.putExtra(AlarmClock.EXTRA_MINUTES, 30);
                intent.putExtra(AlarmClock.EXTRA_SKIP_UI, false);
                startActivity(intent);

            }
        });
    }
}
