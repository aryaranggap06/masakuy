package com.toni.masakuy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ResepActivity extends AppCompatActivity {

    ActionBar actionBar;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_resep);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imagenasgor = findViewById(R.id.nasigoreng);

        imagenasgor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResepActivity.this, NasiGorengActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView imagefotosateayamresep = findViewById(R.id.sateayam);

        imagefotosateayamresep.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResepActivity.this, SateayamActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView imageburger = findViewById(R.id.burger);

        imageburger.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResepActivity.this, BurgerActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ImageView imagesushi = findViewById(R.id.sushi);

        imagesushi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResepActivity.this, SushiActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView imageramen = findViewById(R.id.ramen);

        imageramen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResepActivity.this, RamenActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

    @Override
    public  boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ResepActivity.this, MenuActivity.class);
        startActivity(intent);
        finish();
    }


}
