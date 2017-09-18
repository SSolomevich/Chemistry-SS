package com.solomevich.android.chemistryss;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.solomevich.android.chemistryss.dao.ElementsDaoImpl;
import com.solomevich.android.chemistryss.model.Elements;

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
        String equation = String.valueOf(calculation(user,list));;
        TextView infoTextView = (TextView)findViewById(R.id.price_text_view);
        infoTextView.setText(equation);

    }

    public Integer calculation(String equation, List<Elements> list){

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
        int result=0;
        if (molecularWeight%1<0.5){
            result = (int)molecularWeight;
        }
        else result = (int)molecularWeight +1;


        System.out.println("molecularWeight"+molecularWeight);
        return result;
    }





}
