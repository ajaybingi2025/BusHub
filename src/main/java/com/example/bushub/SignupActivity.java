package com.example.bushub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private EditText signupUsernameEditText, signupPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signupUsernameEditText = findViewById(R.id.signupUsernameEditText);
        signupPasswordEditText = findViewById(R.id.signupPasswordEditText);

        findViewById(R.id.signupButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = signupUsernameEditText.getText().toString();
                String password = signupPasswordEditText.getText().toString();
                // Implement your sign-up logic here.
                // For simplicity, you can store the new user's credentials in a database or preferences.
                // Display a success message or navigate back to the login activity.
                Toast.makeText(SignupActivity.this, "Sign-up successful!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SignupActivity.this, location.class));
                finish();
            }
        });

        findViewById(R.id.loginTextView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate back to the login activity when the "Login!" text is clicked.
                finish();
            }
        });
    }
}
