package com.e.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


        TextView etDisplay;
        Button etOne, etTwo, etThree, etFour, etFive, etSix, etSeven, etEight, etNine, etZero, etSum, etSub, etAnswer, etDot, etMul, etDiv;
        Boolean var1, var2;
        Double sum, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etDisplay = findViewById(R.id.etDisplay);
        etOne = findViewById(R.id.etOne);
        etTwo = findViewById(R.id.etTwo);
        etThree =findViewById(R.id.etThree);
        etFour =findViewById(R.id.etFour);
        etFive = findViewById(R.id.etFive);
        etSix = findViewById(R.id.etSix);
        etSeven = findViewById(R.id.etSeven);
        etEight = findViewById(R.id.etEight);
        etNine = findViewById(R.id.etNine);
        etZero = findViewById(R.id.etZero);
        etDot =findViewById(R.id.etDot);
        etSum = findViewById(R.id.etSum);
        etSub = findViewById(R.id.etSub);
        etMul = findViewById(R.id.etMul);
        etDiv = findViewById(R.id.etDiv);
        etAnswer = findViewById(R.id.etAnswer);

        etOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDisplay.setText(etDisplay.getText()+"1");
            }
        });

        etTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDisplay.setText(etDisplay.getText()+"2");
            }
        });

        etThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDisplay.setText(etDisplay.getText()+"3");
            }
        });

        etFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDisplay.setText(etDisplay.getText()+"4");
            }
        });

        etFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDisplay.setText(etDisplay.getText()+"5");
            }
        });

        etSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDisplay.setText(etDisplay.getText()+"6");
            }
        });

        etSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDisplay.setText(etDisplay.getText()+"7");
            }
        });

        etEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDisplay.setText(etDisplay.getText()+"8");
            }
        });

        etNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDisplay.setText(etDisplay.getText()+"9");
            }
        });

        etZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDisplay.setText(etDisplay.getText()+"0");
            }
        });

        etDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDisplay.setText(etDisplay.getText()+".");
            }
        });

    }
}
