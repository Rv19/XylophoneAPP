package com.rv.musicapp_xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool mSoundPool;
    private int mASoundId;
    private int mBSoundId;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mSoundPool = new SoundPool(7, AudioManager.STREAM_MUSIC,0);

        mASoundId=mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mBSoundId=mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mCSoundId=mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mDSoundId=mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mESoundId=mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mFSoundId=mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);

    }
    public void playA(View v)
    {
        mSoundPool.play(mASoundId,1.0f,1.0f,0,0,1.0f);

    }


    public void playB(View v)
    {
        mSoundPool.play(mBSoundId,1.0f,1.0f,0,0,1.0f);
    }


    public void playC(View v)
    {
        mSoundPool.play(mCSoundId,1.0f,1.0f,0,0,1.0f);

    }

    public void playD(View v)
    {
        mSoundPool.play(mDSoundId,1.0f,1.0f,0,0,1.0f);
    }

    public void playE(View v)
    {
        mSoundPool.play(mESoundId,1.0f,1.0f,0,0,1.0f);
    }

    public void playF(View v)
    {
        mSoundPool.play(mFSoundId,1.0f,1.0f,0,0,1.0f);
    }


}
