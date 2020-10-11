package edu.temple.colorchangingapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.graphics.Color;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "edu.temple.colorchingapp.EXTRA_TEXT";
GridView choose ;
View layout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        choose = findViewById(R.id.myView);
        layout = findViewById(R.id.layout);

        setTitle(R.string.Activity_one_name);


//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Red");
//        colors.add("Blue");
//        colors.add("Green");
//        colors.add("Pink");
//        colors.add("Gray");
//        colors.add("White");
//        colors.add("Yellow");
//        colors.add("Cyan");
//        colors.add("Purple");
        Resources res = getResources();
        final String[] colors_ = res.getStringArray(R.array.all_colors);

        final BaseAdapter adapter = new CustomAdapter(MainActivity.this, colors_);
        choose.setAdapter(adapter);
        choose.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String p = parent.getItemAtPosition(position).toString();
                //Toast.makeText(MainActivity.this, p, Toast.LENGTH_SHORT).show();
               // view.setBackgroundColor(Color.WHITE);

                // layout.setBackgroundColor();
                if (p.matches(colors_[0])) {
                    openActivity2(p);
                } else if (p.matches(colors_[1])) {
                    openActivity2(p);
                } else if (p.matches(colors_[2])) {

                    openActivity2(p);
                } else if (p.matches(colors_[3])) {

                    openActivity2(p);
                }else if (p.matches(colors_[4])) {
                    openActivity2(p);

                } else if (p.matches(colors_[5])){
                    openActivity2(p);

                }else if (p.matches(colors_[6])){
                    openActivity2(p);

                }else if (p.matches(colors_[7])){
                    openActivity2(p);

                } else if (p.matches(colors_[8])){
                    openActivity2(p);
                }
            }
        });

    }
    public void openActivity2(String color){

        Intent intent = new Intent (this,CanvasActivity.class);
        intent.putExtra("message_key",color);
        startActivity(intent);
    }
}



