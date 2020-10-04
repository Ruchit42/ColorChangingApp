package edu.temple.colorchangingapp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.graphics.Color;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
GridView choose ;
View layout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        choose = findViewById(R.id.myView);
        layout = findViewById(R.id.layout);


        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Gray");
        colors.add("White");
        colors.add("Yellow");
        colors.add("Cyan");
        final BaseAdapter adapter = new CustomAdapter(MainActivity.this, colors);
        choose.setAdapter(adapter);
        choose.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String p = parent.getItemAtPosition(position).toString();
                //Toast.makeText(MainActivity.this, p, Toast.LENGTH_SHORT).show();
               // view.setBackgroundColor(Color.WHITE);

                // layout.setBackgroundColor();
                if (p.matches("Red")) {

                    layout.setBackgroundColor(Color.RED);

                } else if (p.matches("Blue")) {
                    layout.setBackgroundColor(Color.BLUE);
                } else if (p.matches("Green")) {
                    layout.setBackgroundColor(Color.GREEN);
                } else if (p.matches("Pink")) {
                    layout.setBackgroundColor(Color.MAGENTA);
                }else if (p.matches("Gray")) {
                    layout.setBackgroundColor(Color.GRAY);
                } else if (p.matches("White")){
                    layout.setBackgroundColor(Color.WHITE);
                }else if (p.matches("Yellow")){
                    layout.setBackgroundColor(Color.YELLOW);
                }else if (p.matches("Cyan")){
                    layout.setBackgroundColor(Color.CYAN);
                }
            }
        });

    }
}



