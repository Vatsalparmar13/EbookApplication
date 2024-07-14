package com.example.ebookreader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SeActivity extends AppCompatActivity {

    CardView ch1,ch2;
    ImageView backhome;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se);

        ch1=(CardView) findViewById(R.id.ch1);
        ch2=(CardView) findViewById(R.id.ch2);

        backhome=findViewById(R.id.bachhome);
        backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(SeActivity.this, MainActivity.class);
                startActivity(in);
                Toast.makeText(SeActivity.this, "Home", Toast.LENGTH_SHORT).show();
            }
        });

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SeActivity.this, Un1seActivity.class);
                startActivity(intent);
                Toast.makeText(SeActivity.this, "Unit-1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}