package com.example.ebookreader;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Un1seActivity extends AppCompatActivity {

    PDFView pdfView;
    ImageView back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_un1se);

        pdfView=findViewById(R.id.pdfview);
        back=findViewById(R.id.back);

        pdfView.fromAsset("UNIT - 1 SE [SYBCA SEM-3].pdf").load();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inmad=new Intent(Un1seActivity.this, SeActivity.class);
                startActivity(inmad);
                Toast.makeText(Un1seActivity.this, "302-SE", Toast.LENGTH_SHORT).show();
            }
        });
    }
}