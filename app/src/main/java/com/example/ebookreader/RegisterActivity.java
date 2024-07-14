package com.example.ebookreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText user, email, phone, pass, repass;
    TextView signup;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        signup = findViewById(R.id.sign);
        user = findViewById(R.id.username);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phonenumber);
        pass = findViewById(R.id.password);
        repass = findViewById(R.id.repassword);
        reg = findViewById(R.id.register);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().isEmpty() || email.getText().toString().isEmpty() || phone.getText().toString().isEmpty() || pass.getText().toString().isEmpty() || repass.getText().toString().isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Fill All Details...", Toast.LENGTH_SHORT).show();
                } else if (!(pass.getText().toString().equals(repass.getText().toString()))) {
                    Toast.makeText(RegisterActivity.this, "Password Not Valid..", Toast.LENGTH_SHORT).show();
                } else {
                    String unm = user.getText().toString();
                    String pas = pass.getText().toString();

                    Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                    i.putExtra("USERNAME", unm);
                    i.putExtra("PASSWORD", pas);
                    startActivity(i);
                    Toast.makeText(RegisterActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}