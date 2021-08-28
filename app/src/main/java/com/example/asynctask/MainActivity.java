package com.example.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

// AsyncTask is best way to server request

public class MainActivity extends AppCompatActivity {
    public static ProgressBar progressBar;
    private static Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progress_bar);


        Button button = (Button) findViewById(R.id.start);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

               ExampleAsyncTask task = new ExampleAsyncTask(MainActivity.this);
               task.execute(10);

            }
        });
    }


}