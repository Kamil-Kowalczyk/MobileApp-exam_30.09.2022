package com.example.exammobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int likeCounter = 0;
    public  TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputTextView = findViewById(R.id.textView);
    }

    public void increment(View view) {
        this.likeCounter += 1;
        printLikes();
    }

    public void decrement(View view) {
        if (this.likeCounter > 0)
            this.likeCounter -= 1;
        printLikes();
    }

    private void printLikes(){
        outputTextView.setText(likeCounter + " polubień");
    }
}