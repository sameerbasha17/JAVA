public class Quantifiers 
{
    public static void main(String [] args)
    {
        // *, +, ?, {x}, {x,y}
        String str = "Google";
        System.out.println(str.matches(".*"));  //true
        System.out.println(str.matches("[a-zA-Z]+"));  //true
        System.out.println(str.matches("[A-Z]?")); //false

        String s1 = "Amazon9";
        System.out.println(s1.matches("[a-zA-Z]{6}[0-9]{1}"));  //true
        System.out.println(s1.matches("[A-za-z]{0,9}[0-9]{0,2}"));  //true
    } 
}
