package com.example.ebookreader;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Un2madActivity extends AppCompatActivity {

    PDFView pdfView;
    ImageView back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_un2mad);

        pdfView=findViewById(R.id.pdfview);
        back=findViewById(R.id.back);

        pdfView.fromAsset("Unit 2-Setting up android environment.pdf").load();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inmad=new Intent(Un2madActivity.this, MadActivity.class);
                startActivity(inmad);
                Toast.makeText(Un2madActivity.this, "305-MAD", Toast.LENGTH_SHORT).show();
            }
        });
    }
}