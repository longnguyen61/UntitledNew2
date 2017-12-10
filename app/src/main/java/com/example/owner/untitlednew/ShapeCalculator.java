package com.example.owner.untitlednew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ShapeCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_calculator);
    }

    public void onClickSquareActivity(View view) {
        Intent intent = new Intent(this, SquareActivity.class);
        startActivity(intent);
    }

    @Override
    protected  void onStart(){
        super.onStart();
        Log.i("SquareActivity","start activity");
    }

    public void onClickRectangleActivity(View view) {
        Intent intent = new Intent(this, RectangleActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Menu Activity", "pause activitvy");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Menu Activity", "resume activity");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Menu Activity", "stop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Menu Activity", "bye bye");
    }
}
