package JAVA.MultiThreading.StudentChallenge;

class WhiteBoard
{
    String message;
    int count = 0;
    int attendence = 3; // number of students
    synchronized public void write(String str)
    {   
        while(count != 0)
            try{ wait(); } catch(Exception e){};

        count = attendence;
        message = str;

        notifyAll();
    }

    synchronized public String read()
    {
        while(count == 0)
            try{ wait(); } catch(Exception e){};

        count--;

        if(count == 0)
            notifyAll();

        return message;
    }
}

class Teacher extends Thread
{
    WhiteBoard wb;
    
    public Teacher(WhiteBoard wb)
    {
        this.wb = wb;
    }

    String[] msg = {"Message 1", "Message 2", "Message 3", "Message 4"}; 

    @Override
    public void run()
    {
        int i = 0;
        while(i < msg.length)
        {
            wb.write(msg[i]);
            System.out.println("Teacher Written : " + wb.message);
            i++;
        }
    }
}

class Student extends Thread
{
    WhiteBoard wb;
    int num = 0;
    
    public Student(WhiteBoard wb, int num)
    {
        this.wb = wb;
        this.num = num;
    }

    @Override
    public void run()
    {
        int i = 0;
        while(i < 4)
        {
            System.out.println("Student " + num + " : " + wb.read());
            i++;
        }
    }
}

public class Classroom 
{
    public static void main(String[] as) 
    {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);
        Student s1 = new Student(wb, 1);
        Student s2 = new Student(wb, 2);
        Student s3 = new Student(wb, 3);

        t.start();
        s1.start();
        s2.start();
        s3.start();


    } 
}


















/* 
Without Synchronization :
============================
package JAVA.MultiThreading.StudentChallenge;

class WhiteBoard
{
    String message;
    public void write(String str)
    {   
        message = str;
    }

    public String read()
    {
        return message;
    }
}

class Teacher extends Thread
{
    WhiteBoard wb;
    
    public Teacher(WhiteBoard wb)
    {
        this.wb = wb;
    }

    String[] msg = {"Message 1", "Message 2", "Message 3", "Message 4"}; 

    @Override
    public void run()
    {
        int i = 0;
        while(i < 4)
        {
            wb.write(msg[i]);
            System.out.println("Teacher Written : " + wb.message);
            i++;
        }
    }
}

class Student extends Thread
{
    WhiteBoard wb;
    int num = 0;
    
    public Student(WhiteBoard wb, int num)
    {
        this.wb = wb;
        this.num = num;
    }

    @Override
    public void run()
    {
        int i = 0;
        while(i < 4)
        {
            System.out.println("Student " + num + " : " + wb.read());
            i++;
        }
    }
}

public class Classroom 
{
    public static void main(String[] as) 
    {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);
        Student s1 = new Student(wb, 1);
        Student s2 = new Student(wb, 2);
        Student s3 = new Student(wb, 3);

        t.start();
        s1.start();
        s2.start();
        s3.start();


    } 
}

Output :
========
Teacher Written : Message 1
Teacher Written : Message 2
Teacher Written : Message 3
Teacher Written : Message 4
Student 2 : Message 1
Student 2 : Message 4
Student 2 : Message 4
Student 2 : Message 4
Student 3 : Message 1
Student 3 : Message 4
Student 3 : Message 4
Student 3 : Message 4
Student 1 : Message 1
Student 1 : Message 4
Student 1 : Message 4
Student 1 : Message 4

*/