package com.solomevich.android.chemistryss;

/**
 * Created by 15 on 09.10.2017.
 */

public class Compound {

    private long id;
    private String compound;
    private String formula;
    private String clas;
    private String oxidDegree1;
    private String oxidDegree2;

    public Compound() {

    }

//    public Compound(long id, String compound, String formula) {
//        this.id = id;
//        this.compound = compound;
//        this.formula = formula;
//    }


    public Compound(long id, String compound, String formula, String clas, String oxidDegree1, String oxidDegree2) {
        this.id = id;
        this.compound = compound;
        this.formula = formula;
        this.clas = clas;
        this.oxidDegree1 = oxidDegree1;
        this.oxidDegree2 = oxidDegree2;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getOxidDegree1() {
        return oxidDegree1;
    }

    public void setOxidDegree1(String oxidDegree1) {
        this.oxidDegree1 = oxidDegree1;
    }

    public String getOxidDegree2() {
        return oxidDegree2;
    }

    public void setOxidDegree2(String oxidDegree2) {
        this.oxidDegree2 = oxidDegree2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompound() {
        return compound;
    }

    public void setCompound(String compound) {
        this.compound = compound;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }
}
