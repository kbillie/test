package com.example.kaila.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextActivity = findViewById(R.id.button1);
        nextActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                OpenActivity();
            }
        });

    }

    public void OpenActivity() {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(intent);
    }
}
