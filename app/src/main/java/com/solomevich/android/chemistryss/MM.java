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

    public void submit1(View view){

        display("0");

    }
    public void submit2(View view){

        display("1");

    }
    public void submit3(View view){

        display("2");

    }
    public void submit4(View view){

        display("3");

    }
    public void submit5(View view){

        display("4");

    }
    public void submit6(View view){

        display("5");

    }
    public void submit7(View view){

        display("6");

    }
    public void submit8(View view){

        display("7");

    }
    public void submit9(View view){

        display("8");

    }
    public void submit10(View view){

        display("9");

    }

    public void submit13(View view){

        display("(");

    }
    public void submit14(View view){

        display(")");

    }
    public void submit15(View view){

        display("[");

    }
    public void submit16(View view){

        display("]");

    }
    private void display(String number) {

        EditText userEditText = (EditText) findViewById(R.id.eq);
        String result = userEditText.getText().toString()+number;
        userEditText.setText(result);
        userEditText.setSelection(userEditText.getText().length());
    }


}
