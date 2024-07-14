package com.example.ebookreader;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    CardView cardstat,cardse,carddhp,cardoops,cardmad,cardwed;
    ImageSlider imageSlider;
    ImageView menu;
    View header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu=findViewById(R.id.menu);
        cardstat=(CardView) findViewById(R.id.cardstat);
        cardse=(CardView) findViewById(R.id.cardse);
        carddhp=(CardView) findViewById(R.id.carddhp);
        cardoops=(CardView) findViewById(R.id.cardoops);
        cardmad=(CardView) findViewById(R.id.cardmad);
        cardwed=(CardView) findViewById(R.id.cardweb);

        drawerLayout=(DrawerLayout) findViewById(R.id.draweLayout);
        navigationView=(NavigationView) findViewById(R.id.navView);

        imageSlider=findViewById(R.id.imageslider);
        ArrayList<SlideModel> slideModels=new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.b4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.b3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.b7, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.b2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.b5, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels,ScaleTypes.FIT);

        cardstat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent instat=new Intent(MainActivity.this, StatActivity.class);
                startActivity(instat);
            }
        });

        cardse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inse=new Intent(MainActivity.this, SeActivity.class);
                startActivity(inse);
            }
        });

        carddhp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indhp=new Intent(MainActivity.this, DhpActivity.class);
                startActivity(indhp);
            }
        });

        cardmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inmad=new Intent(MainActivity.this, MadActivity.class);
                startActivity(inmad);
            }
        });

        header=navigationView.getHeaderView(0);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(drawerLayout.isDrawerOpen(GravityCompat.START)){
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId()==R.id.home){
                    Toast.makeText(MainActivity.this,"HOME",Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if(item.getItemId()==R.id.share){
                    Toast.makeText(MainActivity.this,"Share",Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if(item.getItemId()==R.id.profile){
                    Toast.makeText(MainActivity.this,"Profile",Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if(item.getItemId()==R.id.logout){
                    Toast.makeText(MainActivity.this,"LOGOUT",Toast.LENGTH_SHORT).show();
                    Intent inlog=new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(inlog);
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return true;
            }
        });
    }
    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}