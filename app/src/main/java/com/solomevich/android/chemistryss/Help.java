package com.solomevich.android.chemistryss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by 15 on 24.09.2017.
 */

public class Help extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_help);
    }

    public void getHelpEqualize(View view) {
        Intent intent = new Intent(Help.this, HelpEqualize.class);
        startActivity(intent);
    }

    public void getHelpMM(View view) {
        Intent intent = new Intent(Help.this, HelpMM.class);
        startActivity(intent);
    }

    public void getHelpTable(View view) {
        Intent intent = new Intent(Help.this, HelpTable.class);
        startActivity(intent);
    }

    public void getHelpInfo(View view) {
        Intent intent = new Intent(Help.this, HelpInfo.class);
        startActivity(intent);
    }



}