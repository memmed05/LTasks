package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        AgeCategory age=new AgeCategory();
    Person person1=new Person("Memmed","Hemidov",18,400);
    Person person2=new Person("Ali","Nasrullayev",56,200);
    Person person3=new Person("Elvin","Veliyev",94,250);
    Person person4=new Person("Firat","Shahverdiyev",60,150);
    Person person5=new Person("Ilham","Aliyev",115,600);
        List<Person> personList=new ArrayList<>();
        UpdateSalary update=new UpdateSalary();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        for (int i=0;i<personList.size();i++){
            System.out.println(personList.get(i).getName()+" "+personList.get(i).getLastName()+" "+personList.get(i).getAge()+" "+personList.get(i).getSalary());
        }
        System.out.println("-------------------------------------------------------");
        for (int i=0;i<personList.size();i++){
            System.out.println(personList.get(i).getName()+" "+personList.get(i).getLastName()+" "+personList.get(i).getAge()+" "+age.Category(personList.get(i).age));
        }
        System.out.println("-------------------------------------------------------");
        for (int i=0;i<personList.size();i++){
            personList.get(i).setSalary(update.salary(personList.get(i).getSalary()));
        }
        for (int i=0;i<personList.size();i++){
            System.out.println(personList.get(i).getName()+" "+personList.get(i).getLastName()+" "+personList.get(i).getSalary());
        }
    }
}
