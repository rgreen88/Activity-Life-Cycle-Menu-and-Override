package com.example.android.lifecycledemonstration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "In onCreate", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onCreate");

        //set your app ready to run
    }

    @Override
    public void onStart(){
        //First call of the "official" version of this method
        super.onStart();

        Toast.makeText(this, "In onStart", Toast.LENGTH_SHORT).show();
        Log.i("info", "onStart: ");

        //occasional use instances
    }

    @Override
    public void onResume(){
        //First call of the "official" version of this method
        super.onResume();

        Toast.makeText(this, "In onResume", Toast.LENGTH_SHORT).show();
        Log.i("info", "onResume: ");

        //load user data in onResume
    }

    @Override
    public void onPause(){
        //First call of the "official" version of this method
        super.onPause();

        Toast.makeText(this, "In onPause", Toast.LENGTH_SHORT).show();
        Log.i("info", "onPause: ");

        //save user data in onPause
    }

    @Override
    public void onStop(){
        //First call of the "official" version of this method
        super.onStop();

        Toast.makeText(this, "In onStop", Toast.LENGTH_SHORT).show();
        Log.i("info", "onStop: ");

        //occasional use instances
    }

    @Override
    public void onDestroy(){
        //First call of the "official" version of this method
        super.onDestroy();

        Toast.makeText(this, "In onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("info", "onDestroy: ");

        //tidy up app in onDestroy
    }
}
