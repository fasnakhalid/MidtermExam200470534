package com.example.midtermexam200470534;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Student {
    private int  studentNumber;
    private String firstName, lastName,gender;
    private int telephoneNumber,averageGrade;
    private String province,majorCode;

    public Student(int studentNumber, String firstName, String lastName, String gender, int telephoneNumber, int averageGrade, String province, String majorCode) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.telephoneNumber = telephoneNumber;
        this.averageGrade = averageGrade;
        this.province = province;
        this.majorCode = majorCode;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if(studentNumber>= 200034000 && studentNumber<=200070000 )
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException("Invalid student number");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName.trim();
        if(firstName.length()>1)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("first name should have more than one character");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName.trim();
        if(lastName.length()>1)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("last name should have more than one character");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender =="male" || gender =="female")
            this.gender = gender;
        else
            throw new IllegalArgumentException("Invalid field");
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        if  (telephoneNumber == 123 - 4567890) {
            List phoneNumbers = new ArrayList();
            phoneNumbers.add("123 456 7890");


            String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";

            Pattern pattern = Pattern.compile(regex);


            this.telephoneNumber = telephoneNumber;
        }else
            throw new IllegalArgumentException("Invalid telephone number");

    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        if(averageGrade>0 && averageGrade<=100)
            this.averageGrade = averageGrade;
        else
            throw new IllegalArgumentException("Grade must be in range of 0 to 100 ");
    }

    public static List<String> getProvince(){
        return Arrays.asList("AB","BC","MB","NB","NL","NS","NT","NU","ON","PE","QC","SK","YT" );
    }


    public void setProvince(String province) {
        this.province = province;
    }

    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(String majorCode) {
        majorCode =majorCode.toUpperCase();
        if(majorCode.length()==4)
            this.majorCode = majorCode;
        else
            throw new IllegalArgumentException("Invalid code");
    }
}
