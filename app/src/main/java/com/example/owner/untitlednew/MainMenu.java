package com.example.owner.untitlednew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void onClickMap(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void onClickSensor(View view) {
        Intent intent = new Intent(this, SensorMenu.class);
        startActivity(intent);
    }

    public void onClickshape(View view) {
        Intent intent = new Intent(this, ShapeCalculator.class);
        startActivity(intent);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Main Menu", "start activity");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Main Menu", "pause activitvy");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Main Menu", "resume activity");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Main Menu", "stop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Main Menu", "bye bye");
    }
}
