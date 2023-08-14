package com.example.bushub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BusAvailabilityBn extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_availabaility_bn);

        TextView volvo = findViewById(R.id.volvo_bn);
        TextView garuda = findViewById(R.id.garuda_bn);
        TextView rajadhani = findViewById(R.id.rajadhani_bn);
        TextView superluxury = findViewById(R.id.superluxury_bn);

        volvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity when the TextView is clicked
                openVolvo();
            }
        });

        garuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGaruda();
            }
        });

        rajadhani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRajadhani();
            }
        });

        superluxury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuperluxury();
            }
        });
    }

    private void openVolvo() {
        // Replace "YourNewActivity" with the actual name of the activity you want to open
        Intent intent = new Intent(this, BusSeatsBg.class);
        startActivity(intent);
    }

    private void openGaruda() {
        // Replace "YourNewActivity" with the actual name of the activity you want to open
        Intent intent = new Intent(this, BusSeatsBg.class);
        startActivity(intent);
    }

    private void openSuperluxury() {
        // Replace "YourNewActivity" with the actual name of the activity you want to open
        Intent intent = new Intent(this, BusSeatsBg.class);
        startActivity(intent);
    }

    private void openRajadhani() {
        // Replace "YourNewActivity" with the actual name of the activity you want to open
        Intent intent = new Intent(this, BusSeatsBg.class);
        startActivity(intent);
    }


}
