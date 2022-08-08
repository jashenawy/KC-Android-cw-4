package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Ed =findViewById(R.id.titel);
        EditText Ed1 = findViewById(R.id.first);
        EditText Ed2 = findViewById(R.id.second);
        TextView Ed3 = findViewById(R.id.total);
        Button b = findViewById(R.id.button);
        ImageView im = findViewById (R.id.spider);
        ImageView im1 = findViewById (R.id.face1);
        ImageView im2 = findViewById (R.id.face2);
        ImageView im3 = findViewById (R.id.spider2);




        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first = Integer.parseInt(Ed1.getText().toString());
                int second = Integer.parseInt(Ed2.getText().toString());

                int result = first + second;
                Ed3.setText(String.valueOf(result));


            }
        });
    }





}