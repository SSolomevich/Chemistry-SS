package com.solomevich.android.chemistryss;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ScaleGestureDetector SGD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//        setContentView(new MyImageView(this));
        String fontPath = "fonts/mol.ttf";
        TextView text = (TextView) findViewById(R.id.ext);

        // Font Face
        Typeface typeface = Typeface.createFromAsset(getAssets(), fontPath);

        // Applying font
        text.setTypeface(typeface);
    }

    public void submitOrder(View view) {
        Intent intent = new Intent(MainActivity.this, Equalize.class);
        startActivity(intent);
    }

    public void submitMM(View view) {
        Intent intent = new Intent(MainActivity.this, InDev.class);
        startActivity(intent);
    }

    public void contacts(View view) {
        Intent intent = new Intent(MainActivity.this, Contacts.class);
        startActivity(intent);
    }

    public void submitmm(View view) {
        Intent intent = new Intent(MainActivity.this, MM.class);
        startActivity(intent);
    }

    public void submitTable(View view) {
        Intent intent = new Intent(MainActivity.this, TableMin.class);
        startActivity(intent);
    }

    public void search(View view) {
        Intent intent = new Intent(MainActivity.this, Search.class);
        startActivity(intent);
    }


    public void information(View view) {
        Intent intent = new Intent(MainActivity.this, Information.class);
        startActivity(intent);
    }

    public void getHelp(View view) {
        Intent intent = new Intent(MainActivity.this, Help.class);
        startActivity(intent);
    }
}
