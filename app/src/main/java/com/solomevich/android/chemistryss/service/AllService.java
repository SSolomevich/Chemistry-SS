package com.solomevich.android.chemistryss.service;

import android.text.TextUtils;

import com.solomevich.android.chemistryss.dao.ElementsDaoImpl;
import com.solomevich.android.chemistryss.model.Elements;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 15 on 16.09.2017.
 */

public class AllService {
    private ElementsDaoImpl elementsDao = new ElementsDaoImpl();

    public Elements getInfoElement(String symbolElement){
        List<Elements> list = new LinkedList<>();
              list =  elementsDao.listElements();
        int number=0;
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getElement().equals(symbolElement)){
                number = i;
            }
        }
        return list.get(number);
    }

    public void addSquareBrackets (LinkedList <String> symbolsList){
        for (int a=0; a<symbolsList.size();a++){

            if (symbolsList.get(a).equals("[")){
                int b = a+1;
                while (!symbolsList.get(b).equals("]")){
                    b++;
                }
                if (symbolsList.size()>b+1) {
                    boolean isDigits1 = TextUtils.isDigitsOnly(symbolsList.get(b + 1));
                    if (isDigits1) {
                        if (symbolsList.size() > b + 2) {
                            boolean isDigits2 = TextUtils.isDigitsOnly(symbolsList.get(b + 2));
                            if (!isDigits2) {

                                for (int c = 0; c < Integer.parseInt(symbolsList.get(b + 1)); c++) {
                                    for (int d = a + 1; d < b; d++) {
                                        symbolsList.add(symbolsList.get(d));
                                    }
                                }
                            } else {
                                String digits = symbolsList.get(b + 1) + symbolsList.get(b + 2);
                                for (int c = 0; c < Integer.parseInt(digits); c++) {
                                    for (int d = a + 1; d < b; d++) {
                                        symbolsList.add(symbolsList.get(d));
                                    }
                                }

                            }
                        } else {
                            for (int c = 0; c < Integer.parseInt(symbolsList.get(b + 1)); c++) {
                                for (int d = a + 1; d < b; d++) {
                                    symbolsList.add(symbolsList.get(d));
                                }
                            }
                        }
                    }
                    else {
                        for (int d = a + 1; d < b; d++) {
                            symbolsList.add(symbolsList.get(d));
                        }
                    }
                }
                else {
                    for (int d = a + 1; d < b; d++) {
                        symbolsList.add(symbolsList.get(d));
                    }
                }

            }
        }
    }

    public void deleteSquareBrackets (LinkedList <String> symbolsList){
        for (int a=0; a<symbolsList.size();a++){
            if(a>0) {
                if (!symbolsList.get(a - 1).equals("[")) {
                    if (symbolsList.get(a).equals("[")) {
                        while (!symbolsList.get(a).equals("]")) {
                            symbolsList.remove(a);
                        }
                        symbolsList.remove(a);
                        if (symbolsList.size() > a) {
                            boolean isDigits1 = TextUtils.isDigitsOnly(symbolsList.get(a));
                            if (isDigits1) {
                                symbolsList.remove(a);
                                if (symbolsList.size() > a + 1) {
                                    boolean isDigits = TextUtils.isDigitsOnly(symbolsList.get(a));
                                    if (isDigits) {
                                        symbolsList.remove(a);
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    while (!symbolsList.get(a).equals("]")) {
                        symbolsList.remove(a);
                    }
                    symbolsList.remove(a);
                    if (symbolsList.size() > a) {
                        boolean isDigits1 = TextUtils.isDigitsOnly(symbolsList.get(a));
                        if (isDigits1) {
                            symbolsList.remove(a);
                            if (symbolsList.size() > a + 1) {
                                boolean isDigits = TextUtils.isDigitsOnly(symbolsList.get(a));
                                if (isDigits) {
                                    symbolsList.remove(a);
                                }
                            }
                        }
                        symbolsList.remove(a - 1);

                    }
                }
            }
        }
    }



    public void addRoundBrackets(LinkedList <String> symbolsList){
        for (int a=0; a<symbolsList.size();a++){

            if (symbolsList.get(a).equals("(")){
                int b = a+1;
                while (!symbolsList.get(b).equals(")")){
                    b++;
                }
                if (symbolsList.size()>b+1) {
                    boolean isDigits1 = TextUtils.isDigitsOnly(symbolsList.get(b + 1));
                    if (isDigits1) {
                        if (symbolsList.size() > b + 2) {
                            boolean isDigits2 = TextUtils.isDigitsOnly(symbolsList.get(b + 2));
                            if (!isDigits2) {

                                for (int c = 0; c < Integer.parseInt(symbolsList.get(b + 1)); c++) {
                                    for (int d = a + 1; d < b; d++) {
                                        symbolsList.add(symbolsList.get(d));
                                    }
                                }
                            } else {
                                String digits = symbolsList.get(b + 1) + symbolsList.get(b + 2);
                                for (int c = 0; c < Integer.parseInt(digits); c++) {
                                    for (int d = a + 1; d < b; d++) {
                                        symbolsList.add(symbolsList.get(d));
                                    }
                                }

                            }
                        } else {
                            for (int c = 0; c < Integer.parseInt(symbolsList.get(b + 1)); c++) {
                                for (int d = a + 1; d < b; d++) {
                                    symbolsList.add(symbolsList.get(d));
                                }
                            }
                        }
                    }
                    else {
                        for (int d = a + 1; d < b; d++) {
                            symbolsList.add(symbolsList.get(d));
                        }
                    }
                }
                else {
                    for (int d = a + 1; d < b; d++) {
                        symbolsList.add(symbolsList.get(d));
                    }
                }

            }
        }

    }


    public void deleteRoundBrackets (LinkedList <String> symbolsList){
        for (int a=0; a<symbolsList.size();a++){
            if(a>0) {
                if (!symbolsList.get(a - 1).equals("(")) {
                    if (symbolsList.get(a).equals("(")) {
                        while (!symbolsList.get(a).equals(")")) {
                            symbolsList.remove(a);
                        }
                        symbolsList.remove(a);


                        if (symbolsList.size() > a) {
                            boolean isDigits1 = TextUtils.isDigitsOnly(symbolsList.get(a));
                            if (isDigits1) {
                                symbolsList.remove(a);
                                if (symbolsList.size() > a + 1) {
                                    boolean isDigits = TextUtils.isDigitsOnly(symbolsList.get(a));
                                    if (isDigits) {
                                        symbolsList.remove(a);
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    while (!symbolsList.get(a).equals(")")) {
                        symbolsList.remove(a);
                    }
                    symbolsList.remove(a);
                    if (symbolsList.size() > a) {
                        boolean isDigits1 = TextUtils.isDigitsOnly(symbolsList.get(a));
                        if (isDigits1) {
                            symbolsList.remove(a);
                            if (symbolsList.size() > a + 1) {
                                boolean isDigits = TextUtils.isDigitsOnly(symbolsList.get(a));
                                if (isDigits) {
                                    symbolsList.remove(a);
                                }
                            }
                        }
                        symbolsList.remove(a - 1);
                    }
                }
            }
        }
    }

}
