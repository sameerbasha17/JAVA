// Methods : String as parameter

public class StringAsParameter 
{
    public static void main(String [] args)
    {
        String name = "Sameer";

        StringAsParameter sap = new StringAsParameter();
        sap.greet(name);

        System.out.println("Name in Main Method : " + name);
    }

    void greet(String n)
    {
        n.concat(" Basha");
        // n = n.concat(" Basha");       Sameer Basha
        System.out.println("String in 'greet' method : " + n);
    }
}

/*
Output : 
String in 'greet' method : Sameer
Name in Main Method : Sameer

*/