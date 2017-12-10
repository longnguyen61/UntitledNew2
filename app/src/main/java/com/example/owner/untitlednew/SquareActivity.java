package com.example.owner.untitlednew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

import static java.lang.Float.parseFloat;

public class SquareActivity extends AppCompatActivity {

    private Float operand = new Float(0);
    private Float perimeter = new Float(0);
    private Float area = new Float(0);

    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mMessagesDatabaseReference;
    private ChildEventListener mChildEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
    }

    @Override
    protected  void onStart(){
        super.onStart();
        Log.i("Square Activity","start activity");}
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("SquareActivity", "pause activitvy");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("SquareActivity", "resume activity");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("SquareActivity", "stop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("SquareActivity", "bye bye");
    }

    protected  void onRestart(){
        super.onRestart();
        Log.i("Square Activity","start activity");}

    public void onClickArea(View view) {
        EditText editText = (EditText) findViewById(R.id.value);
        operand = parseFloat(editText.getText().toString());
        area = operand * operand;
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(area.toString());
    }

    public void onClickPerimeter(View view) {
        EditText editText = (EditText) findViewById(R.id.value);
        operand = parseFloat(editText.getText().toString());
        perimeter = operand * 4;
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(perimeter.toString());
    }

    public void onClickSave(View view){
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference result = mFirebaseDatabase.getReference("Square's Perimeter:");
        DatabaseReference result2 = mFirebaseDatabase.getReference("Square's Area:");
        FirebaseStorage storage = FirebaseStorage.getInstance();

        result.setValue(perimeter);
        result2.setValue(area);

    }
}
