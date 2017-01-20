package com.example.mgalle19.yahtzee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Random rand = new Random();
                int  pickedNumber = rand.nextInt(6);
                int image[] = {R.drawable.th, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};


                        ImageView iv = (ImageView) findViewById(R.id.imageView);
                        iv.setImageResource(image[pickedNumber]);
                        pickedNumber = rand.nextInt(6);
                        ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
                        iv2.setImageResource(image[pickedNumber]);
                        pickedNumber = rand.nextInt(6);
                        ImageView iv3 = (ImageView) findViewById(R.id.imageView3);
                        iv3.setImageResource(image[pickedNumber]);
                        pickedNumber = rand.nextInt(6);
                        ImageView iv4 = (ImageView) findViewById(R.id.imageView4);
                        iv4.setImageResource(image[pickedNumber]);
                        pickedNumber = rand.nextInt(6);
                        ImageView iv5 = (ImageView) findViewById(R.id.imageView5);
                        iv5.setImageResource(image[pickedNumber]);

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            ;
                        }
                        pickedNumber = rand.nextInt(6);
                    }

        });
    }
}
