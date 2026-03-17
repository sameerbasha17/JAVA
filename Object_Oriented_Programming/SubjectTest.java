// Array of Objects
package JAVA.Object_Oriented_Programming;

public class SubjectTest 
{
    public static void main(String [] args)
    {
        Subject s1 = new Subject("CS2007","Machine Learning");
        System.out.println("Subject Code : " + s1.getSubCode() + "\nSubject Name : " + s1.getSubName() + "\nMaximum marks : " + s1.getMaxMarks() + "\nObtained marks : " + s1.getObtainedMarks());
    
        System.out.print("\n\n");

        Subject s2 = new Subject("CS2016","Cloud Computing", (byte)100, (byte)77);
        System.out.println("Subject Code : " + s2.getSubCode() + "\nSubject Name : " + s2.getSubName() + "\nMaximum marks : " + s2.getMaxMarks() + "\nObtained marks : " + s2.getObtainedMarks());

        System.out.println("\n\n");

        Subject sub[] = new Subject[3];
        sub[0] = new Subject("CS2001", "Operating System", (byte)100, (byte)90);
        sub[1] = new Subject("CS2002", "Database Management System");
        sub[2] = new Subject("CS2006","Java", (byte)100, (byte)97);

        for(Subject x : sub)
            System.out.println(x);

        sub[1].setMarksObtained((byte) 47);
        System.out.println(sub[1]);

        Students stu = new Students("23711A05H7","Sk Sameer Basha","CSE",3);
        System.out.println(stu);

        //stu.setSubs("Java","Data Structures")
    }    
}

class Subject
{
    // Properties
    private String subCode;
    private String subName;
    private byte maxMarks;
    private byte obtainedMarks;

    // Property methods
    public String getSubCode()
    {
        return subCode;
    }
    public String getSubName()
    {
        return subName;
    }
    public byte getMaxMarks()
    {
        return maxMarks;
    }
    public byte getObtainedMarks()
    {
        return obtainedMarks;
    }
    public void setMarksObtained(byte currentMarks)
    {
        obtainedMarks = currentMarks;
    }
    public String toString()
    {
        return "Subject Code : " + getSubCode() + "\nSubject Name : " + getSubName() + "\nMax Marks : " + getMaxMarks() + "\nMarks Obtained : " + getObtainedMarks() + "\n";
    }

    // Constructor
    public Subject (String code, String name)
    {
        subName = name;
        subCode = code;
    }
    public Subject (String code, String name, byte maxMarksAwarded, byte marksGained)
    {
        subName = name;
        subCode = code;
        maxMarks = maxMarksAwarded;
        obtainedMarks = marksGained;
    }
}

class Students 
{
    // properties
    String rollNo;
    String studentName;
    String dept;
    int numSubs;
    Subject subs[];

    // Property methods
    public String getRollNo()
    {
        return rollNo;
    }
    public String getStudentName()
    {
        return studentName;
    }
    public String getDept()
    {
        return dept;
    }
    public int getNumSubs()
    {
        return numSubs;
    }
    public Subject[] getSubs()
    {
        return subs;
    }
    public void setSubs(Subject ...subs)
    {
        for(int i = 0; i < subs.length; i++)
        {
            this.subs[i] = subs[i];
        }
    }

    public String toString()
    {
        return "Name of Student : " + studentName + "\nRoll Number : " + rollNo + "\nDepartment : " + dept + "\nNumber of subjects : " + numSubs + "\nSubjects : " + subs;
    }

    public Students(String rollno, String name, String dept, int num_of_subs)
    {
        rollNo = rollno;
        studentName = name;
        this.dept = dept;
        numSubs = num_of_subs;
    }
}

/*
Output :
========
Subject Code : CS2007
Subject Name : Machine Learning
Maximum marks : 0
Obtained marks : 0


Subject Code : CS2016
Subject Name : Cloud Computing
Maximum marks : 100
Obtained marks : 77



Subject Code : CS2001
Subject Name : Operating System
Max Marks : 100
Marks Obtained : 90

Subject Code : CS2002
Subject Name : Database Management System
Max Marks : 0
Marks Obtained : 0

Subject Code : CS2006
Subject Name : Java
Max Marks : 100
Marks Obtained : 97

Subject Code : CS2002
Subject Name : Database Management System
Max Marks : 0
Marks Obtained : 47


*/