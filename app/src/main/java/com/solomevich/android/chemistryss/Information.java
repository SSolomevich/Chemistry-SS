package com.solomevich.android.chemistryss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by 15 on 23.09.2017.
 */

public class Information extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_information);
    }

    public void getTableSolution(View view) {
        Intent intent = new Intent(Information.this, TableSolution.class);
        startActivity(intent);
    }

    public void getRowMettals(View view) {
        Intent intent = new Intent(Information.this, RowMettals.class);
        startActivity(intent);
    }

    public void getColorFlame(View view) {
        Intent intent = new Intent(Information.this, ColorFlame.class);
        startActivity(intent);
    }

    public void getIndicator(View view) {
        Intent intent = new Intent(Information.this, Indicator.class);
        startActivity(intent);
    }

}