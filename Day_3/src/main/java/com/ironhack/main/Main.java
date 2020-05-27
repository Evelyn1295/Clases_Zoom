package com.ironhack.main;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Main{

    public static void main (String[] args){

        BigDecimal bd1 = new BigDecimal(".5");
        BigDecimal bd2 = new BigDecimal(".7");
        BigDecimal bd3 = new BigDecimal(".3");

        //SUMA
        System.out.println(bd1.add(bd2));

        //RESTA
        System.out.println(bd1.subtract(bd2));

        //MULTIPLICACION
        System.out.println(bd1.multiply(bd2));

        //DIVISIÓN
        System.out.println(bd1.divide(bd2));

        //MULTIPLICACION(3)
        System.out.println(bd1.multiply(bd2).multiply(bd3));

        //DIVISIÓN(3)
        System.out.println(bd1.divide(bd2).divide(bd3));

        //DIVISIÓN(4)
        System.out.println(bd1.divide(bd2,3,RoundingMode.HALF_EVEN));


    }


}

