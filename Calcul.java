package org.example;

import java.util.*;
import java.util.stream.Collectors;


public class Calcul implements Calculator {








    public static void main(String[] args) {
        List<Book> books = new  BookDao().getBook();
      Map<String,List<Book>>Z=  books.stream().collect(Collectors.groupingBy(Book::getName));
      System.out.println("==========="+Z);



        List<Book> k= books.stream().sorted(Comparator.comparing(a->a.getPages())).collect(Collectors.toList());//sorting list  of objects by cerain feild

        HashMap <Book,Integer>s=new HashMap<>();
//        s.add( new Book(1,"fivepoint",23));
//        s.add( new Book(4,"revolution",26));
//        s.add( new Book(2,"twenty",22));
//        s.add( new Book(3,"ramayan",231));

        s.put(new Book(1,"fivepoint",23),1000);
        s.put(new Book(4,"revolution",26),100);
        s.put( new Book(3,"ramayan",231),1900);
        s.put(new Book(3,"ramayan",231),122);




        List<Map.Entry<Book,Integer>>ea= s.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getPages).reversed())).collect(Collectors.toList());
    //    List<Map.Entry<String,Integer>>ea=s.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());//map sorting using hashmap without converting to list

      //  List<Map.Entry<String,Integer>>e=new ArrayList<>(s.entrySet());

   //     Collections.sort(e,((o1, o2) -> o1.getKey().compareTo(o2.getKey())));//map sorting using hashmap












System.out.println(ea);





//
//
//        Calculator c=(a,b)-> {
//            if(a>b){
//                throw new RuntimeException("bad req");
//            }
//            else{
//                return b-a;
//            }
//
//
//        };





    }


    @Override
    public int add(int a, int b) {
        return 0;
    }
}