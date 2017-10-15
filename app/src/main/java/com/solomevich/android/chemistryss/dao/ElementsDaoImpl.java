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



        listElements.add(new Elements(11, "Na", "Натрий", "Щелочной металл", "1s2 2s2 2p6 3s1", "0.9", "серебристо- белый (в чистом виде - розовый) ", "I", "+1", 882.9, 97.81, "", 22.9898, "https://ru.wikipedia.org/wiki/%D0%9D%D0%B0%D1%82%D1%80%D0%B8%D0%B9"));

        listElements.add(new Elements(12, "Mg", "Магний", "Щелочноземельный металл", "1s2 2s2 2p6 3s2", "1.2", "серебристо- белый", "II", "+2", 1090.0, 648.8, "", 24.305, "https://ru.wikipedia.org/wiki/%D0%9C%D0%B0%D0%B3%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(13, "Al", "Алюминий", "Металл", "1s2 2s2 2p6 3s2 3p1", "1.5", "серебристый", "III", "+3", 2519.0, 660.4, "", 26.98154, "https://ru.wikipedia.org/wiki/%D0%90%D0%BB%D1%8E%D0%BC%D0%B8%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(14, "Si", "Кремний", "Неметалл", "1s2 2s2 2p6 3s2 3p2", "1.8", "темно- серый (с синеватым оттенком)", "IV", "-4,+4", 3265.0, 1410.0, "", 28.086, "https://ru.wikipedia.org/wiki/%D0%9A%D1%80%D0%B5%D0%BC%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(15, "P", "Фосфор", "Неметалл", "1s2 2s2 2p6 3s2 3p3", "2.1", "бесцветный/красный/черный", "III,V", "-3,+3,+5", 277.0, 44.1, "", 30.9738, "https://ru.wikipedia.org/wiki/%D0%A4%D0%BE%D1%81%D1%84%D0%BE%D1%80"));
        listElements.add(new Elements(16, "S", "Сера", "Неметалл", "1s2 2s2 2p6 3s2 3p4", "2.5", "лимонно- желтый", "II,IV,VI", "-2,+2,+4,+6", 444.6, 115.21, "", 32.06, "https://ru.wikipedia.org/wiki/%D0%A1%D0%B5%D1%80%D0%B0"));
        listElements.add(new Elements(17, "Cl", "Хлор", "Галоген", "1s2 2s2 2p6 3s2 3p5", "3.0", "желто-зеленый", "I,III,V,VII", "-1,+1,+3,+5,+7", -34.6, -100.98, "", 35.453, "https://ru.wikipedia.org/wiki/%D0%A5%D0%BB%D0%BE%D1%80"));
        listElements.add(new Elements(18, "Ar", "Аргон", "Инертный газ", "1s2 2s2 2p6 3s2 3p6", "4.3", "бесцветный", "-", "-", -185.7, -189.2, "", 39.948, "https://ru.wikipedia.org/wiki/%D0%90%D1%80%D0%B3%D0%BE%D0%BD"));
        listElements.add(new Elements(19, "K", "Калий", "Щелочной металл", "[Ar] 4s1", "0.82", "серебристо- белый", "I", "+1", 774.0, 63.51, "", 39.0983, "https://ru.wikipedia.org/wiki/%D0%9A%D0%B0%D0%BB%D0%B8%D0%B9"));
        listElements.add(new Elements(20, "Ca", "Кальций", "Щелочноземельный металл", "[Ar] 4s2", "1.0", "серебристо- белый", "II", "+2", 1484.0, 839.0, "", 40.078, "https://ru.wikipedia.org/wiki/%D0%9A%D0%B0%D0%BB%D1%8C%D1%86%D0%B8%D0%B9"));
        listElements.add(new Elements(21, "Sc", "Скандий", "Переходный металл", "[Ar] 3d1 4s2", "1.36", "серебристый с желтым отливом", "III", "+1,+2,+3", 2837.0, 1541.0, "", 44.9559, "https://ru.wikipedia.org/wiki/%D0%A1%D0%BA%D0%B0%D0%BD%D0%B4%D0%B8%D0%B9#.D0.A5.D0.B8.D0.BC.D0.B8.D1.87.D0.B5.D1.81.D0.BA.D0.B8.D0.B5_.D1.81.D0.B2.D0.BE.D0.B9.D1.81.D1.82.D0.B2.D0.B0"));
        listElements.add(new Elements(22, "Ti", "Титан", "Переходный металл", "[Ar] 3d2 4s2", "1.36", "серебристо- белый", "IV", "+4", 3287.0, 1660.0, "", 47.88, "https://ru.wikipedia.org/wiki/%D0%A2%D0%B8%D1%82%D0%B0%D0%BD_(%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82)"));
        listElements.add(new Elements(23, "V", "Ванадий", "Переходный металл", "[Ar] 3d3 4s2", "1.63", "серебристо- белый", "II,III,IV,V", "+2,+3,+4,+5", 3377.0, 1887.0, "", 50.9415, "https://ru.wikipedia.org/wiki/%D0%92%D0%B0%D0%BD%D0%B0%D0%B4%D0%B8%D0%B9"));
        listElements.add(new Elements(24, "Cr", "Хром", "Переходный металл", "[Ar] 3d5 4s1", "1.66", "голубовато- белый", "II,III,VI", "+2,+3,+6", 2672.0, 1857.0, "", 51.9961, "https://ru.wikipedia.org/wiki/%D0%A5%D1%80%D0%BE%D0%BC"));
        listElements.add(new Elements(25, "Mn", "Марганец", "Переходный металл", "[Ar] 3d5 4s2", "1.55", "светло- серый", "II,III,IV,VI,VII", "+2,+3,+4,+6,+7", 1962.0, 1244.0, "", 54.938, "https://ru.wikipedia.org/wiki/%D0%9C%D0%B0%D1%80%D0%B3%D0%B0%D0%BD%D0%B5%D1%86"));
        listElements.add(new Elements(26, "Fe", "Железо", "Переходный металл", "[Ar] 3d6 4s2", "1.83", "серебристо- белый", "II,III,VI", "+2,+3,+6", 2861.0, 1539.0, "", 55.847, "https://ru.wikipedia.org/wiki/%D0%96%D0%B5%D0%BB%D0%B5%D0%B7%D0%BE"));
        listElements.add(new Elements(27, "Co", "Кобальт", "Переходный металл", "[Ar] 3d7 4s2", "1.88", "серебристо- белый", "II,III,VI", "+1,+2,+3,+4,+5", 2870.0, 1495.0, "", 58.9332, "https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%B1%D0%B0%D0%BB%D1%8C%D1%82"));
        listElements.add(new Elements(28, "Ni", "Никель", "Переходный металл", "[Ar] 3d8 4s2", "1.91", "серебристо- белый", "II,III,VI", "обычно +2,+3; редко +1,+4", 2732.0, 1453.0, "", 58.6932, "https://ru.wikipedia.org/wiki/%D0%9D%D0%B8%D0%BA%D0%B5%D0%BB%D1%8C"));
        listElements.add(new Elements(29, "Cu", "Медь", "Переходный металл", "[Ar] 3d10 4s1", "1.90", "золотисто- розовый", "I,II", "+1,+2,+3", 2567.0, 1084.0, "", 63.546, "https://ru.wikipedia.org/wiki/%D0%9C%D0%B5%D0%B4%D1%8C"));
        listElements.add(new Elements(30, "Zn", "Цинк", "Переходный металл", "[Ar] 3d10 4s2", "1.65", "голубовато- белый", "II", "+2", 906.0, 420.0, "", 65.39, "https://ru.wikipedia.org/wiki/%D0%A6%D0%B8%D0%BD%D0%BA"));
        listElements.add(new Elements(31, "Ga", "Галий", "Металл", "[Ar] 3d10 4s2 4p1", "1.81", "серебристо- белый (с синеватым оттенком)", "III", "+3; редко +2", 2204.0, 29.8, "", 69.723, "https://ru.wikipedia.org/wiki/%D0%93%D0%B0%D0%BB%D0%BB%D0%B8%D0%B9"));
        listElements.add(new Elements(32, "Ge", "Германий", "Полуметалл, полупроводник", "[Ar] 3d10 4s2 4p2", "2.01", "светло- серый", "II, IV", "-4,+2,+4", 2830.0, 938.0, "", 72.59, "https://ru.wikipedia.org/wiki/%D0%93%D0%B0%D0%BB%D0%BB%D0%B8%D0%B9"));
        listElements.add(new Elements(33, "As", "Мышьяк", "Полуметалл", "[Ar] 3d10 4s2 4p3", "2.18", "зеленоватый", "III, V", "-3,+3,+5; редко +2", 613.0, 613.0, "", 74.921, "https://ru.wikipedia.org/wiki/%D0%9C%D1%8B%D1%88%D1%8C%D1%8F%D0%BA"));
        listElements.add(new Elements(34, "Se", "Селен", "Радиоактивный неметалл", "[Ar] 3d10 4s2 4p4", "2.55", "черный, серый, красный", "II, IV, VI", "-2,+4,+6; редко +2", 685.0, 217.0, "", 78.96, "https://ru.wikipedia.org/wiki/%D0%A1%D0%B5%D0%BB%D0%B5%D0%BD"));
        listElements.add(new Elements(35, "Br", "Бром", "Галоген", "[Ar] 3d10 4s2 4p5", "2.96", "красно- бурый", "I, III, V, VII", "-1,+1,+3,+5,+7", 59.0, -7.25, "", 79.904, "https://ru.wikipedia.org/wiki/%D0%91%D1%80%D0%BE%D0%BC"));
        listElements.add(new Elements(36, "Kr", "Криптон", "Инертный газ", "[Ar] 3d10 4s2 4p6", "3.0", "без цвета", "-", "-", -152.3, -156.6, "", 83.8, "https://ru.wikipedia.org/wiki/%D0%9A%D1%80%D0%B8%D0%BF%D1%82%D0%BE%D0%BD"));
        listElements.add(new Elements(37, "Rb", "Рубидий", "Щелочной радиоактивный металл", "[Kr] 5s1", "0.82", "серебристо- белый", "I", "+1", 688.0, 39.05, "", 85.4678, "https://ru.wikipedia.org/wiki/%D0%A0%D1%83%D0%B1%D0%B8%D0%B4%D0%B8%D0%B9"));
        listElements.add(new Elements(38, "Sr", "Стронций", "Щелочноземельный металл", "[Kr] 5s2", "0.95", "серебристо- белый", "II", "+2", 1384.0, 769.0, "", 87.62, "https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D1%80%D0%BE%D0%BD%D1%86%D0%B8%D0%B9"));
        listElements.add(new Elements(39, "Y", "Иттрий", "Переходный металл", "[Kr] 4d1 5s2", "1.22", "светло- серебристый", "III", "+3", 3338.0, 1522.0, "", 88.9059, "https://ru.wikipedia.org/wiki/%D0%98%D1%82%D1%82%D1%80%D0%B8%D0%B9"));
        listElements.add(new Elements(40, "Zr", "Цирконий", "Переходный металл", "[Kr] 4d2 5s2", "1.33", "серебристо- белый", "I,II,III,IV", "+1,+2,+3,+4", 4377.0, 1852.0, "", 91.224, "https://ru.wikipedia.org/wiki/%D0%A6%D0%B8%D1%80%D0%BA%D0%BE%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(41, "Nb", "Ниобий", "Переходный металл", "[Kr] 4d4 5s1", "1.6", "серебристо- белый", "I,II,III,IV,V", "+1,+2,+3,+4,+5", 4742.0, 2468.0, "", 92.9064, "https://ru.wikipedia.org/wiki/%D0%9D%D0%B8%D0%BE%D0%B1%D0%B8%D0%B9"));
        listElements.add(new Elements(42, "Mo", "Молибден", "Переходный металл", "[Kr] 4d5 5s1", "2.16", "серебристо- белый", "II,III,IV,V,VI", "+2,+3,+4,+5,+6", 4612.0, 2617.0, "", 95.94, "https://ru.wikipedia.org/wiki/%D0%9C%D0%BE%D0%BB%D0%B8%D0%B1%D0%B4%D0%B5%D0%BD"));
        listElements.add(new Elements(43, "Tc", "Технеций", "Переходный металл", "[Kr] 4d5 5s2", "1.9", "серебристо- белый", "I,II,III,IV,V,VI,VII", "от −1 до +7; наиболее устойчива +7", 4877.0, 2172.0, "", 97.9072, "https://ru.wikipedia.org/wiki/%D0%A2%D0%B5%D1%85%D0%BD%D0%B5%D1%86%D0%B8%D0%B9"));
        listElements.add(new Elements(44, "Ru", "Рутений", "Переходный металл", "[Kr] 4d7 5s1", "2.2", "серебристо- белый", "III,IV,VI", "+3, +4, +6, +8", 3804.0, 2061.0, "", 101.07, "https://ru.wikipedia.org/wiki/%D0%A0%D1%83%D1%82%D0%B5%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(45, "Rh", "Родий", "Переходный металл", "[Kr] 4d8 5s1", "2.28", "серебристо- белый", "II,III,IV,VI", "+2,+3,+4,+6", 3727.0, 1966.0, "", 102.9055, "https://ru.wikipedia.org/wiki/%D0%A0%D0%BE%D0%B4%D0%B8%D0%B9"));
        listElements.add(new Elements(46, "Pd", "Палладий", "Переходный металл", "[Kr] 4d10", "2.20", "серебристо- белый", "I,II,III,IV", "+1, +2 -наиболее часто; +3, +4 -часто; +5, +6 -очень редко", 2667.0, 1554.0, "", 106.42, "https://ru.wikipedia.org/wiki/%D0%9F%D0%B0%D0%BB%D0%BB%D0%B0%D0%B4%D0%B8%D0%B9"));
        listElements.add(new Elements(47, "Ag", "Серебро", "Переходный благородный металл", "[Kr] 4d10 5s1", "1.93", "серебристо- белый", "I,II", "+1; очень редко +2,+3", 2212.0, 962.0, "", 107.8682, "https://ru.wikipedia.org/wiki/%D0%A1%D0%B5%D1%80%D0%B5%D0%B1%D1%80%D0%BE"));
        listElements.add(new Elements(48, "Cd", "Кадмий", "Переходный металл", "[Kr] 4d10 5s2", "1.69", "серебристо- серый", "II", "+2", 765.0, 321.0, "", 112.41, "https://ru.wikipedia.org/wiki/%D0%9A%D0%B0%D0%B4%D0%BC%D0%B8%D0%B9"));
        listElements.add(new Elements(49, "In", "Индий", "Радиоактивный металл", "[Kr] 4d10 5s2 5p1", "1.78", "серебристо- белый", "I,III", "+1,+3", 2080.0, 156.0, "", 114.82, "https://ru.wikipedia.org/wiki/%D0%98%D0%BD%D0%B4%D0%B8%D0%B9"));
        listElements.add(new Elements(50, "Sn", "Олово", "Металл", "[Kr] 4d10 5s2 5p2", "1.96", "серебристо- белый", "II,IV", "+2,+4", 2600.0, 231.0, "", 118.71, "https://ru.wikipedia.org/wiki/%D0%9E%D0%BB%D0%BE%D0%B2%D0%BE"));
        listElements.add(new Elements(51, "Sb", "Сурьма", "Полуметалл", "[Kr] 4d10 5s2 5p3", "2.05", "серебристо- белый", "III,V", "-3,+3,+5", 1635.0, 631.0, "", 121.7, "https://ru.wikipedia.org/wiki/%D0%A1%D1%83%D1%80%D1%8C%D0%BC%D0%B0"));
        listElements.add(new Elements(52, "Te", "Теллур", "Полуметалл, халькоген", "[Kr] 4d10 5s2 5p4", "2.1", "серебристый", "II,IV,VI", "-2,+2,+4,+6", 990.0, 450.0, "", 127.6, "https://ru.wikipedia.org/wiki/%D0%A2%D0%B5%D0%BB%D0%BB%D1%83%D1%80"));
        listElements.add(new Elements(53, "I", "Иод", "Галоген", "[Kr] 4d10 5s2 5p5", "2.66", "темно- серый", "I,III,V,VII", "-1,+1,+3,+5,+7", 184.0, 114.0, "", 126.9045, "https://ru.wikipedia.org/wiki/%D0%98%D0%BE%D0%B4"));
        listElements.add(new Elements(54, "Xe", "Ксенон", "Инертный газ", "[Kr] 4d10 5s2 5p6", "2.6", "без цвета", "-", "-", -107.0, -112.0, "", 131.29, "https://ru.wikipedia.org/wiki/%D0%9A%D1%81%D0%B5%D0%BD%D0%BE%D0%BD"));
        listElements.add(new Elements(55, "Cs", "Цезий", "Щелочной металл", "[Xe] 6s1", "0.79", "серебристо- желтый", "I", "+1", 688.0, 28.5, "", 132.9054, "https://ru.wikipedia.org/wiki/%D0%A6%D0%B5%D0%B7%D0%B8%D0%B9"));
        listElements.add(new Elements(56, "Ba", "Барий", "Щелочноземельный металл", "[Xe] 6s2", "0.89", "серебристо- белый", "II", "+2", 1637.0, 729.0, "", 137.33, "https://ru.wikipedia.org/wiki/%D0%91%D0%B0%D1%80%D0%B8%D0%B9"));
        listElements.add(new Elements(57, "La", "Лантан", "Металл, лантаноид", "[Xe] 5d1 6s2", "1.10", "серебристо- белый", "III", "+3", 3174.0, 647.0, "", 138.9055, "https://ru.wikipedia.org/wiki/%D0%9B%D0%B0%D0%BD%D1%82%D0%B0%D0%BD"));
        listElements.add(new Elements(58, "Ce", "Церий", "Металл, лантаноид", "[Xe] 4f1 5d1 6s2", "1.12", "железно- серый", "III,IV", "+3,+4", 3426.0, 799.0, "", 140.116, "https://ru.wikipedia.org/wiki/%D0%A6%D0%B5%D1%80%D0%B8%D0%B9"));
        listElements.add(new Elements(59, "Pr", "Празеодим", "Металл, лантаноид", "[Xe] 4f3 6s2", "1.13", "серебристо- белый", "III,IV", "+3,+4", 3512.0, 931.0, "", 140.9077, "https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D0%B0%D0%B7%D0%B5%D0%BE%D0%B4%D0%B8%D0%BC"));
        listElements.add(new Elements(60, "Nd", "Неодим", "Металл, лантаноид", "[Xe] 4f4 6s2", "1.14", "серебристо- белый", "III", "+3", 3068.0, 1021.0, "", 144.24, "https://ru.wikipedia.org/wiki/%D0%9D%D0%B5%D0%BE%D0%B4%D0%B8%D0%BC"));
        listElements.add(new Elements(61, "Pm", "Прометий", "Металл, лантаноид", "[Xe] 4f5 6s2", "1.1", "светло- серый", "III", "+3", 3000.0, 1681.0, "", 144.9128, "https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D0%BE%D0%BC%D0%B5%D1%82%D0%B8%D0%B9"));
        listElements.add(new Elements(62, "Sm", "Самарий", "Металл, лантаноид", "[Xe] 4f6 6s2", "1.17", "серебристый", "II,III", "+2,+3", 1791.0, 1077.0, "", 150.36, "https://ru.wikipedia.org/wiki/%D0%A1%D0%B0%D0%BC%D0%B0%D1%80%D0%B8%D0%B9"));
        listElements.add(new Elements(63, "Eu", "Европий", "Металл, лантаноид", "[Xe] 4f7 6s2", "1.2", "серебристо- серый", "II,III", "+2,+3", 1597.0, 822.0, "", 151.96, "https://ru.wikipedia.org/wiki/%D0%95%D0%B2%D1%80%D0%BE%D0%BF%D0%B8%D0%B9"));
        listElements.add(new Elements(64, "Gd", "Гадолиний", "Металл, лантаноид", "[Xe] 4f7 5d1 6s2", "1.2", "серебристо- белый", "III", "+3", 3266.0, 1313.0, "", 157.25, "https://ru.wikipedia.org/wiki/%D0%93%D0%B0%D0%B4%D0%BE%D0%BB%D0%B8%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(65, "Tb", "Тербий", "Металл, лантаноид", "[Xe] 4f9 6s2", "1.2", "серебристо- белый", "III,IV", "+3,+4", 3023.0, 1356.0, "", 159.9254, "https://ru.wikipedia.org/wiki/%D0%A2%D0%B5%D1%80%D0%B1%D0%B8%D0%B9"));
        listElements.add(new Elements(66, "Dy", "Дубний", "Металл, лантаноид", "[Xe] 4f10 6s2", "-", "серебристый", "III,IV,V", "+3,+4,+5", 2562.0, 1412.0, "", 162.5, "https://ru.wikipedia.org/wiki/%D0%94%D1%83%D0%B1%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(67, "Ho", "Гольмий", "Металл, лантаноид", "[Xe] 4f11 6s2", "1.23", "серебристый", "III", "+3", 2695.0, 1474.0, "", 164.9304, "https://ru.wikipedia.org/wiki/%D0%93%D0%BE%D0%BB%D1%8C%D0%BC%D0%B8%D0%B9"));
        listElements.add(new Elements(68, "Er", "Эрбий", "Металл, лантаноид", "[Xe] 4f12 6s2", "1.24", "серебристый", "III", "+3", 2863.0, 1529.0, "", 167.26, "https://ru.wikipedia.org/wiki/%D0%AD%D1%80%D0%B1%D0%B8%D0%B9"));
        listElements.add(new Elements(69, "Tm", "Тулий", "Металл, лантаноид", "[Xe] 4f13 6s2", "1.25", "серебристо- белый", "II,III", "+2,+3", 1947.0, 1545.0, "", 168.9342, "https://ru.wikipedia.org/wiki/%D0%A2%D1%83%D0%BB%D0%B8%D0%B9"));
        listElements.add(new Elements(70, "Yb", "Иттербий", "Металл, лантаноид", "[Xe] 4f144 6s2", "1.1", "серебристый", "II,III", "+2,+3", 1193.0, 824.0, "", 173.04, "https://ru.wikipedia.org/wiki/%D0%98%D1%82%D1%82%D0%B5%D1%80%D0%B1%D0%B8%D0%B9"));
        listElements.add(new Elements(71, "Lu", "Лютеций", "Металл, лантаноид", "[Xe] 4f14 5d1 6s2", "1.27", "серебристо- белый", "III", "+3", 3395.0, 1663.0, "", 174.967, "https://ru.wikipedia.org/wiki/%D0%9B%D1%8E%D1%82%D0%B5%D1%86%D0%B8%D0%B9"));
        listElements.add(new Elements(72, "Hf", "Гафний", "Переходный металл", "[Xe] 4f14 5d2 6s2", "1.3", "серебристый", "II,III,IV", "+2,+3,+4", 4603.0, 2233.0, "", 178.49, "https://ru.wikipedia.org/wiki/%D0%93%D0%B0%D1%84%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(73, "Ta", "Тантал", "Переходный металл", "[Xe] 4f14 5d3 6s2", "1.5", "серый", "V", "+5", 5458.0, 3017.0, "", 180.9479, "https://ru.wikipedia.org/wiki/%D0%A2%D0%B0%D0%BD%D1%82%D0%B0%D0%BB_(%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82)"));
        listElements.add(new Elements(74, "W", "Вольфрам", "Переходный металл", "[Xe] 4f14 5d4 6s2", "2.3", "стальной", "II,III,IV,V,VI", "+2,+3,+4,+5,+6", 5555.0, 3422.0, "", 183.85, "https://ru.wikipedia.org/wiki/%D0%92%D0%BE%D0%BB%D1%8C%D1%84%D1%80%D0%B0%D0%BC"));
        listElements.add(new Elements(75, "Re", "Рений", "Переходный металл", "[Xe] 4f14 5d5 6s2", "1.9", "серебристо- белый", "I,II,III,IV,V,VI,VII", "-1,+1,+2,+3,+4,+5,+6,+7", 5555.0, 3422.0, "", 186.207, "https://ru.wikipedia.org/wiki/%D0%A0%D0%B5%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(76, "Os", "Осмий", "Переходный металл", "[Xe] 4f14 5d6 6s2", "2.2", "серебристо- белый", "I,II,III,IV,V,VI,VII", "-2,+2,+3,+4,+6,+8", 5012.0, 3033.0, "", 190.2, "https://ru.wikipedia.org/wiki/%D0%9E%D1%81%D0%BC%D0%B8%D0%B9"));
        listElements.add(new Elements(77, "Ir", "Иридий", "Переходный металл", "[Xe] 4f14 5d7 6s2", "2.2", "серебристо- белый", "I,II,III,IV,V,VI", "+1,+2,+3,+4,+5,+6", 4428.0, 2466.0, "", 192.22, "https://ru.wikipedia.org/wiki/%D0%98%D1%80%D0%B8%D0%B4%D0%B8%D0%B9"));
        listElements.add(new Elements(78, "Pt", "Платина", "Переходный благородный металл", "[Xe] 4f14 5d9 6s1", "2.28", "серебристо- белый", "II,IV", "+2,+4", 3825.0, 1768.0, "", 195.08, "https://ru.wikipedia.org/wiki/%D0%9F%D0%BB%D0%B0%D1%82%D0%B8%D0%BD%D0%B0"));
        listElements.add(new Elements(79, "Au", "Золото", "Переходный благородный металл", "[Xe] 4f14 5d10 6s1", "2.64", "желтый", "I,III,V", "-1,+1,+3,+5", 2856.0, 1064.0, "", 196.9665, "https://ru.wikipedia.org/wiki/%D0%97%D0%BE%D0%BB%D0%BE%D1%82%D0%BE"));
        listElements.add(new Elements(80, "Hg", "Ртуть", "Переходный металл", "[Xe] 4f14 5d10 6s2", "2.00", "серебристо- белый", "I,II", "+1,+2", 357.0, -39.0, "", 200.59, "https://ru.wikipedia.org/wiki/%D0%A0%D1%82%D1%83%D1%82%D1%8C"));
        listElements.add(new Elements(81, "Tl", "Таллий", "Металл", "[Xe] 4f14 5d10 6s2 6p1", "1.62", "серебристо- белый", "I,III", "+1,+3", 1473.0, 304.0, "", 204.383, "https://ru.wikipedia.org/wiki/%D0%A2%D0%B0%D0%BB%D0%BB%D0%B8%D0%B9"));
        listElements.add(new Elements(82, "Pb", "Свинец", "Металл", "[Xe] 4f14 5d10 6s2 6p2", "1.8", "серебристо- серый", "II,IV", "+2,+4", 1749.0, 328.0, "", 207.2, "https://ru.wikipedia.org/wiki/%D0%A1%D0%B2%D0%B8%D0%BD%D0%B5%D1%86"));
        listElements.add(new Elements(83, "Bi", "Висмут", "Металл", "[Xe] 4f14 5d10 6s2 6p3", "2.02", "серебристый", "III,V", "+3,+5", 1610.0, 272.0, "", 208.9804, "https://ru.wikipedia.org/wiki/%D0%92%D0%B8%D1%81%D0%BC%D1%83%D1%82"));
        listElements.add(new Elements(84, "Po", "Полоний", "Полуметалл, халькоген", "[Xe] 4f14 5d10 6s2 6p4", "2.02", "серебристо-серый", "II,IV,VI", "-2,+2,+4,+6", 962.0, 254.0, "", 208.9824, "https://ru.wikipedia.org/wiki/%D0%9F%D0%BE%D0%BB%D0%BE%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(85, "At", "Астат", "Неметалл, галоген", "[Xe] 4f14 5d10 6s2 6p5", "2.5", "черно- синий", "I,III,V,VII", "-1,+1,+3,+5,+7", 309.0, 244.0, "", 209.9871, "https://ru.wikipedia.org/wiki/%D0%90%D1%81%D1%82%D0%B0%D1%82"));
        listElements.add(new Elements(86, "Rn", "Радон", "Инертный газ", "[Xe] 4f14 5d10 6s2 6p6", "-", "бесцветный", "II,IV,VI,VIII", "+2,+4,+6,+8", -62.0, -71.0, "", 222.0176, "https://ru.wikipedia.org/wiki/%D0%A0%D0%B0%D0%B4%D0%BE%D0%BD"));
        listElements.add(new Elements(87, "Fr", "Франций", "Щелочной металл", "[Rn] 7s1", "0.7", "", "I", "+1", 640.0, 18.0, "", 223.0197, "https://ru.wikipedia.org/wiki/%D0%A4%D1%80%D0%B0%D0%BD%D1%86%D0%B8%D0%B9"));
        listElements.add(new Elements(88, "Ra", "Радий", "Щелочноземельный металл", "[Rn] 7s2", "0.9", "", "II", "+2", 1737.0, 700.0, "", 226.0254, "https://ru.wikipedia.org/wiki/%D0%A0%D0%B0%D0%B4%D0%B8%D0%B9"));
        listElements.add(new Elements(89, "Ac", "Актиний", "Актиноид", "[Rn] 6d1 7s2", "1.1", "", "III", "+3", 3197.0, 1047.0, "", 227.0278, "https://ru.wikipedia.org/wiki/%D0%90%D0%BA%D1%82%D0%B8%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(90, "Th", "Торий", "Актиноид", "[Rn] 6d2 7s2", "1.3", "", "IV", "+4", 4787.0, 1755.0, "", 232.0381, "https://ru.wikipedia.org/wiki/%D0%A2%D0%BE%D1%80%D0%B8%D0%B9"));
        listElements.add(new Elements(91, "Pa", "Протактиний", "Актиноид", "[Rn] 5f2 6d1 7s2", "1.5", "", "IV,V", "+4,+5", 4027.0, 1840.0, "", 231.0359, "https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D0%BE%D1%82%D0%B0%D0%BA%D1%82%D0%B8%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(92, "U", "Уран", "Актиноид", "[Rn] 5f3 6d1 7s2", "1.38", "серебристо- белый", "III,IV,V,VI", "+3,+4,+5,+6", 3745.0, 1133.0, "", 238.0289, "https://ru.wikipedia.org/wiki/%D0%A3%D1%80%D0%B0%D0%BD_(%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82)"));
        listElements.add(new Elements(93, "Np", "Нептуний", "Актиноид", "[Rn] 5f4 6d1 7s2", "1.36", "серебристо- белый", "III,IV,V,VI,VII", "+3,+4,+5,+6,+7", 3902.0, 640.0, "", 237.0482, "https://ru.wikipedia.org/wiki/%D0%9D%D0%B5%D0%BF%D1%82%D1%83%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(94, "Pu", "Плутоний", "Актиноид", "[Rn] 5f6 7s2", "1.28", "серебристый", "II,III,IV,V,VI,VII", "+2,+3,+4,+5,+6,+7", 3234.0, 639.0, "", 244.0642, "https://ru.wikipedia.org/wiki/%D0%9F%D0%BB%D1%83%D1%82%D0%BE%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(95, "Am", "Америций", "Актиноид", "[Rn] 5f7 7s2", "1.3", "серебристо- белый", "III,IV,V,VI", "+3,+4,+5,+6", 2607.0, 994.0, "", 243.06144, "https://ru.wikipedia.org/wiki/%D0%90%D0%BC%D0%B5%D1%80%D0%B8%D1%86%D0%B8%D0%B9"));
        listElements.add(new Elements(96, "Cm", "Кюрий", "Актиноид", "[Rn] 5f7 6d1 7s2", "1.3", "серебристый", "III,IV", "+3,+4", 3110.0, 1340.0, "", 247.0703, "https://ru.wikipedia.org/wiki/%D0%9A%D1%8E%D1%80%D0%B8%D0%B9"));
        listElements.add(new Elements(97, "Bk", "Берклий", "Актиноид", "[Rn] 5f9 7s2", "1.3", "серебристо- белый", "III,IV", "+3,+4", 2627.0, 986.0, "", 247.0703, "https://ru.wikipedia.org/wiki/%D0%91%D0%B5%D1%80%D0%BA%D0%BB%D0%B8%D0%B9"));
        listElements.add(new Elements(98, "Cf", "Калифорний", "Актиноид", "[Rn] 5f10 7s2", "1.3", "серебристо- белый", "II,III,IV", "+2,+3,+4", 1197.0, 627.0, "", 251.0796, "https://ru.wikipedia.org/wiki/%D0%9A%D0%B0%D0%BB%D0%B8%D1%84%D0%BE%D1%80%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(99, "Es", "Эйнштейний", "Актиноид", "[Rn] 5f11 7s2", "1.3", "серебристый", "II,III,IV", "+2,+3,+4", null, 860.0, "", 252.0828, "https://ru.wikipedia.org/wiki/%D0%AD%D0%B9%D0%BD%D1%88%D1%82%D0%B5%D0%B9%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(100, "Fm", "Фермий", "Актиноид", "[Rn] 5f12 7s2", "1.3", "", "III", "+3", null, 1527.0, "", 257.0951, "https://ru.wikipedia.org/wiki/%D0%A4%D0%B5%D1%80%D0%BC%D0%B8%D0%B9"));
        listElements.add(new Elements(101, "Md", "Менделевий", "Актиноид", "[Rn] 5f13 7s2", "1.3", "", "I,II,III", "+1,+2,+3", null, 827.0, "", 258.0986, "https://ru.wikipedia.org/wiki/%D0%9C%D0%B5%D0%BD%D0%B4%D0%B5%D0%BB%D0%B5%D0%B2%D0%B8%D0%B9"));
        listElements.add(new Elements(102, "No", "Нобелий", "Актиноид", "[Rn] 5f14 7s2", "1.3", "", "II,III", "+2,+3", null, 827.0, "", 259.1009, "https://ru.wikipedia.org/wiki/%D0%9D%D0%BE%D0%B1%D0%B5%D0%BB%D0%B8%D0%B9"));
        listElements.add(new Elements(103, "Lr", "Лоуренсий", "Актиноид", "[Rn] 5f14 6d1 7s2", "1.3", "", "III", "+3", null, 1627.0, "", 260.1054, "https://ru.wikipedia.org/wiki/%D0%9B%D0%BE%D1%83%D1%80%D0%B5%D0%BD%D1%81%D0%B8%D0%B9"));
        listElements.add(new Elements(104, "Rf", "Резерфордий", "Металл, трансактиноид", "[Rn] 5f14 6d2 7s2", "", "", "IV", "+4", null, null, "", 261.0, "https://ru.wikipedia.org/wiki/%D0%A0%D0%B5%D0%B7%D0%B5%D1%80%D1%84%D0%BE%D1%80%D0%B4%D0%B8%D0%B9"));
        listElements.add(new Elements(105, "Db", "Дубний", "Металл, трансактиноид", "[Rn] 5f14 6d3 7s2", "", "", "III,IV,V", "+3,+4,+5", null, null, "", 268.0, "https://ru.wikipedia.org/wiki/%D0%94%D1%83%D0%B1%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(106, "Sg", "Сиборгий", "Металл, трансактиноид", "[Rn] 5f14 6d4 7s2", "", "", "", "", null, null, "", 271.0, "https://ru.wikipedia.org/wiki/%D0%A1%D0%B8%D0%B1%D0%BE%D1%80%D0%B3%D0%B8%D0%B9"));
        listElements.add(new Elements(107, "Bh", "Борий", "Металл, трансактиноид", "[Rn] 5f14 6d5 7s2", "", "", "", "", null, null, "", 267.0, "https://ru.wikipedia.org/wiki/%D0%91%D0%BE%D1%80%D0%B8%D0%B9"));
        listElements.add(new Elements(108, "Hs", "Хассий", "Металл, трансактиноид", "[Rn] 5f14 6d6 7s2", "", "", "", "", null, null, "", 269.0, "https://ru.wikipedia.org/wiki/%D0%A5%D0%B0%D1%81%D1%81%D0%B8%D0%B9"));
        listElements.add(new Elements(109, "Mt", "Мейтнерий", "Металл, трансактиноид", "[Rn] 5f14 6d7 7s2", "", "", "", "", null, null, "", 267.0, "https://ru.wikipedia.org/wiki/%D0%9C%D0%B5%D0%B9%D1%82%D0%BD%D0%B5%D1%80%D0%B8%D0%B9"));
        listElements.add(new Elements(110, "Ds", "Дармштадтий", "Металл, трансактиноид", "[Rn] 5f14 6d9 7s1", "", "", "", "", null, null, "", 281.0, "https://ru.wikipedia.org/wiki/%D0%94%D0%B0%D1%80%D0%BC%D1%88%D1%82%D0%B0%D0%B4%D1%82%D0%B8%D0%B9"));
        listElements.add(new Elements(111, "Rg", "Рентгений", "", "[Rn] 5f14 6d10 7s1", "", "", "", "", null, null, "", 281.0, "https://ru.wikipedia.org/wiki/%D0%A0%D0%B5%D0%BD%D1%82%D0%B3%D0%B5%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(112, "Cn", "Коперниций", "", "[Rn] 5f14 6d10 7s2", "", "", "", "", null, null, "", 285.0, "https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%BF%D0%B5%D1%80%D0%BD%D0%B8%D1%86%D0%B8%D0%B9"));
        listElements.add(new Elements(113, "Nh", "Нихоний", "", "[Rn] 5f14 6d10 7s2 7p1", "", "", "", "", null, null, "", 286.0, "https://ru.wikipedia.org/wiki/%D0%9D%D0%B8%D1%85%D0%BE%D0%BD%D0%B8%D0%B9"));
        listElements.add(new Elements(114, "Fl", "Флеровий", "", "[Rn] 5f14 6d10 7s2 7p2", "", "", "", "", null, null, "", 289.0, "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B5%D1%80%D0%BE%D0%B2%D0%B8%D0%B9"));
        listElements.add(new Elements(115, "Mc", "Московий", "", "[Rn] 5f14 6d10 7s2 7p3", "", "", "", "", null, null, "", 289.0, "https://ru.wikipedia.org/wiki/%D0%9C%D0%BE%D1%81%D0%BA%D0%BE%D0%B2%D0%B8%D0%B9"));
        listElements.add(new Elements(116, "Lv", "Ливерморий", "", "[Rn] 5f14 6d10 7s2 7p4", "", "", "", "", null, null, "", 293.0, "https://ru.wikipedia.org/wiki/%D0%9B%D0%B8%D0%B2%D0%B5%D1%80%D0%BC%D0%BE%D1%80%D0%B8%D0%B9"));
        listElements.add(new Elements(117, "Ts", "Теннессин", "", "[Rn] 5f14 6d10 7s2 7p5", "", "", "", "", null, null, "", 294.0, "https://ru.wikipedia.org/wiki/%D0%A2%D0%B5%D0%BD%D0%BD%D0%B5%D1%81%D1%81%D0%B8%D0%BD"));
        listElements.add(new Elements(118, "Og", "Оганесон", "", "[Rn] 5f14 6d10 7s2 7p6", "", "", "", "", null, null, "", 294.01, "https://ru.wikipedia.org/wiki/%D0%9E%D0%B3%D0%B0%D0%BD%D0%B5%D1%81%D0%BE%D0%BD"));








        return listElements;
    }
}
