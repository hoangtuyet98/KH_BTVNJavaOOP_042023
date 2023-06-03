package BT2.person;

import BT2.person.Person;

public class Infomation {
    public static void main(String[] args) {
        Person person=new Person("tuyet",23,"Nu","ha noi","5678956");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getAdress());
        System.out.println(person.getPhone());

    }
}
