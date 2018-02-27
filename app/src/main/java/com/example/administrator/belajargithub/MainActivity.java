package com.example.administrator.belajargithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "test2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "halooooo", Toast.LENGTH_SHORT).show();
    }
}
