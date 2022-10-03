package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String,Integer> map= new HashMap<>();
        map.put("dene",5);
        ArrayList<String> arrayList=new ArrayList<>();

        ucnoktametod(5);
        ucnoktametod(5,6,7);


    }

    private static void ucnoktametod(int... parametreListesi) {
        int toplam=0;
        for(int onankisayi: parametreListesi){
            toplam =+ onankisayi;
        }
        System.out.println("Toplam : " + toplam);
    }
}
