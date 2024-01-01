package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fibonacci extends AppCompatActivity {

    private long f1 = 0;
    private long f2 = 1;
    private long currentFib = 0;
    private TextView mShowFibonacci;
    private long i = 0;
    private  long n = 0;
    private long limit = 0;
    private EditText mLimitInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
        mShowFibonacci = findViewById(R.id.show_count);
        mLimitInput = findViewById(R.id.limit_input);
    }

    public void countFibonacci(View view) {
        if (mLimitInput.getText().toString().isEmpty()) {
            Toast.makeText(this, "Pilih Angka Pada Enter Limit", Toast.LENGTH_SHORT).show();
            return;
        }

        limit = Long.parseLong(mLimitInput.getText().toString());

        if (n >= limit) {
            Toast.makeText(this, "Deret Angka Fibonacci Telah Mencapai Batas", Toast.LENGTH_SHORT).show();
            return;
        }

        long newFib = f1 + f2;
        f2 = f1;
        f1 = newFib;
        currentFib = newFib;
        n++;

        updateFibonacciDisplay();
    }

    public void showFibonacci(View view) {
        Toast toast = Toast.makeText(this, R.string.fibonacci_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void resetFibonacci(View view) {
        currentFib = 0;
        f2 = 1;
        f1 = 0;
        limit = 0;
        n = 0;
        mLimitInput.setText("");
        updateFibonacciDisplay();
    }

    private void updateFibonacciDisplay() {
        if (mShowFibonacci != null) {
            mShowFibonacci.setText(Long.toString(currentFib));
            mShowFibonacci.setTextColor(getFibonacciColor());

        }
    }

    private int getFibonacciColor() {
        i++;
        if (i % 2 == 0) {
            return ContextCompat.getColor(this, R.color.hijau_base);
        } else {
            return ContextCompat.getColor(this, R.color.red_tiktok);
        }
    }

}
