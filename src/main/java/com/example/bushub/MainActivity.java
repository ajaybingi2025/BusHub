package com.example.bushub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    SearchView sv;
    ListView lv;

    BottomNavigationView bnv;
    View fc;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.logout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        findViewById(R.id.set_location).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity1();
            }
        });

        bnv=findViewById(R.id.bottomNavigationView);
        fc=findViewById(R.id.fragmentContainerView);

        NavController navController = Navigation.findNavController(this, R.id.fragmentContainerView); // Replace with your NavHostFragment ID
        NavigationUI.setupWithNavController(bnv, navController);




    }

    private void openNewActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    private void openNewActivity1() {
        Intent intent = new Intent(this, location.class);
        startActivity(intent);
    }

}