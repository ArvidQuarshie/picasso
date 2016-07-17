package com.example.user.pushnotifications;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;




//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        Picasso.with(this)
                .load("http://images5.fanpop.com/image/photos/26500000/Robert-Downey-Jr-SH2-Movie-Posters-robert-downey-jr-26552473-800-1278.jpg")
                .placeholder(R.drawable.placeholder)   // optional
                .error(R.drawable.error)      // optional
                .resize(250,250)                        // optional
                .into(imageView);
        imageView = (ImageView) findViewById(R.id.imageView2);
        Picasso.with(this)
                .load("https://s-media-cache-ak0.pinimg.com/originals/34/5a/0d/345a0d25e5968310a091adbe5955263a.jpg")
                .placeholder(R.drawable.placeholder)   // optional
                .error(R.drawable.error)      // optional
                .resize(250,250)                        // optional
                .into(imageView);
        imageView = (ImageView) findViewById(R.id.imageView3);
        Picasso.with(this)
                .load("https://s-media-cache-ak0.pinimg.com/236x/41/2f/96/412f96d1d0a926436fc4cc2c755fac18.jpg")
                .placeholder(R.drawable.placeholder)   // optional
                .error(R.drawable.error)      // optional
                .resize(250,250)                        // optional
                .into(imageView);

    }


}
