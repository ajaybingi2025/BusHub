package com.example.bushub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class payment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        TextView textViewClickMe = findViewById(R.id.textView1);
        TextView textViewOpenActivity1 = findViewById(R.id.textView2);
        TextView textViewOpenActivity2 = findViewById(R.id.textView3);
        TextView textViewOpenActivity3 = findViewById(R.id.textView4);

        textViewClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity when the TextView is clicked
                openNewActivity();
            }
        });
        textViewOpenActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity1();
            }
        });
        textViewOpenActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity2();
            }
        });

        textViewOpenActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity3();
            }
        });


    }
    private void openNewActivity() {
        // Replace "YourNewActivity" with the actual name of the activity you want to open
        Intent intent = new Intent(this, upi.class);
        startActivity(intent);
    }

    private void openNewActivity1() {
        // Replace "YourNewActivity" with the actual name of the activity you want to open
        Intent intent = new Intent(this, PaymentSucessful.class);
        startActivity(intent);
    }

    private void openNewActivity2() {
        // Replace "YourNewActivity" with the actual name of the activity you want to open
        Intent intent = new Intent(this, PaymentSucessful.class);
        startActivity(intent);
    }

    private void openNewActivity3() {
        // Replace "YourNewActivity" with the actual name of the activity you want to open
        Intent intent = new Intent(this, PaymentSucessful.class);
        startActivity(intent);
    }
}
