package com.solomevich.android.chemistryss.model;

/**
 * Created by 15 on 15.09.2017.
 */

public class Elements {

    private Integer atomicNumber;


    private String element;


    private String name;


    private String clas;


    private String electronicConfiguration;


    private String electronegativity;


    private String color;


    private String valence;


    private String oxidationDegree;


    private Double boilingT;


    private Double meltingT;


    private String otherProperties;


    private Double weight;


    private String wiki;

    public Elements(Integer atomicNumber, String element, String name, String clas, String electronicConfiguration, String electronegativity, String color, String valence, String oxidationDegree, Double boilingT, Double meltingT, String otherProperties, Double weight, String wiki) {
        this.atomicNumber = atomicNumber;
        this.element = element;
        this.name = name;
        this.clas = clas;
        this.electronicConfiguration = electronicConfiguration;
        this.electronegativity = electronegativity;
        this.color = color;
        this.valence = valence;
        this.oxidationDegree = oxidationDegree;
        this.boilingT = boilingT;
        this.meltingT = meltingT;
        this.otherProperties = otherProperties;
        this.weight = weight;
        this.wiki = wiki;
    }

    public Integer getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(Integer atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getElectronicConfiguration() {
        return electronicConfiguration;
    }

    public void setElectronicConfiguration(String electronicConfiguration) {
        this.electronicConfiguration = electronicConfiguration;
    }

    public String getElectronegativity() {
        return electronegativity;
    }

    public void setElectronegativity(String electronegativity) {
        this.electronegativity = electronegativity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValence() {
        return valence;
    }

    public void setValence(String valence) {
        this.valence = valence;
    }

    public String getOxidationDegree() {
        return oxidationDegree;
    }

    public void setOxidationDegree(String oxidationDegree) {
        this.oxidationDegree = oxidationDegree;
    }

    public Double getBoilingT() {
        return boilingT;
    }

    public void setBoilingT(Double boilingT) {
        this.boilingT = boilingT;
    }

    public Double getMeltingT() {
        return meltingT;
    }

    public void setMeltingT(Double meltingT) {
        this.meltingT = meltingT;
    }

    public String getOtherProperties() {
        return otherProperties;
    }

    public void setOtherProperties(String otherProperties) {
        this.otherProperties = otherProperties;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }
}
