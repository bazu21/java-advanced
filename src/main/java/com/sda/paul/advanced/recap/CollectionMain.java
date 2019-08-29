package com.sda.paul.advanced.recap;

import java.util.*;

public class CollectionMain {


    public static void main(String[] args) {

        //   LIST ///

        //int age, String name, Gender gender, double salary, String subject

        Professor professor1 = new Professor(24,"dorel",Gender.MALE,1200,"geografie");
        Professor professor2 = new Professor(34,"marius",Gender.MALE,1500,"fizica");
        Professor professor3 = new Professor(45,"bazu",Gender.MALE,2200,"matematica");

        List<Professor> listProfessor =  new ArrayList<>();

        listProfessor.add(professor1);
        listProfessor.add(professor2);
        listProfessor.add(professor3);

        System.out.println(listProfessor);
        System.out.println(listProfessor.get(listProfessor.size() - 1 ));


        ///  SET ////


        Set<Professor> setProfessor = new HashSet<>(listProfessor);

        // sau uita te pe urmatoarele 2 randuri

       // Set<Professor> setProfessor = new HashSet<>();
        //setProfessor.addAll(listProfessor);

        //  sau uita te pe urmatoarele 3 randuri

       // setProfessor.add(professor1);
       // setProfessor.add(professor2);
       // setProfessor.add(professor3);

        System.out.println(setProfessor);

        //   MAP  ///////


        Map<String, Professor> professorMap = new HashMap<>();
        professorMap.put("cluj",professor1);
        professorMap.put("dej",professor2);
        professorMap.put("huedin",professor3);

        professorMap.get("cluj"); //CAND STII CHEIA

        //  cand vreau sa parcurg elementele si nu stiu ce element vreau (nu stiu cheia)
        // Entry = un element din map de forma cheie si valoare
        // De exemplu pentru elementul: "Buc", professor1
        //    entry.getKey() = "Buc"
        //    entry.getValue() = professor1;


        for (Map.Entry<String,Professor>entry:professorMap.entrySet()){

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println(professorMap);


//        static void exists() throws URISyntaxException{
//
//            List<Integer> studentGrades = new ArrayList<>();
//            studentGrades.add(7);
//            studentGrades.add(9);
//            studentGrades.add(10);
//
//            //Aici Prindem Checked exception
//            try { // incepem blocul de try, in care scriem codul care POATE sa arunce exceptie
//                URI uri = new URI(""); // instructiunea de cod care poate sa arunce exceptie
//            } catch (URISyntaxException exception) { // exceptia care ne asteptam sa fie aruncata
//                System.out.println("ERROR ON OPENING FILE"); // codul care vrem sa se ruleze in caz de exceptie
//            }
//
//
//            //Aici aruncam exceptia mai departe
//            URI uri = new URI("");
//
//            Director director = new Director(55, 0);
//            Professor prof = new Professor(33, 0);
//            director.pay(2000);
//            prof.pay(1000);
//            System.out.println(director.getSalary());
//
//        }
//
//
//
//
//
//
//
//
   }
}
