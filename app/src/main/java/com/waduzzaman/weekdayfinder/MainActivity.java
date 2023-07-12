package com.waduzzaman.weekdayfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edText;
    Button btnCal;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edText=findViewById(R.id.edText);
        btnCal=findViewById(R.id.btnCal);
        tvResult=findViewById(R.id.tvResult);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myString=edText.getText().toString();
                int myNumber=Integer.parseInt(myString);

                if (myNumber ==1 ) {
                    tvResult.setText("Today is Monday");
                } else if (myNumber ==2 ) {
                    tvResult.setText("Today is Tuesday");
                } else if (myNumber ==3 ) {
                    tvResult.setText("Today is Wednesday");
                } else if (myNumber ==4 ) {
                    tvResult.setText("Today is Thursday");
                } else if (myNumber ==5 ) {
                    tvResult.setText("Today is Friday");
                } else if (myNumber ==6 ) {
                    tvResult.setText("Today is Saturday");
                } else if (myNumber ==7 ) {
                    tvResult.setText("Today is Sunday");
                }
                else {
                    tvResult.setText("Please enter between 1-7");
                }

            }
        });


    }


}