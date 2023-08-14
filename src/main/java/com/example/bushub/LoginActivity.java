package com.example.bushub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText1, passwordEditText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText1 = findViewById(R.id.usernameEditText1);
        passwordEditText1 = findViewById(R.id.passwordEditText1);

        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText1.getText().toString();
                String password = passwordEditText1.getText().toString();

                if (username.equals("user123") && password.equals("pass123")) {
                    // Login successful, navigate to the main activity or dashboard.
                    startActivity(new Intent(LoginActivity.this, location.class));
                    finish();
                } else {
                    // error message for invalid credentials.
                    // toast message is shown here.
                    Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        findViewById(R.id.signupTextView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open the sign-up activity when the "Sign up!" text is clicked.
                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
            }
        });
    }
}
