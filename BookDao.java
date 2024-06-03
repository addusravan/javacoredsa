package org.example;

import java.util.ArrayList;
import java.util.List;

public class BookDao
{
  public  List<Book>getBook()  {
      ArrayList <Book>s=new ArrayList<>();
      s.add( new Book(1,"fivepoint",23));
      s.add( new Book(4,"revolution",26));
      s.add( new Book(4,"revolution",29));
      s.add( new Book(2,"twenty",22));
      s.add( new Book(3,"ramayan",231));
      s.add( new Book(3,"ramayan",21));
      return s;
  }
}
