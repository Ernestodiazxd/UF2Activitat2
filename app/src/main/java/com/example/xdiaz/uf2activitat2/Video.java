package com.example.xdiaz.uf2activitat2;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity{
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        video=(VideoView) findViewById(R.id.videoView);
    }

    public void onClickBack(View v){
        Intent intent = new Intent(Video.this, Main.class);
        startActivity(intent);

    }

    public void onClickPerdoname(View v){
        Uri vid= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.meperdonas);
        video.setVideoURI(vid);
        video.setMediaController(new MediaController(this));
        video.start();
    }

    public void onClickChimuelo(View v){
        Uri vid= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.chimuelo);
        video.setVideoURI(vid);
        video.setMediaController(new MediaController(this));
        video.start();
    }



}
