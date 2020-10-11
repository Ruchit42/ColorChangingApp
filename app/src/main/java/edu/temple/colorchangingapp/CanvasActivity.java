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
        setTitle(R.string.Activity_two_name);
        Intent intent = getIntent();
        int colorww = getIntent().getIntExtra("message_key",0);
      //  int num = getIntent().getIntExtra("message_key");
        tv = (TextView) findViewById(R.id.textView3);
        if(colorww == 0){
            view.setBackgroundColor(Color.RED);
            tv.setText(R.string.color_red);

        }else if(colorww == 1){
            view.setBackgroundColor(Color.BLUE);
            tv.setText(R.string.color_blue);
        }else if (colorww==2){
            view.setBackgroundColor(Color.GREEN);
            tv.setText(R.string.color_green);
        }else if (colorww==3 ){

            view.setBackgroundColor(Color.MAGENTA);
            tv.setText(R.string.color_pink);
        } else if (colorww ==4  ){
            view.setBackgroundColor(Color.GRAY);
            tv.setText(R.string.color_gray);
        }else if (colorww == 5){
            view.setBackgroundColor(Color.WHITE);
            tv.setText(R.string.color_white);
        }else if (colorww==6 ){
            view.setBackgroundColor(Color.YELLOW);
            tv.setText(R.string.color_yellow);
        } else if (colorww==7){
            view.setBackgroundColor(Color.CYAN);
            tv.setText(R.string.color_cyan);
        } else if (colorww==8){
            view.setBackgroundColor(Color.rgb(128,0,128));
            tv.setText(R.string.color_purple);
        }
       // String text1 = intent.getStringExtra("Red",0);




    }
}