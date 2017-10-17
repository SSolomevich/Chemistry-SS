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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 15 on 17.09.2017.
 */

public class TableResult extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_result);
        String user1 = getIntent().getExtras().getString("username");

        String user = null;
        try {
            user = new String(user1.getBytes("UTF-8"), "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        AllService allService = new AllService();
        Elements element = allService.getInfoElement(user);

        TextView element2 = (TextView)findViewById(R.id.Element2);
        element2.setText(element.getElement());
//
        TextView name = (TextView)findViewById(R.id.Name);
//        name.setText(element.getName());
        try {
            name.setText(new String(element.getName().getBytes("ISO-8859-1"), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
//
        TextView number = (TextView)findViewById(R.id.Number);
        String n = element.getAtomicNumber().toString();
        number.setText(n);

        TextView weight = (TextView)findViewById(R.id.Weight);
        String w = element.getWeight().toString();
        weight.setText(w);

        TextView clas = (TextView)findViewById(R.id.Clas);
        try {
            String utf8String= new String(element.getClas().getBytes("ISO-8859-1"), "UTF-8");
            clas.setText(utf8String);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

//        clas.setText(element.getClas());
//
        TextView color = (TextView)findViewById(R.id.Color);
        try {
            color.setText(new String(element.getColor().getBytes("ISO-8859-1"), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
//        color.setText(element.getColor());
//
        TextView valence = (TextView)findViewById(R.id.Valence);
        valence.setText(element.getValence());

        TextView oxidationDegree = (TextView)findViewById(R.id.oxidationDegree);
        try {
            oxidationDegree.setText(new String(element.getOxidationDegree().getBytes("ISO-8859-1"), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
//        oxidationDegree.setText(element.getOxidationDegree());

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
