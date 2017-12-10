package com.example.owner.untitlednew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Start Screen", "start activity");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Start Screen ", "pause activitvy");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Start Screen", "resume activity");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Start Screen", "stop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Start Screen", "bye bye");
    }
}
