package com.example.owner.untitlednew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SensorMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_menu);
    }

    public void onClickLightSen(View view) {
        Intent intent = new Intent(this, SensorActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Sensor Menu", "start activity");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Sensor Menu", "pause activitvy");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Sensor Menu", "resume activity");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Sensor Menu", "stop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Sensor Menu", "bye bye");
    }
}
