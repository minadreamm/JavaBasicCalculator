package com.minadag.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText number1 ;
    EditText number2;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);

        }

        public void sum(View view){
            if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
                result.setText("Enter Number Please !");
            } else {
                int numberText1 = Integer.parseInt(number1.getText().toString());
                int numberText2 = Integer.parseInt(number2.getText().toString());

                int resultText = numberText1 + numberText2;

                result.setText("Result: " + resultText);
            }

        }

        public void deduct(View view){

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter Number Please !");
        } else {
            int numberText1 = Integer.parseInt(number1.getText().toString());
            int numberText2 = Integer.parseInt(number2.getText().toString());

            int resultText = numberText1 - numberText2;

            result.setText("Result: " + resultText);
        }

        }

        public void multiplay(View view){
            if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
                result.setText("Enter Number Please !");
            } else {
                int numberText1 = Integer.parseInt(number1.getText().toString());
                int numberText2 = Integer.parseInt(number2.getText().toString());

                int resultText = numberText1 * numberText2;

                result.setText("Result: " + resultText);
            }

        }

        public void divide(View view){
            if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
                result.setText("Enter Number Please !");
            } else {
                int numberText1 = Integer.parseInt(number1.getText().toString());
                int numberText2 = Integer.parseInt(number2.getText().toString());

                int resultText = numberText1 / numberText2;

                result.setText("Result: " + resultText);
            }


        }






    }
