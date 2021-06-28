package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText weight,height;
    TextView resulttext;
    String calculation,BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        resulttext = findViewById(R.id.result);
        Toast toast = Toast.makeText(getApplicationContext(),"helloworld",Toast.LENGTH_SHORT);
    }

    public void calculateBMI(View view) {
        String s1 = weight.getText().toString();
        String s2 = height.getText().toString();
        float weightValue = Float.parseFloat(s1);
        float heightValue = Float.parseFloat(s2) /100;
        float bmi = weightValue / (heightValue * heightValue);
        if(bmi < 16){
            BMIresult = "Severely under weight";

        }else if(bmi< 18.5){
            BMIresult = "under weight";

        }else if(bmi >= 18.5 && bmi <=24.9){
            BMIresult= "Normal weight";
        }else if(bmi >= 25 && bmi <=29.9){
            BMIresult = "Over Weight";
        }else{
            BMIresult = "Obese";
        }
         calculation = "Result:\n\n" + bmi + "\n" +BMIresult;
        resulttext.setText(calculation);

    }
}