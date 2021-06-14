package com.toni.masakuy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_menu);

        //Button btnlogout = findViewById(R.id.logoutBtn1);

        //btnlogout.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  FirebaseAuth.getInstance().signOut();
                //Intent intent = new Intent(MenuActivity.this, LoginActivity.class);
                //startActivity(intent);
                //finish();
            //}
        //});

        ImageView imageresep = findViewById(R.id.imageresep);

        imageresep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ResepActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView imagepencarian = findViewById(R.id.imagepencarian);

        imagepencarian .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, CariActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView imageprofil = findViewById(R.id.imageprofil);

        imageprofil .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, AkunProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView imagetentang = findViewById(R.id.imagetentang);

        imagetentang .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, TentangActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this,"Klik Profile lalu Log Out", Toast.LENGTH_LONG).show();

    }

}
