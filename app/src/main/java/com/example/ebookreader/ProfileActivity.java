package com.example.ebookreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    ImageView backh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        backh=findViewById(R.id.backh);

        backh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inh=new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(inh);
            }
        });
    }
}
