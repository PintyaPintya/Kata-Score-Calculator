package com.example.kata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText judge1, judge2, judge3, judge4, judge5;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        judge1 = findViewById(R.id.j1);
        judge2 = findViewById(R.id.j2);
        judge3 = findViewById(R.id.j3);
        judge4 = findViewById(R.id.j4);
        judge5 = findViewById(R.id.j5);
        tvResult = findViewById(R.id.tv_Result);
    }

    public void buttonCalculate(View view) {
        float n1 = Float.parseFloat((judge1.getText().toString()));
        float n2 = Float.parseFloat((judge2.getText().toString()));
        float n3 = Float.parseFloat((judge3.getText().toString()));
        float n4 = Float.parseFloat((judge4.getText().toString()));
        float n5 = Float.parseFloat((judge5.getText().toString()));

        float max;
        float max1 = Math.max(n1,n2);
        float max3 = Math.max(max1,n5);
        float max2 = Math.max(n3,n4);
        max = Math.max(max3, max2);
        float min;
        float min1 = Math.min(n1,n2);
        float min3 = Math.min(min1,n5);
        float min2 = Math.min(n3,n4);
        min = Math.min(min3, min2);

        float result = n1 + n2 + n3 + n4 + n5 - max - min;
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        tvResult.setText(String.valueOf(decimalFormat.format(result)));
    }

    public void buttonReset(View view) {
        judge1.setText("");
        judge2.setText("");
        judge3.setText("");
        judge4.setText("");
        judge5.setText("");
        tvResult.setText("0");
    }
}