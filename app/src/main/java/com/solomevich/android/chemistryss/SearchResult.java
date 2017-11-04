package com.solomevich.android.chemistryss;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by 15 on 07.10.2017.
 */

public class SearchResult extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        String compoundOrIon = getIntent().getExtras().getString("ion");
        String equation = search(compoundOrIon);
        TextView infoTextView = (TextView) findViewById(R.id.price_text_view);
        infoTextView.setText(equation);

    }


    protected String search(String compoundOrIon) {
        String compound = searchCompound(compoundOrIon);
        String ion = "";
        if (compound.equals("")) {
            ion = searchIon(compoundOrIon);
            if (ion.equals("")) {
                String res = "(";
                return res;
            } else return ion;
        } else return compound;
//        return compound;
    }


    Db db;
    private EditText mNameEditText;

    public String searchCompound(String compound) {
        String formulaResult = "";

        compound = compound.trim();
        db = new Db(this);

        List<Compound> compounds = db.getCompounds();


        String s = "";

        for (int i = 0; i < compounds.size(); i++) {

            try {
                s = new String(compounds.get(i).getCompound().getBytes("ISO-8859-1"), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            if (s.equalsIgnoreCase(compound)&&compounds.get(i).getClas().equals("1")) {
                formulaResult = compounds.get(i).getFormula();
            }
        }

        db.close();
        return formulaResult;

    }

    protected String searchIon(String ion) {
        String formulaResult = "";
        ion = ion.trim();
        db = new Db(this);

        List<Compound> compounds = db.getCompounds();
        String[] ionsString = ion.split(" ");
        if(ionsString.length!=2){
            return "";
        }
        String ion1 = "";
        String ion2 = "";
        int oxidDegreeIon1 = 0;
        int oxidDegreeIon2 = 0;

        String s = "";

        for (int i = 0; i < compounds.size(); i++) {

            try {
                s = new String(compounds.get(i).getCompound().getBytes("ISO-8859-1"), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }


            if (s.equalsIgnoreCase(ionsString[0]) || s.equalsIgnoreCase(ionsString[1])) {
                if (compounds.get(i).getClas().equals("2")) {
                    ion1 = compounds.get(i).getFormula();
                    oxidDegreeIon1 = Integer.parseInt(compounds.get(i).getOxidDegree1());
                }
                if (compounds.get(i).getClas().equals("3")) {
                    ion2 = compounds.get(i).getFormula();
                    oxidDegreeIon2 = Integer.parseInt(compounds.get(i).getOxidDegree1());
                }
            }
        }

        if (ion1.equals("")||ion2.equals("")){
            return "";
        }



        if (oxidDegreeIon1 == oxidDegreeIon2) {
            formulaResult = ion1 + ion2;
        } else {
            if (oxidDegreeIon1 > oxidDegreeIon2) {
                if (oxidDegreeIon1 % oxidDegreeIon2 == 0) {
                    if (!getCountBigSymbols(ion2)){
                        formulaResult = ion1+ion2+oxidDegreeIon1/oxidDegreeIon2;
                    }
                    else {
                        formulaResult = ion1+"("+ion2+")"+oxidDegreeIon1/oxidDegreeIon2;
                    }
                }
                else if (oxidDegreeIon1 % 2 == 0&&oxidDegreeIon2 % 2 == 0){
                    if (!getCountBigSymbols(ion1)&&!getCountBigSymbols(ion2)){
                        formulaResult = ion1+oxidDegreeIon2/2+ion2+oxidDegreeIon1/2;
                    }
                    else if(getCountBigSymbols(ion1)&&!getCountBigSymbols(ion2)){
                        formulaResult = "("+ion1+")"+oxidDegreeIon2/2+ion2+oxidDegreeIon1/2;
                    }
                    else if(!getCountBigSymbols(ion1)&&getCountBigSymbols(ion2)){
                        formulaResult = ion1+oxidDegreeIon2/2+"("+ion2+")"+oxidDegreeIon1/2;
                    }
                    else {
                        formulaResult = "("+ion1+")"+oxidDegreeIon2/2+"("+ion2+")"+oxidDegreeIon1/2;
                    }
                }
               else {
                    if (!getCountBigSymbols(ion1)&&!getCountBigSymbols(ion2)){
                        formulaResult = ion1+oxidDegreeIon2+ion2+oxidDegreeIon1;
                    }
                    else if(getCountBigSymbols(ion1)&&!getCountBigSymbols(ion2)){
                        formulaResult = "("+ion1+")"+oxidDegreeIon2+ion2+oxidDegreeIon1;
                    }
                    else if(!getCountBigSymbols(ion1)&&getCountBigSymbols(ion2)){
                        formulaResult = ion1+oxidDegreeIon2+"("+ion2+")"+oxidDegreeIon1;
                    }
                    else {
                        formulaResult = "("+ion1+")"+oxidDegreeIon2+"("+ion2+")"+oxidDegreeIon1;
                    }
                }
            } else {
                if (oxidDegreeIon2 % oxidDegreeIon1 == 0) {
                    if (!getCountBigSymbols(ion1)){
                        formulaResult = ion1+oxidDegreeIon2/oxidDegreeIon1+ion2;
                    }
                    else {
                        formulaResult = "("+ion1+")"+oxidDegreeIon2/oxidDegreeIon1+ion2;
                    }
                }
                else if (oxidDegreeIon1 % 2 == 0&&oxidDegreeIon2 % 2 == 0){
                    if (!getCountBigSymbols(ion1)&&!getCountBigSymbols(ion2)){
                        formulaResult = ion1+oxidDegreeIon2/2+ion2+oxidDegreeIon1/2;
                    }
                    else if(getCountBigSymbols(ion1)&&!getCountBigSymbols(ion2)){
                        formulaResult = "("+ion1+")"+oxidDegreeIon2/2+ion2+oxidDegreeIon1/2;
                    }
                    else if(!getCountBigSymbols(ion1)&&getCountBigSymbols(ion2)){
                        formulaResult = ion1+oxidDegreeIon2/2+"("+ion2+")"+oxidDegreeIon1/2;
                    }
                    else {
                        formulaResult = "("+ion1+")"+oxidDegreeIon2/2+"("+ion2+")"+oxidDegreeIon1/2;
                    }
                }
                else {
                    if (!getCountBigSymbols(ion1)&&!getCountBigSymbols(ion2)){
                        formulaResult = ion1+oxidDegreeIon2+ion2+oxidDegreeIon1;
                    }
                    else if(getCountBigSymbols(ion1)&&!getCountBigSymbols(ion2)){
                        formulaResult = "("+ion1+")"+oxidDegreeIon2+ion2+oxidDegreeIon1;
                    }
                    else if(!getCountBigSymbols(ion1)&&getCountBigSymbols(ion2)){
                        formulaResult = ion1+oxidDegreeIon2+"("+ion2+")"+oxidDegreeIon1;
                    }
                    else {
                        formulaResult = "("+ion1+")"+oxidDegreeIon2+"("+ion2+")"+oxidDegreeIon1;
                    }
                }
            }

        }


        db.close();
        return formulaResult;


    }

    protected Boolean getCountBigSymbols(String ion) {
        char[] symbolsCharArray = ion.toCharArray();
        int count = 0;
        for (char x : symbolsCharArray) {
            if (Character.isUpperCase(x)) {
                count++;
            }
        }
        boolean result = false;
        if (count > 1) result = true;
        return result;
    }

}











//        int mCount = db.getItemCount2();
//        List<Ion> ions = db.getIons();
//
//        String[] ionsString = ion.split(" ");
//
//        String ion1 = "";
//        String ion2 = "";
//        String s="";
//
//
//
//        for (int i=0;i<ions.size();i++){
//            try {
//                s = new String(ions.get(i).getCompound2().getBytes("ISO-8859-1"), "UTF-8");
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            }
//
//            if (s.equals(ionsString[0])){
//                if (ions.get(i).getClass().equals("1")){
//                    ion1=ionsString[0];
//                }
//                else ion2=ionsString[0];
//            }
//
//            if (s.equals(ionsString[1])){
//                if (ions.get(i).getClass().equals("2")){
//                    ion2=ionsString[0];
//                }
//                else ion1=ionsString[0];
//            }
//        }
//        if (ion1.equals("")||ion2.equals("")){
//            return "?????????? ?? ???????";
//        }
//
//        return ion1+ion2;
//    }

