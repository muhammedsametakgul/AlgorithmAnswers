package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static String FindIntersection(String[] strArr) {
        //add first part to an array
        String[] dizi1= strArr[0].split(",");
        ////add second part to an array
        String[] dizi2= strArr[1].split(",");
        String result="";

        for(int i=0;i<dizi1.length;i++){
            for (int j=0;j<dizi2.length;j++){
                if(dizi1[i].trim().equals(dizi2[j].trim())){
                    if(result.length() ==0){
                        result= result+dizi1[i].trim();
                    }else{
                        result= result+" "+dizi1[i].trim();
                    }
                }
            }
        }

        result=result.replace(" ",",");
        return result;

    }

    public static void main (String[] args) {
        String[] dizi= new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        System.out.print(FindIntersection(dizi));
    }

}