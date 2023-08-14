package com.example.bushub;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BookedTicketsBg extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tickets_booked_bg);


        TextView selectionText = findViewById(R.id.selectionText1);
        TextView checkBoxSelections = findViewById(R.id.checkBoxSelections1);

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


        StringBuilder selectedText = new StringBuilder("Selected Checkboxes: \n");
        if (checkBox1Selected) {
            selectedText.append("Seat 1\n");
        }
        if (checkBox2Selected) {
            selectedText.append("Seat 2\n");
        }
        if (checkBox3Selected) {
            selectedText.append("Seat 3\n");
        }
        if (checkBox4Selected) {
            selectedText.append("Seat 4\n");
        }
        if (checkBox5Selected) {
            selectedText.append("Seat 5\n");
        }
        if (checkBox6Selected) {
            selectedText.append("Seat 6\n");
        }
        if (checkBox7Selected) {
            selectedText.append("Seat 7\n");
        }
        if (checkBox8Selected) {
            selectedText.append("Seat 8\n");
        }
        if (checkBox9Selected) {
            selectedText.append("Seat 9\n");
        }
        if (checkBox10Selected) {
            selectedText.append("Seat 10\n");
        }
        if (checkBox11Selected) {
            selectedText.append("Seat 11\n");
        }
        if (checkBox12Selected) {
            selectedText.append("Seat 12\n");
        }
        if (checkBox13Selected) {
            selectedText.append("Seat 13\n");
        }
        if (checkBox14Selected) {
            selectedText.append("Seat 14\n");
        }
        if (checkBox15Selected) {
            selectedText.append("Seat 15\n");
        }
        if (checkBox16Selected) {
            selectedText.append("Seat 16\n");
        }
        if (checkBox17Selected) {
            selectedText.append("Seat 17\n");
        }
        if (checkBox18Selected) {
            selectedText.append("Seat 18\n");
        }
        if (checkBox19Selected) {
            selectedText.append("Seat 19\n");
        }
        if (checkBox20Selected) {
            selectedText.append("Seat 20\n");
        }

        checkBoxSelections.setText(selectedText.toString());
    }
}
