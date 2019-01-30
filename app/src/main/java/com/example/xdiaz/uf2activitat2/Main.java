package com.example.xdiaz.uf2activitat2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickVideo(View v){
        Intent intent = new Intent(Main.this, Video.class);
        startActivity(intent);

    }


    public void onClickSo(View v){
        Intent intent = new Intent(Main.this, So.class);
        startActivity(intent);

    }
}
