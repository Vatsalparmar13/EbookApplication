package com.example.ebookreader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MadActivity extends AppCompatActivity {

    CardView ch1,ch2;
    ImageView backhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad);

        ch1=(CardView) findViewById(R.id.ch1);
        ch2=(CardView) findViewById(R.id.ch2);

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MadActivity.this, Un1madActivity.class);
                startActivity(intent);
                Toast.makeText(MadActivity.this, "Unit-1", Toast.LENGTH_SHORT).show();
            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inun2=new Intent(MadActivity.this, Un2madActivity.class);
                startActivity(inun2);
                Toast.makeText(MadActivity.this, "Unit-2", Toast.LENGTH_SHORT).show();
            }
        });

        backhome=findViewById(R.id.bachhome);
        backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MadActivity.this, MainActivity.class);
                startActivity(in);
                Toast.makeText(MadActivity.this, "Home", Toast.LENGTH_SHORT).show();
            }
        });
    }
}