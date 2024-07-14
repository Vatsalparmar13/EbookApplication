package com.example.ebookreader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class StatActivity extends AppCompatActivity {

    CardView ch1,ch2,ch3;
    ImageView backhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat);

        ch1=(CardView) findViewById(R.id.ch1);
        ch2=(CardView) findViewById(R.id.ch2);
        ch3=(CardView) findViewById(R.id.ch3);

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(StatActivity.this, Ch1stActivity.class);
                startActivity(intent);
                Toast.makeText(StatActivity.this, "Unit-1", Toast.LENGTH_SHORT).show();
            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1=new Intent(StatActivity.this, Ch2stActivity.class);
                startActivity(in1);
                Toast.makeText(StatActivity.this, "Unit-2", Toast.LENGTH_SHORT).show();
            }
        });

        backhome=findViewById(R.id.bachhome);
        backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(StatActivity.this, MainActivity.class);
                startActivity(in);
                Toast.makeText(StatActivity.this, "Home", Toast.LENGTH_SHORT).show();
            }
        });
    }
}