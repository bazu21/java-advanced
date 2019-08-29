package com.sda.paul.advanced;

import com.sda.paul.advanced.recap.*;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MavenMain {

    public static void main(String[] args) {

        // facem o pers Person care are
        //age = 22,name didi , gender = f

        Person person = new Person(22,"didi", Gender.FEMALE);
        System.out.println(person);

        Person person1 = new Person();
        person1.setAge(22);
        person1.setName("didi");
        person1.setGender(Gender.FEMALE);
        System.out.println(person1);

        if(person.equals(person1)){

            System.out.println("are equal");

        }else {
            System.out.println("not equal");
        }

        String name = "  ";

        System.out.println(name.isEmpty());
        boolean isBlank = StringUtils.isBlank(name);
        System.out.println(isBlank);


    List<Integer> studentGrades = new ArrayList<>();
    studentGrades.add(7);
    studentGrades.add(8);
    studentGrades.add(3);

    Student student = new Student(18,"marian",Gender.MALE,studentGrades);
        System.out.println(student);
    Professor professor = new Professor(0,"fizica");

    Director director  = new Director(0,"matematica");

    professor.pay(1200);
        System.out.println(professor.getSalary());
    director.pay(2000);

        System.out.println(director.getSalary());


}
}