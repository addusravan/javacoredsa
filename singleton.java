package org.example;

public class singleton {

 private singleton(){

 }
    static  singleton a=new singleton();
     static singleton abc(){
     return a;
     }

}
