package com.example.ebookreader;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Ch2stActivity extends AppCompatActivity {

    PDFView pdfView;
    ImageView back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch2st);

        pdfView=findViewById(R.id.pdfview);
        back=findViewById(R.id.back);

        pdfView.fromAsset("S.Y.BCA unit-2.pdf").load();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent instat=new Intent(Ch2stActivity.this, StatActivity.class);
                startActivity(instat);
                Toast.makeText(Ch2stActivity.this, "301-STAT", Toast.LENGTH_SHORT).show();
            }
        });
    }
}