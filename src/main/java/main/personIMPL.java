package main;

import data.Address;
import data.Student;

public class personIMPL {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("rishav");
        student.setAge("27");
        student.setColor("brown");
        student.setHeight(5.10);
        student.setClassNo(12);
        student.setRollNo(21);
        student.setSection("a");
        student.setIdCardNumber(123355667);
        student.setEnrollNumber("rn212005");
        Address address = new Address();
        address.setHouseNumber(21);
        address.setCity("bgs");
        address.setCountry("india");
        address.setStreetName("qqwee");
        address.setZipCode(1234);

        student.setAddress(address);
        student.show();
    }
}