package org.example;

import java.util.ArrayList;

public class Main {

static ArrayList <String>a=new ArrayList<>();
private static void seq(String s,String b){

    if(s.length()==0){
       a.add(b) ;


    }

    seq(s.substring(1),b+s.charAt(0));



}


    public static void main(String[] args)


    {

        String a="saturn";
        String b="sun";


        seq(a,b);




   int c=0;


        for (int i=0;i<b.length();i++) {
            for (int j = 0; j < a.length(); j++) {
                if (b.charAt(i)==a.charAt(j)){

                   c++;
                }


            }

            if(c==b.length()){
                System.out.println("yes");
            }

        }



        System.out.println("no");
    }

    }
