package com.solomevich.android.chemistryss;

/**
 * Created by 15 on 22.09.2017.
 */



import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by 15 on 17.09.2017.
 */

public class TableMin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_table_min);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }


    public void submitTableResult(View view) {
        String result = "";
        switch (view.getId()) {
            case R.id.H: result = "H";
                break;
            case R.id.He: result = "He";
                break;
            case R.id.Li: result = "Li";
                break;
            case R.id.Be: result = "Be";
                break;
            case R.id.B: result = "B";
                break;
            case R.id.C: result = "C";
                break;
            case R.id.N: result = "N";
                break;
            case R.id.O: result = "O";
                break;
            case R.id.F: result = "F";
                break;
            case R.id.Ne: result = "Ne";
                break;

            case R.id.Na: result = "Na";
                break;
            case R.id.Mg: result = "Mg";
                break;
            case R.id.Al: result = "Al";
                break;
            case R.id.Si: result = "Si";
                break;
            case R.id.P: result = "P";
                break;

            case R.id.S: result = "S";
                break;
            case R.id.Cl: result = "Cl";
                break;
            case R.id.Ar: result = "Ar";
                break;
            case R.id.K: result = "K";
                break;
            case R.id.Ca: result = "Ca";
                break;

            case R.id.Sc: result = "Sc";
                break;
            case R.id.Ti: result = "Ti";
                break;
            case R.id.V: result = "V";
                break;
            case R.id.Cr: result = "Cr";
                break;
            case R.id.Mn: result = "Mn";
                break;

            case R.id.Fe: result = "Fe";
                break;
            case R.id.Co: result = "Co";
                break;
            case R.id.Ni: result = "Ni";
                break;
            case R.id.Cu: result = "Cu";
                break;
            case R.id.Zn: result = "Zn";
                break;

            case R.id.Ga: result = "Ga";
                break;
            case R.id.Ge: result = "Ge";
                break;
            case R.id.As: result = "As";
                break;
            case R.id.Se: result = "Se";
                break;
            case R.id.Br: result = "Br";
                break;

            case R.id.Kr: result = "Kr";
                break;
            case R.id.Rb: result = "Rb";
                break;
            case R.id.Sr: result = "Sr";
                break;
            case R.id.Y: result = "Y";
                break;
            case R.id.Zr: result = "Zr";
                break;

            case R.id.Nb: result = "Nb";
                break;
            case R.id.Mo: result = "Mo";
                break;
            case R.id.Tc: result = "Tc";
                break;
            case R.id.Ru: result = "Ru";
                break;
            case R.id.Rh: result = "Rh";
                break;

            case R.id.Pd: result = "Pd";
                break;
            case R.id.Ag: result = "Ag";
                break;
            case R.id.Cd: result = "Cd";
                break;
            case R.id.In: result = "In";
                break;
            case R.id.Sn: result = "Sn";
                break;

            case R.id.Sb: result = "Sb";
                break;
            case R.id.Te: result = "Te";
                break;
            case R.id.I: result = "I";
                break;
            case R.id.Xe: result = "Xe";
                break;
            case R.id.Cs: result = "Cs";
                break;

            case R.id.Ba: result = "Ba";
                break;
            case R.id.Hf: result = "Hf";
                break;
            case R.id.Ta: result = "Ta";
                break;
            case R.id.W: result = "W";
                break;
            case R.id.Re: result = "Re";
                break;

            case R.id.Os: result = "Os";
                break;
            case R.id.Ir: result = "Ir";
                break;
            case R.id.Pt: result = "Pt";
                break;
            case R.id.Au: result = "Au";
                break;
            case R.id.Hg: result = "Hg";
                break;

            case R.id.Tl: result = "Tl";
                break;
            case R.id.Pb: result = "Pb";
                break;
            case R.id.Bi: result = "Bi";
                break;
            case R.id.Po: result = "Po";
                break;
            case R.id.At: result = "At";
                break;

            case R.id.Rn: result = "Rn";
                break;
            case R.id.Fr: result = "Fr";
                break;
            case R.id.Ra: result = "Ra";
                break;
            case R.id.Rf: result = "Rf";
                break;
            case R.id.Db: result = "Db";
                break;

            case R.id.Sg: result = "Sg";
                break;
            case R.id.Bh: result = "Bh";
                break;
            case R.id.Hs: result = "Hs";
                break;
            case R.id.Mt: result = "Mt";
                break;
            case R.id.Ds: result = "Ds";
                break;
            case R.id.Rg: result = "Rg";
                break;
            case R.id.Cn: result = "Cn";
                break;
            case R.id.Nh: result = "Nh";
                break;
            case R.id.Fl: result = "Fl";
                break;
            case R.id.Mc: result = "Mc";
                break;
            case R.id.Lv: result = "Lv";
                break;
            case R.id.Ts: result = "Ts";
                break;
            case R.id.Og: result = "Og";
                break;
            case R.id.La: result = "La";
                break;
            case R.id.Ce: result = "Ce";
                break;
            case R.id.Pr: result = "Pr";
                break;
            case R.id.Nd: result = "Nd";
                break;
            case R.id.Pm: result = "Pm";
                break;
            case R.id.Sm: result = "Sm";
                break;
            case R.id.Eu: result = "Eu";
                break;
            case R.id.Gd: result = "Gd";
                break;
            case R.id.Tb: result = "Tb";
                break;
            case R.id.Dy: result = "Dy";
                break;
            case R.id.Ho: result = "Ho";
                break;
            case R.id.Er: result = "Er";
                break;
            case R.id.Tm: result = "Tm";
                break;
            case R.id.Yb: result = "Yb";
                break;
            case R.id.Lu: result = "Lu";
                break;
            case R.id.Ac: result = "Ac";
                break;
            case R.id.Th: result = "Th";
                break;
            case R.id.Pa: result = "Pa";
                break;
            case R.id.U: result = "U";
                break;
            case R.id.Np: result = "Np";
                break;
            case R.id.Pu: result = "Pu";
                break;
            case R.id.Am: result = "Am";
                break;
            case R.id.Cm: result = "Cm";
                break;
            case R.id.Bk: result = "Bk";
                break;
            case R.id.Cf: result = "Cf";
                break;
            case R.id.Es: result = "Es";
                break;
            case R.id.Fm: result = "Fm";
                break;
            case R.id.Md: result = "Md";
                break;
            case R.id.No: result = "No";
                break;
            case R.id.Lr: result = "Lr";
                break;

        }
        Intent intent = new Intent(TableMin.this, TableResult.class);
        intent.putExtra("username", result);
        startActivity(intent);

    }

    public void incrTable(View view) {
        Intent intent = new Intent(TableMin.this, Table.class);
        startActivity(intent);
    }

}
