package sef.FinalActivity;


import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class FirstActivity implements Comparator<Employee> {

    public int compare(Employee a, Employee b){
        return b.salary - a.salary;
    }
    static int i=1;
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();
        Employee employee1 = new Employee("Tomas",28,"Manager","Nuko",950);
        Employee employee2 = new Employee("Viktors",27,"Anayst","Apple",1500);
        Employee employee3 = new Employee("Toms",37,"Programmer","Facebook",2000);
        Employee employee4 = new Employee("Karina",24,"QA","Citadele",2500);
        Employee employee5 = new Employee("Agnija",33,"Developer","Accenture",3000);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);

        System.out.println("Employee List:");
        for( Employee val : list){
            System.out.println(i++ +"."+val);
        }

        Collections.sort(list,new FirstActivity());
        System.out.println();
        System.out.println("Sorted by top salary to less: ");
        int i=1;

        for (Employee val : list){
            System.out.println(i++ + ". "+val);
        }
    }
}