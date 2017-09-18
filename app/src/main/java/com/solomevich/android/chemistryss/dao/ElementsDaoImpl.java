package com.solomevich.android.chemistryss.dao;

import com.solomevich.android.chemistryss.model.Elements;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 15 on 15.09.2017.
 */

public class ElementsDaoImpl {

    public List<Elements> listElements() {

        List<Elements> listElements = new LinkedList<>();



        listElements.add(new Elements(1, "H", "Водород","неметалл","1s1","2.1","бесцветный","I","+1,-1",-252.87,-255.34,"",1.00795,"https://ru.wikipedia.org/wiki/%D0%92%D0%BE%D0%B4%D0%BE%D1%80%D0%BE%D0%B4"));
        listElements.add(new Elements(2, "He", "Гелий","благородный газ","1s2","4.5","бесцветный","-","-",-268.9,-272.2,"",4.0026,"https://ru.wikipedia.org/wiki/%D0%93%D0%B5%D0%BB%D0%B8%D0%B9"));

        listElements.add(new Elements(3, "Li", "Литий","щелочной металл","1s2 2s1","1.0","серебристо- белый","I","+1",1342.0,180.5,"",6.9412,"https://ru.wikipedia.org/wiki/%D0%9B%D0%B8%D1%82%D0%B8%D0%B9"));
        listElements.add(new Elements(4, "Be", "Бериллий","щелочноземельный металл","1s2 2s2","1.5","свинцово-серый","II","+2",2472.0,1287.0,"",9.0122,"https://ru.wikipedia.org/wiki/%D0%91%D0%B5%D1%80%D0%B8%D0%BB%D0%BB%D0%B8%D0%B9"));
        listElements.add(new Elements(5, "B", "Бор","неметалл","1s2 2s2 2p1","2.0","черный","III","-3, +3",4000.0,2079.0,"",10.812,"https://ru.wikipedia.org/wiki/%D0%91%D0%BE%D1%80"));

        listElements.add(new Elements(6, "C", "Углерод","неметалл","1s2 2s2 2p2","2.5","-","II,IV","-4,+2,+4",4827.0,3825.0,"",12.0108,"https://ru.wikipedia.org/wiki/%D0%A3%D0%B3%D0%BB%D0%B5%D1%80%D0%BE%D0%B4"));
        listElements.add(new Elements(7, "N", "Азот","неметалл","1s2 2s2 2p3","3.0","бесцветный","I,II,III,IV","-3,+1,+2,+3,+4,+5",-195.8,-209.9,"",14.0067,"https://ru.wikipedia.org/wiki/%D0%90%D0%B7%D0%BE%D1%82"));
        listElements.add(new Elements(8, "O", "Кислород","неметалл","1s2 2s2 2p4","3.5","светло- голубой","I,II","-1, -2",-182.96,-218.4,"",15.9994,"https://ru.wikipedia.org/wiki/%D0%9A%D0%B8%D1%81%D0%BB%D0%BE%D1%80%D0%BE%D0%B4"));
        listElements.add(new Elements(9, "F", "Фтор","галоген","1s2 2s2 2p5","4.0","светло- желтый","I","-1",-188.14,-219.62,"",18.9984,"https://ru.wikipedia.org/wiki/%D0%A4%D1%82%D0%BE%D1%80"));
        listElements.add(new Elements(10, "Ne", "Неон","Инертный газ","1s2 2s2 2p6","4.4","бесцветный","-","-",-246.05,-248.67,"",20.179,"https://ru.wikipedia.org/wiki/%D0%9D%D0%B5%D0%BE%D0%BD"));



        listElements.add(new Elements(1, "H", "Водород","неметалл","1s1","2.1","бесцветный","I","+1,-1",-252.87,-255.34,"",1.00795,"https://ru.wikipedia.org/wiki/%D0%92%D0%BE%D0%B4%D0%BE%D1%80%D0%BE%D0%B4"));






        return listElements;
    }
}
