package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shake;
        shake = (Button) findViewById(R.id.shake);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.ballDisplay);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        shake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("magiceightball", "The button is pressed");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(4);

                Log.d("magiceightball", "The result is:"+ number);

                ballDisplay.setImageResource(ballArray[number]);
            }
        });
        }
}
