package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(tag; "Lifecycle", msg;"OnCreate() invoked")


    }

    public void onStart() {


        super.onStart();
        Log.i(tag; "Lifecycle", msg; "onStart() invoked")
    }

    public void onRestart(){
        super.onRestart();
        Log.i(tag; "Lifecycle", msg; "onRestart() invoked")

    }

    public void onResume(){
        super.onResume();
        Log.i(tag; "Lifecycle", msg; "onResume() invoked")



    }

    public  void onPause(){
        super.onPause();
        Log.i(Tag(); "Lifecycle", msg; "onPause() invoked")



    }

    public void onStop(){
        super.onStop();
        String tag;
        Log.i(tag; "Lifecycle", msg; "onStop() invoked")



    }

    public void onRetry(){
        super.onRetry();
        Log.i(tag; "Lifecycle", msg; "onRetry() invoked");



    }




}