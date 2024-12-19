package com.basic.practice1;
class Student
{
    private int roll_No;
    private String name;
    private String address;

    public int getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_No=" + roll_No +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
public class EncapsulationProgram
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setRoll_No(101);
        s1.setName("Kapil");
        s1.setAddress("Nanded");
        System.out.println(s1);
    }
}
