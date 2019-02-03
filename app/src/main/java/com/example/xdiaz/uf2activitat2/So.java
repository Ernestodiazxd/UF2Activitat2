package com.example.xdiaz.uf2activitat2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;

public class So extends AppCompatActivity implements MediaController.MediaPlayerControl {
    MediaPlayer so;
    MediaController controls;
    ImageView imatge1;
    ImageView imatge2;
    ImageView imatge3;
    ImageView imatge4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_so);

        imatge1 = (ImageView) findViewById(R.id.green);
        imatge2 = (ImageView) findViewById(R.id.blue);
        imatge3 = (ImageView) findViewById(R.id.yellow);
        imatge4 = (ImageView) findViewById(R.id.red);



    }

    public void onClickBack(View v) {
        Intent intent = new Intent(So.this, Main.class);
        startActivity(intent);

    }

    public void onClickGreen(View v) {
        so = MediaPlayer.create(this, R.raw.roblox);
        so.start();
        imatge1.setImageResource(R.mipmap.vpressed);
        new CountDownTimer(200, 5000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                imatge1.setImageResource(R.mipmap.vnopressed);
            }
        }.start();

    }

    public void onClickBlue(View v) {
        so = MediaPlayer.create(this, R.raw.heheboi);
        so.start();
        imatge2.setImageResource(R.mipmap.azpressed);
        new CountDownTimer(200, 5000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                imatge2.setImageResource(R.mipmap.aznopressed);
            }
        }.start();

    }

    public void onClickYellow(View v) {
        so = MediaPlayer.create(this, R.raw.herright);
        so.start();
        imatge3.setImageResource(R.mipmap.apressed);
        new CountDownTimer(200, 5000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                imatge3.setImageResource(R.mipmap.anopressed);
            }
        }.start();

    }

    public void onClickRed(View v) {
        so= MediaPlayer.create(this, R.raw.nyancat);
        controls = new MediaController(this);
        controls.setMediaPlayer(this);
        controls.setAnchorView(findViewById(R.id.view));
        so.start();
        imatge4.setImageResource(R.mipmap.rpressed);
        new CountDownTimer(200, 5000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                imatge4.setImageResource(R.mipmap.rnopressed);
            }
        }.start();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        controls.show(0);
        return false;
    }

    @Override
    public int getCurrentPosition() {
// Torna la posició actual a la pista d'àudio
        return so.getCurrentPosition();
    }
    @Override
    public int getDuration() {
// Torna la durada de la pista d'àudio
        return so.getDuration();
    }
    @Override
    public boolean isPlaying() {
// Torna cert quan s'està reproduint àudio
        return so.isPlaying();
    }

    @Override
    public int getBufferPercentage() {
        return 0;
    }

    @Override
    public boolean canPause() {
        return true;
    }

    @Override
    public boolean canSeekBackward() {
        return false;
    }

    @Override
    public boolean canSeekForward() {
        return false;
    }

    @Override
    public int getAudioSessionId() {
        return 0;
    }

    @Override
    public void start() {
        so.start();
    }

    @Override
    public void pause() {
// Quan l'usuari toca el botó de pausa
        so.pause();
    }
    @Override
    public void seekTo(int pos) {
// Per anar a una posició de la pista
        so.seekTo(pos);
    }




}
