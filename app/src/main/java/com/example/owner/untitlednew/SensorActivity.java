package com.example.owner.untitlednew;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SensorActivity extends AppCompatActivity implements SensorEventListener {
    private SensorManager mSensorManager;
    private Sensor mLight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);

            mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
            mLight = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
    }

        @Override
        public final void onAccuracyChanged(Sensor sensor, int accuracy) {
            // Do something here if sensor accuracy changes.
        }

        @Override
        public final void onSensorChanged(SensorEvent event) {
            // The light sensor returns a single value.
            // Many sensors return 3 values, one for each axis.
            float lux = event.values[0];
            // Do something with this sensor value.

            Float luxFloat = new Float(lux);
            TextView textView = (TextView) findViewById(R.id.sensor_data);
            textView.setText(luxFloat.toString());
            TextView result = (TextView) findViewById(R.id.result);

            if (luxFloat > 1000){
                result.setText("too bright");
            } else{
                result.setText("normal");
            }
        }




        @Override
        protected void onResume() {
            super.onResume();
            mSensorManager.registerListener(this, mLight, SensorManager.SENSOR_DELAY_NORMAL);
            Log.i("Light Sensor","Resume activity");
        }

        @Override
        protected void onPause() {
            super.onPause();
            mSensorManager.unregisterListener(this);
            Log.i("Light Sensor","Pause activity");
        }
}
