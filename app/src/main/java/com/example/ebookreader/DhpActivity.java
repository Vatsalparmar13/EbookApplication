package com.example.ebookreader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DhpActivity extends AppCompatActivity {

    CardView ch1,ch2;
    ImageView backhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhp);

        ch1=(CardView) findViewById(R.id.ch1);
        ch2=(CardView) findViewById(R.id.ch2);

        backhome=findViewById(R.id.bachhome);
        backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(DhpActivity.this, MainActivity.class);
                startActivity(in);
                Toast.makeText(DhpActivity.this, "Home", Toast.LENGTH_SHORT).show();
            }
        });

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inun2=new Intent(DhpActivity.this, Unit1dhpActivity.class);
                startActivity(inun2);
                Toast.makeText(DhpActivity.this, "Unit-1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}