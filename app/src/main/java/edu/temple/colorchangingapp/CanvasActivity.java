package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {
    View view ;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        view = findViewById(R.id.background);
        setTitle("Activity 2");
        Intent intent = getIntent();
        String colorww = getIntent().getStringExtra("message_key");
        tv = (TextView) findViewById(R.id.textView3);
        if(colorww.matches("Red")){
            view.setBackgroundColor(Color.RED);
            tv.setText(colorww);

        }else if(colorww.matches("Blue")){
            view.setBackgroundColor(Color.BLUE);
            tv.setText(colorww);
        }else if (colorww.matches("Green")){
            view.setBackgroundColor(Color.GREEN);
            tv.setText(colorww);
        }else if (colorww.matches("Pink") ){

            view.setBackgroundColor(Color.MAGENTA);
            tv.setText(colorww);
        } else if (colorww.matches("Gray") ){
            view.setBackgroundColor(Color.GRAY);
            tv.setText(colorww);
        }else if (colorww.matches("White")){
            view.setBackgroundColor(Color.WHITE);
            tv.setText(colorww);
        }else if (colorww.matches("Yellow") ){
            view.setBackgroundColor(Color.YELLOW);
            tv.setText(colorww);
        } else if (colorww.matches("Cyan")){
            view.setBackgroundColor(Color.CYAN);
            tv.setText(colorww);
        }
       // String text1 = intent.getStringExtra("Red",0);

        setTitle("Activity 2");


    }
}