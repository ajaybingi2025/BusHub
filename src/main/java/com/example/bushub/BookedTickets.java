package com.example.bushub;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
;

public class BookedTickets extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tickets_booked);

        findViewById(R.id.seat_confirm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        TextView selectionText = findViewById(R.id.selectionText);
        TextView checkBoxSelections = findViewById(R.id.checkBoxSelections);
        TextView totalCalculation= findViewById(R.id.total);
        int Total=0;
        Intent intent = getIntent();
        boolean checkBox1Selected = intent.getBooleanExtra("checkBox1Selected", false);
        boolean checkBox2Selected = intent.getBooleanExtra("checkBox2Selected", false);
        boolean checkBox3Selected = intent.getBooleanExtra("checkBox3Selected", false);
        boolean checkBox4Selected = intent.getBooleanExtra("checkBox4Selected", false);
        boolean checkBox5Selected = intent.getBooleanExtra("checkBox5Selected", false);
        boolean checkBox6Selected = intent.getBooleanExtra("checkBox6Selected", false);
        boolean checkBox7Selected = intent.getBooleanExtra("checkBox7Selected", false);
        boolean checkBox8Selected = intent.getBooleanExtra("checkBox8Selected", false);
        boolean checkBox9Selected = intent.getBooleanExtra("checkBox9Selected", false);
        boolean checkBox10Selected = intent.getBooleanExtra("checkBox10Selected", false);
        boolean checkBox11Selected = intent.getBooleanExtra("checkBox11Selected", false);
        boolean checkBox12Selected = intent.getBooleanExtra("checkBox12Selected", false);
        boolean checkBox13Selected = intent.getBooleanExtra("checkBox13Selected", false);
        boolean checkBox14Selected = intent.getBooleanExtra("checkBox14Selected", false);
        boolean checkBox15Selected = intent.getBooleanExtra("checkBox15Selected", false);
        boolean checkBox16Selected = intent.getBooleanExtra("checkBox16Selected", false);
        boolean checkBox17Selected = intent.getBooleanExtra("checkBox17Selected", false);
        boolean checkBox18Selected = intent.getBooleanExtra("checkBox18Selected", false);
        boolean checkBox19Selected = intent.getBooleanExtra("checkBox19Selected", false);
        boolean checkBox20Selected = intent.getBooleanExtra("checkBox20Selected", false);

        StringBuilder totalText = new StringBuilder("Price distribution:\nThe last displayed price is the price of total ticket. \n");
        StringBuilder selectedText = new StringBuilder("Selected Seats: \n");
        if (checkBox1Selected) {
            selectedText.append("Seat 1\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox2Selected) {
            selectedText.append("Seat 2\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox3Selected) {
            selectedText.append("Seat 3\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox4Selected) {
            selectedText.append("Seat 4\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox5Selected) {
            selectedText.append("Seat 5\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox6Selected) {
            selectedText.append("Seat 6\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox7Selected) {
            selectedText.append("Seat 7\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox8Selected) {
            selectedText.append("Seat 8\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox9Selected) {
            selectedText.append("Seat 9\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox10Selected) {
            selectedText.append("Seat 10\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox11Selected) {
            selectedText.append("Seat 11\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox12Selected) {
            selectedText.append("Seat 12\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox13Selected) {
            selectedText.append("Seat 13\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox14Selected) {
            selectedText.append("Seat 14\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox15Selected) {
            selectedText.append("Seat 15\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox16Selected) {
            selectedText.append("Seat 16\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox17Selected) {
            selectedText.append("Seat 17\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox18Selected) {
            selectedText.append("Seat 18\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox19Selected) {
            selectedText.append("Seat 19\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }
        if (checkBox20Selected) {
            selectedText.append("Seat 20\n");
            Total=Total+650;
            totalText.append("Rs."+Total+"\n");
        }



        checkBoxSelections.setText(selectedText.toString());
        totalCalculation.setText(totalText.toString());



    }
    private void openNewActivity() {
        Intent intent = new Intent(this, payment.class);
        startActivity(intent);
    }
}
