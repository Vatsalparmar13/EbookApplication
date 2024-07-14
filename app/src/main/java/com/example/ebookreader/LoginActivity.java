package com.example.ebookreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username,password;
    Button btnlogin;
    TextView txtsign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        btnlogin=findViewById(R.id.btnlogin);
        txtsign=findViewById(R.id.txtsign);

        Intent i = getIntent();

        String unm = i.getStringExtra("USERNAME");
        String pas = i.getStringExtra("PASSWORD");

        username.setText(unm);
        password.setText(pas);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((username.getText().toString().equals(unm) && password.getText().toString().equals(pas)) ||
                        username.getText().toString().equals("vatsal") && password.getText().toString().equals("12345")) {

                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(LoginActivity.this, "Invalid Password or Username", Toast.LENGTH_SHORT).show();
                }
            }
        });

        txtsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inreg = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(inreg);
            }
        });
    }
}