package com.solomevich.android.chemistryss;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.solomevich.android.chemistryss.dao.ElementsDaoImpl;
import com.solomevich.android.chemistryss.model.Elements;
import com.solomevich.android.chemistryss.service.AllService;

import java.util.List;

/**
 * Created by 15 on 17.09.2017.
 */

public class TableResult extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_result);
        String user = getIntent().getExtras().getString("username");
        AllService allService = new AllService();
        Elements element = allService.getInfoElement(user);

        TextView element2 = (TextView)findViewById(R.id.Element2);
        element2.setText(element.getElement());
//
        TextView name = (TextView)findViewById(R.id.Name);
        name.setText(element.getName());
//
        TextView number = (TextView)findViewById(R.id.Number);
        String n = element.getAtomicNumber().toString();
        number.setText(n);

        TextView weight = (TextView)findViewById(R.id.Weight);
        String w = element.getWeight().toString();
        weight.setText(w);

        TextView clas = (TextView)findViewById(R.id.Clas);
        clas.setText(element.getClas());
//
        TextView color = (TextView)findViewById(R.id.Color);
        color.setText(element.getColor());
//
        TextView valence = (TextView)findViewById(R.id.Valence);
        valence.setText(element.getValence());

        TextView oxidationDegree = (TextView)findViewById(R.id.oxidationDegree);
        oxidationDegree.setText(element.getOxidationDegree());

        TextView electronicConfiguration = (TextView)findViewById(R.id.ElectronicConfiguration);
        electronicConfiguration.setText(element.getElectronicConfiguration());

        TextView electronegativity = (TextView)findViewById(R.id.Electronegativity);
        electronegativity.setText(element.getElectronegativity());

        TextView boilingT = (TextView)findViewById(R.id.BoilingT);
        if (element.getBoilingT()!=null){
        String b = element.getBoilingT().toString();
        boilingT.setText(b);}

        TextView meltingT = (TextView)findViewById(R.id.MeltingT);
        if (element.getMeltingT()!=null) {
            String m = element.getMeltingT().toString();
            meltingT.setText(m);
        }




    }


    public void submitWiki(View view) {
        String user = getIntent().getExtras().getString("username");
        AllService allService = new AllService();
        Elements element = allService.getInfoElement(user);
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(element.getWiki()));
        startActivity(browserIntent);
    }


}
