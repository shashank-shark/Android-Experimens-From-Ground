package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* calling onCreate() method */
        Log.d("TYPE", "calling onCreate() method");

        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        /* calling onStart() method */
        Log.d("TEST", "calling onStart() method");
    }

    @Override
    protected void onStop() {
        super.onStop();

        /* calling onStop() method */
        Log.d("TEST", "calling onStop() method");
    }

    @Override
    protected void onResume() {
        super.onResume();

        /* calling onResume() method */
        Log.d("TYPE", "calling onResume() method");
    }

    @Override
    protected void onPause() {
        super.onPause();

        /* calling onPause() method */
        Log.d("TEST", "calling onPause() method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        /* calling onDestroy() method */
        Log.d("TEST", "calling onDestroy() method");
    }

}
