package com.example.ebookreader;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Unit1dhpActivity extends AppCompatActivity {

    PDFView pdfView;
    ImageView back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1dhp);

        pdfView=findViewById(R.id.pdfview);
        back=findViewById(R.id.back);

        pdfView.fromAsset("UNIT1 database python.pdf").load();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indhp=new Intent(Unit1dhpActivity.this, SeActivity.class);
                startActivity(indhp);
                Toast.makeText(Unit1dhpActivity.this, "303-DHP", Toast.LENGTH_SHORT).show();
            }
        });
    }
}