package com.solomevich.android.chemistryss;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 15 on 07.10.2017.
 */

public class SearchResult extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        String compound = getIntent().getExtras().getString("ion");
        String equation = helper(compound);
        TextView infoTextView = (TextView) findViewById(R.id.price_text_view);
        infoTextView.setText(equation);

    }



    Db db;
    private EditText mNameEditText;

    public String helper(String compound){
        String formulaResult="";

        db = new Db(this);
        // ???????? ?????????? ??????? ? ???? ????? ???????????
        int mCount = db.getItemCount();


        // ????????? ?????? ? id = 1 (?????? email)
//        db.updateEmail("Igor", "newemail@newemail.com");

        // ??????? ?????? ? id = 3
//        db.deleteItem(3);


//        ???????? ???? ???? ??????????
        List<Compound> compounds = db.getCompounds();

//compounds.add(new Compound(1,"D","BDF"));
        // ??????? ??? ????????? ?????? ? ???

//        for (Compound compound : compounds) {
//            Log.d(LOG_TAG, "???: " + friend.getName() + " email: " + friend.getEmail());
//        }


        for (int i=0;i<compounds.size();i++){
            if (compounds.get(i).getCompound().equalsIgnoreCase(compound)){
               formulaResult = compounds.get(i).getFormula();
            }
        }

        db.close();
        return formulaResult;
    }
}