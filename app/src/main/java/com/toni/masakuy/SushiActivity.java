package com.toni.masakuy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SushiActivity extends AppCompatActivity {

    ActionBar actionBar;
    VideoView videoSushi;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_sushi);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        videoSushi = (VideoView)findViewById(R.id.videoView6);
        videoSushi.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sushivideo));
        videoSushi.setMediaController(new MediaController(this));
        videoSushi.start();

    }

    @Override
    public  boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SushiActivity.this, ResepActivity.class);
        startActivity(intent);
        finish();
    }

}