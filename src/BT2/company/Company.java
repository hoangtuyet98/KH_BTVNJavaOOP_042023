package BT2.company;

import BT2.person.Person;


public class Company {
    public static void main(String[] args) {

        Person person=new Person("tuyet",23,"Nu","ha noi","5678956");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
    }
    }

