package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity  extends  AppCompatActivity {

    CardView card1, card2, card3, card4;
    CardView card5, card6, card7;
    CardView card8, card9, card10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setLayout();
        setClick();

    }

    void setLayout() {
        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);
        card4 = (CardView) findViewById(R.id.card4);
        card5 = (CardView) findViewById(R.id.card5);
        card6 = (CardView) findViewById(R.id.card6);
        card7 = (CardView) findViewById(R.id.card7);
        card8 = (CardView) findViewById(R.id.card8);
    }

    void setClick() {
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHello = new Intent(MainActivity.this, Hello.class);
                startActivity(intentHello);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCount = new Intent(MainActivity.this, Count.class);
                startActivity(intentCount);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCase = new Intent(MainActivity.this, ScrollSianida.class);
                startActivity(intentCase);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTwoActivity = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intentTwoActivity);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAlarm = new Intent(MainActivity.this, Alarm.class);
                startActivity(intentAlarm);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMaps = new Intent(MainActivity.this, Maps.class);
                startActivity(intentMaps);
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFragment = new Intent(MainActivity.this, Fragment.class);
                startActivity(intentFragment);
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFibonacci = new Intent(MainActivity.this, Fibonacci.class);
                startActivity(intentFibonacci);

            }
        });
    }
}
