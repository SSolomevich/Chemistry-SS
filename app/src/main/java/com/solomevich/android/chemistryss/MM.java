package com.solomevich.android.chemistryss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by 15 on 15.09.2017.
 */

public class MM extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mm);
    }

    public void submit(View view) {
        EditText userEditText = (EditText) findViewById(R.id.eq);
        Intent intent = new Intent(MM.this, ResultMM.class);
        intent.putExtra("username", userEditText.getText().toString());
        startActivity(intent);
    }




}
