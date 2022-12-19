package com.example.myfontdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1,textView2,textView3;
    private Typeface typeface1, typeface2,typeface3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textView1Id);
        textView2 = findViewById(R.id.textView2Id);
        textView3 = findViewById(R.id.textView3Id);

        typeface1 = Typeface.createFromAsset(getAssets(),"Font/Amaranth_Bold.otf");
        textView1.setTypeface(typeface1);
        typeface2 = Typeface.createFromAsset(getAssets(),"Font/Amaranth_Italic.otf");
        textView2.setTypeface(typeface2);
        typeface3 = Typeface.createFromAsset(getAssets(),"Font/Amaranth_Regular.otf");
        textView3.setTypeface(typeface3);


    }
}