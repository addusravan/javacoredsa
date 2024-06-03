package org.example;

import java.lang.reflect.Array;
import java.util.List;

public class Main {



    public static void main(String[] args) {


        List<Employee>a=EmployeeDatabase.getEmployees();

      double s= a.stream().filter(W->W.getGrade().equals("A")).map(w->w.getSalary()).mapToDouble(i->i).average().getAsDouble();

//       double s= a.stream().mapToInt(e-> (int) e.getSalary()).average().getAsDouble();

//        singleton b=singleton.a;
//        singleton c=singleton.a;
       System.out.println(s);
    }
}