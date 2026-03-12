// create a class for a student with data members and member functions and call it in the application class(StudentTest).

package JAVA.Object_Oriented_Programming;

public class StudentTest 
{
    public static void main(String [] args)
    {
        Student s = new Student();
        s.name = "Sameer";
        s.rollno = 16;
        s.course = "JAVA";
        s.m1 = 70;
        s.m2 = 90;
        s.m3 = 17;

        System.out.println(s.total());  // 177
        System.out.println(s.average());  // 59.0
        System.out.println(s.grade());   // B
    }    
}

class Student
{
    public String name;
    public int rollno;
    public String course;
    public int m1,m2,m3;

    // Methods
    public int total()
    {
        return m1 + m2 + m3;
    }

    public double average()
    {
        return total()/3.0;
    }

    public char grade()
    {
        if(average() >= 60)
        {
            return 'A';
        }
        else if(average() >= 50 && average() < 60)
            return 'B';
        else if(average() >= 40)
            return 'C'; 
        else 
            return 'F';
    }
}
