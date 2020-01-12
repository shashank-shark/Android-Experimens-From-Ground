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

}
