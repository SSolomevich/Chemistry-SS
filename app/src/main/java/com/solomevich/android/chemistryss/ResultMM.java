package com.solomevich.android.chemistryss;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.solomevich.android.chemistryss.dao.ElementsDaoImpl;
import com.solomevich.android.chemistryss.model.Elements;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by 15 on 15.09.2017.
 */

public class ResultMM extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultmm);
        String user = getIntent().getExtras().getString("username");

        ElementsDaoImpl elementsDao = new ElementsDaoImpl();
        List<Elements> list = elementsDao.listElements();
        String equation = String.valueOf(calculation(user,list));
        String equation1 = String.valueOf(calculation1(user,list));

        if(equation.equals("0")){
            TextView doubleMolecularWeight = (TextView)findViewById(R.id.double_molecular_weight);
            doubleMolecularWeight.setText("(");

            TextView infoTextView = (TextView)findViewById(R.id.price_text_view);
            infoTextView.setText("(");
        }
        else {
            TextView doubleMolecularWeight = (TextView) findViewById(R.id.double_molecular_weight);
            doubleMolecularWeight.setText(equation1);

            TextView infoTextView = (TextView) findViewById(R.id.price_text_view);
            infoTextView.setText(equation);
        }

    }

    public Integer calculation(String equation, List<Elements> list){
        equation = equation.trim();
        equation = equation.replaceAll(" ", "");
        double molecularWeight=0;
        Result r = new Result();
        Map<String,Integer> map = r.helpEqualizeEquation(equation);
        if (map.size()==0){
            return 0;
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();




        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getElement());
        }
        for (int i=0;i<list.size();i++){
            for (Map.Entry<String, Integer> me : set) {
                if (me.getKey().equals(list.get(i).getElement())){
                    double  weight = list.get(i).getWeight();
                    molecularWeight=molecularWeight+weight*me.getValue();
                }
            }
        }
        int result=0;
        if (molecularWeight%1<0.5){
            result = (int)molecularWeight;
        }
        else result = (int)molecularWeight +1;



        return result;
    }



    public Double calculation1(String equation, List<Elements> list){
        equation = equation.trim();
        equation = equation.replaceAll(" ", "");
        double molecularWeight=0;
        Result r = new Result();
        Map<String,Integer> map = r.helpEqualizeEquation(equation);
        Set<Map.Entry<String, Integer>> set = map.entrySet();




        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getElement());
        }
        for (int i=0;i<list.size();i++){
            for (Map.Entry<String, Integer> me : set) {
                if (me.getKey().equals(list.get(i).getElement())){
                    double  weight = list.get(i).getWeight();
                    molecularWeight=molecularWeight+weight*me.getValue();
                }
            }
        }



        return molecularWeight;
    }

}
