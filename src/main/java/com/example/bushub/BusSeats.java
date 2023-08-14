package com.example.bushub;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class BusSeats extends AppCompatActivity {

    private CheckBox checkbox1, checkbox2, checkbox3, checkbox4,checkbox5,checkbox6,checkbox7,checkbox8,checkbox9,checkbox10,checkbox11,checkbox12, checkbox13,checkbox14,checkbox15,checkbox16,checkbox17,checkbox18,checkbox19,checkbox20;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_seats);

        checkbox1 = findViewById(R.id.seat1);
        checkbox2 = findViewById(R.id.seat2);
        checkbox3 = findViewById(R.id.seat3);
        checkbox4 = findViewById(R.id.seat4);
        checkbox5 = findViewById(R.id.seat5);
        checkbox6 = findViewById(R.id.seat6);
        checkbox7 = findViewById(R.id.seat7);
        checkbox8 = findViewById(R.id.seat8);
        checkbox9 = findViewById(R.id.seat9);
        checkbox10 = findViewById(R.id.seat10);
        checkbox11 = findViewById(R.id.seat11);
        checkbox12 = findViewById(R.id.seat12);
        checkbox13 = findViewById(R.id.seat13);
        checkbox14 = findViewById(R.id.seat14);
        checkbox15 = findViewById(R.id.seat15);
        checkbox16 = findViewById(R.id.seat16);
        checkbox17 = findViewById(R.id.seat17);
        checkbox18 = findViewById(R.id.seat18);
        checkbox19 = findViewById(R.id.seat19);
        checkbox20 = findViewById(R.id.seat20);

        submitButton = findViewById(R.id.confirm);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start the new activity
                Intent intent = new Intent(BusSeats.this, BookedTickets.class);

                // Pass the checkbox selections to the new activity
                intent.putExtra("checkBox1Selected", checkbox1.isChecked());
                intent.putExtra("checkBox2Selected", checkbox2.isChecked());
                intent.putExtra("checkBox3Selected", checkbox3.isChecked());
                intent.putExtra("checkBox4Selected", checkbox4.isChecked());
                intent.putExtra("checkBox5Selected", checkbox5.isChecked());
                intent.putExtra("checkBox6Selected", checkbox6.isChecked());
                intent.putExtra("checkBox7Selected", checkbox7.isChecked());
                intent.putExtra("checkBox8Selected", checkbox8.isChecked());
                intent.putExtra("checkBox9Selected", checkbox9.isChecked());
                intent.putExtra("checkBox10Selected", checkbox10.isChecked());
                intent.putExtra("checkBox11Selected", checkbox11.isChecked());
                intent.putExtra("checkBox12Selected", checkbox12.isChecked());
                intent.putExtra("checkBox13Selected", checkbox13.isChecked());
                intent.putExtra("checkBox14Selected", checkbox14.isChecked());
                intent.putExtra("checkBox15Selected", checkbox15.isChecked());
                intent.putExtra("checkBox16Selected", checkbox16.isChecked());
                intent.putExtra("checkBox17Selected", checkbox17.isChecked());
                intent.putExtra("checkBox18Selected", checkbox18.isChecked());
                intent.putExtra("checkBox19Selected", checkbox19.isChecked());
                intent.putExtra("checkBox20Selected", checkbox20.isChecked());

                startActivity(intent);
            }
        });




    }
}
