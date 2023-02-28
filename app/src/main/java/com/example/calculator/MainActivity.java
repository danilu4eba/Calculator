package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textview;
    private Integer x, y;
    private Boolean isOperationClick;
    private Boolean isOperationPlus = false;
    private Boolean isOperationDelenie = false;
    private Boolean isOperationMinus = false;
    private Boolean isOperationX = false;


    private Integer result;
    private Double resultDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.tv_rezult);
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                x = Integer.valueOf(textview.getText().toString());
                isOperationPlus = true;
                isOperationMinus = false;
                isOperationDelenie = false;
                isOperationX = false;
                break;
            case R.id.btn_plusminus:
                break;
            case R.id.btn_percent:
                break;
            case R.id.btn_minus:
                x = Integer.valueOf(textview.getText().toString());
                isOperationMinus = true;
                isOperationPlus = false;
                isOperationDelenie = false;
                isOperationX = false;
                break;
            case R.id.btn_delenie:
                x = Integer.valueOf(textview.getText().toString());
                isOperationDelenie = true;
                isOperationPlus = false;
                isOperationMinus = false;
                isOperationX = false;
                break;

            case R.id.btn_x:
                x = Integer.valueOf(textview.getText().toString());
                isOperationX = true;
                isOperationPlus = false;
                isOperationMinus = false;
                isOperationDelenie = false;

                break;
            case R.id.btn_ravno:
                y = Integer.valueOf(textview.getText().toString());

                if (isOperationPlus == true) {
                    result = x + y;
                    textview.setText(result.toString());

                } else if (isOperationMinus == true) {


                    result = x - y;
                    textview.setText(result.toString());

                } else if (isOperationDelenie == true) {
                    Double x2 = Double.valueOf(x);
                    Double y2 = Double.valueOf(y);
                    resultDouble = x2 / y2;
                    textview.setText(resultDouble.toString());


                } else if (isOperationX == true) {
                    result = x * y;
                    textview.setText(result.toString());
                }



                break;
        }
        isOperationClick = true;
    }


    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_nul:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("0");
                } else {
                    textview.append("0");
                }
                break;
            case R.id.btn_1:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("1");
                } else {
                    textview.append("1");
                }
                break;
            case R.id.btn_2:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("2");
                } else {
                    textview.append("2");
                }
                break;
            case R.id.btn_3:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("3");
                } else {
                    textview.append("3");
                }
                break;
            case R.id.btn_4:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("4");
                } else {
                    textview.append("4");
                }
                break;
            case R.id.btn_5:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("5");
                } else {
                    textview.append("5");
                }
                break;
            case R.id.btn_6:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("6");
                } else {
                    textview.append("6");
                }
                break;
            case R.id.btn_7:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("7");
                } else {
                    textview.append("7");
                }
                break;
            case R.id.btn_8:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("8");
                } else {
                    textview.append("8");
                }
                break;
            case R.id.btn_9:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("9");
                } else {
                    textview.append("9");
                }
                break;

            case R.id.btn_ac:
                textview.setText("0");
                break;

        }
        isOperationClick = false;
    }
}