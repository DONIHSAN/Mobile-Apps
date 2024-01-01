package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_Version_1 extends AppCompatActivity {

    Button btn_project1;
    Button btn_project2;
    Button btn_project3;
    Button btn_project4;
    Button btn_project5;
    Button btn_project6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_version1);

        setLayout();
        setClick();

    }

    void setLayout(){
        btn_project1 = (Button) findViewById(R.id.btn_project1);
        btn_project2 = (Button) findViewById(R.id.btn_project2);
        btn_project3 = (Button) findViewById(R.id.btn_project3);
        btn_project4 = (Button) findViewById(R.id.btn_project4);
        btn_project5 = (Button) findViewById(R.id.btn_project5);
        btn_project6 = (Button) findViewById(R.id.btn_project6);
    }

    void setClick(){
        btn_project1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSatu = new Intent(MainActivity_Version_1.this, Hello.class);
                startActivity(intentSatu);

            }
        });

        btn_project2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDua = new Intent(MainActivity_Version_1.this, ScrollSianida.class);
                startActivity(intentDua);
            }
        });

        btn_project3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentThree = new Intent(MainActivity_Version_1.this, Count.class);
                startActivity(intentThree);
            }
        });

        btn_project4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFour = new Intent(MainActivity_Version_1.this, FirstActivity.class);
                startActivity(intentFour);
            }
        });

        btn_project5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFive = new Intent(MainActivity_Version_1.this, Alarm.class);
                startActivity(intentFive);
            }
        });

        btn_project6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMaps = new Intent(Intent.ACTION_VIEW);
                intentMaps.setData(Uri.parse("geo:-6.2473867,107.0858723?z=15"));

                if (intentMaps.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentMaps);
                }

            }
        });
    }
}