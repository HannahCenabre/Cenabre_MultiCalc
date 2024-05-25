package com.example.multipurposecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button sum, sub, mul, div, mod, pow;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        mod = findViewById(R.id.mod);
        pow = findViewById(R.id.pow);
        result = findViewById(R.id.result);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1Value = Double.parseDouble(num1.getText().toString());
                double num2Value = Double.parseDouble(num2.getText().toString());
                result.setText(String.valueOf(num1Value + num2Value));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1Value = Double.parseDouble(num1.getText().toString());
                double num2Value = Double.parseDouble(num2.getText().toString());
                result.setText(String.valueOf(num1Value - num2Value));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1Value = Double.parseDouble(num1.getText().toString());
                double num2Value = Double.parseDouble(num2.getText().toString());
                result.setText(String.valueOf(num1Value * num2Value));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1Value = Double.parseDouble(num1.getText().toString());
                double num2Value = Double.parseDouble(num2.getText().toString());
                if (num2Value == 0) {
                    result.setText("Error: Division by zero is not allowed.");
                } else {
                    result.setText(String.valueOf(num1Value / num2Value));
                }
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1Value = Double.parseDouble(num1.getText().toString());
                double num2Value = Double.parseDouble(num2.getText().toString());
                if (num2Value == 0) {
                    result.setText("Error: Division by zero is not allowed.");
                } else {
                    result.setText(String.valueOf(num1Value % num2Value));
                }
            }
        });

        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1Value = Double.parseDouble(num1.getText().toString());
                double num2Value = Double.parseDouble(num2.getText().toString());
                result.setText(String.valueOf(Math.pow(num1Value, num2Value)));
            }
        });
    }
}