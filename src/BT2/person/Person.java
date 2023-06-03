package BT2.person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String adress;
    private String phone;

    public Person(String name, int age, String gender, String adress, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhone() {
        return phone;
    }
}
