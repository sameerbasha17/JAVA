package JAVA.StaticAndFinal.studentChallenge;

import java.util.*;

// Program to assign roll numbers of students when object is created without passing roll number manually.
// Automatic generation of roll numbers using static - concept.

class Student
{
    private String name;
    private String rollNo;  // Format : Univ-year-number   ex: Univ-2026-1 for first student.
    private String phno;

    private static int cnt = 1;

    public Student(String name, String phno)
    {
        this.name = name;
        this.phno = phno;

        rollNo = generateRollNumber();
    }

    private String generateRollNumber()
    {
        Date d = new Date();
        String rn = "Univ-"+ (d.getYear() + 1900) + "-" + cnt;  // .getYear() is a deprecated method which means not prefferd to use it.
        cnt++;
        return rn;
    }

    public void getStudentDetails()
    {
        System.out.println("Name : " + name);
        System.out.println("Roll NO : " + rollNo);
        System.out.println("Ph no : " + phno);
        System.out.println();
    }
}

public class StudentMain
{
    public static void main(String[] as) 
    {
        Student s1 = new Student("T Vishnu Teja", "1234567890");
        Student s2 = new Student("J Tharun", "1234567890");
        Student s3 = new Student("M Jithu", "1234567890");

        s1.getStudentDetails();
        s2.getStudentDetails();
        s3.getStudentDetails();
    }
}

/*
Output :
--------
Name : T Vishnu Teja
Roll NO : Univ-2026-1
Ph no : 1234567890

Name : J Tharun
Roll NO : Univ-2026-2
Ph no : 1234567890

Name : M Jithu
Roll NO : Univ-2026-3
Ph no : 1234567890

*/