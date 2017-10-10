package com.solomevich.android.chemistryss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.List;


/**
 * Created by 15 on 06.10.2017.
 */

public class Search extends Activity {

//    private static final String LOG_TAG = "my_tag";
//    Db db;
//    private EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search);
    }

    public void submit(View view) {
        EditText userEditText = (EditText) findViewById(R.id.ddd);
        Intent intent = new Intent(Search.this, SearchResult.class);
        intent.putExtra("ion", userEditText.getText().toString());
        startActivity(intent);
    }
}
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_search);
//        mNameEditText = (EditText) findViewById(R.id.edit_guest_name);
//        DBConnector mDBConnector = new DBConnector (this);
//    }
//}