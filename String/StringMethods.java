public class StringMethods 
{
    public static void main(String [] args)
    {
        String str = "Computer";

        // length()   -> returns int

        int len = str.length(); // no arguments                      Operation : Returns the length of the string
        System.out.println(len); //8
        //direct :
        System.out.println(str.length()); //8


        // toLowerCase()  -> returns string and no arguments          Operation : Gives the string in Lowercase

        String lrc = str.toLowerCase();
        System.out.println(lrc); //computer
        System.out.println(str.toLowerCase()); //computer


        // toUpperCase()  -> returns string and no arguments needed.    Operation : Gives the string in Uppercase

        String urc = str.toUpperCase();
        System.out.println(urc); //COMPUTER
        System.out.println(str.toUpperCase()); //COMPUTER


        // trim()  -> returns String and no arguments needed.           Operation : Removes leading and tailing spaces

        String str1 = "   HI nana   "; 
        System.out.println(str1);  //   HI nana   

        String strTrim = str1.trim();
        System.out.println(strTrim);  //HI nana
        System.out.println(str1.trim()); //HI nana


        // substring()  -> returns string and int argument(index) is needed.    Opeartion: returns the string from specified begin index.

        String str2 = str.substring(3);
        System.out.println(str2); //puter
        System.out.println(str.substring(3)); //puter

        // substring() -> returns string and two int arguments(start and end indices) are needed.     Operation: returns the string from specified start and end indices.

        String str3 = str.substring(0,3); // Note: the end index is not included. i.e upto endindex-1 is included.
        System.out.println(str3);  //Com
        System.out.println(str.substring(0,3)); //Com


        // replace()  -> returns string and two arguments(old char and new char) are needed.       Operation : replace the new char with old char in the string
        String str4 = str.replace('C','A');
        System.out.println(str4);  //Aomputer
        System.out.println(str.replace('C','A')); //Aomputer

        // startsWith()  -> returns boolean value(ture or false) and one argument(string) is needed.    Operation : returns boolean literal true if it starts with specified string otherwise it returns false.
        boolean result = str.startsWith("Co");
        System.out.println(result);  //true
        // System.out.println(str.startsWith('C'));  not supported for char
        System.out.println(str.startsWith("p"));  //false


        // endsWith()  -> returns boolean value(true or false) and one argument(string) is needed.    Operation : returns boolean literal true if it ends with specified string otherwise it returns true.
        result = str.endsWith("er");
        System.out.println(result);   //true
        System.out.println(str.endsWith("S")); //false

        // indexOf()  -> returns index(int) and one argument(string/char) is needed.          Operation : returns the index of specified string/character.  (from left to right)
        int index = str.indexOf('O'); 
        System.out.println(index);  //-1
        System.out.println(str.indexOf("Co"));  //0
        System.out.println(str.indexOf("COMP"));  //-1


        // lastIndexOf()  -> returns index(int) and one argument(string/char) is needed.    Operation : returns the index of specified string or character. (from right to left)
        String str6 = "Madam";
        index = str6.lastIndexOf("a");
        System.out.println(index); //3
        System.out.println(str6.lastIndexOf("a", 2));  //1   here it takes two arguments and it another method with similar functionality.


        // charAt()  -> returns character and one argument(index) is needed.       Operation : returns the character of specified index.
        char c = str.charAt(0);
        System.out.println(c); //C
        System.out.println(str.charAt(7));  //r


        // contains()  -> returns boolean value and one argument(string) is needed.    Operation : returns true if the string argument is present in the referenced string otherwise it returns false.
        boolean con = str.contains("er");
        System.out.println(con); //true
        System.out.println(str.contains("P"));  //false

        
        // equals()  -> returns boolean value and one argument(string) is needed.      Operation : returns true if contents of both strings are equal(case-sensitive) otherwise it returns false.
        boolean eql = str.equals("Computer");
        System.out.println(eql);  //true
        System.out.println(str.equals("computer"));  //false
        String str7 = "Computer";
        System.out.println(str.equals(str7));  //true

        // equalsIgnoreCase()   -> returns boolean value and one argument(string) is needed.     Operation : returns true if contents of both strings are equal(not case-sensitive) otherwise it returns false.
        System.out.println(str7.equalsIgnoreCase(str));  //true
        System.out.println(str.equalsIgnoreCase("COMPUTER"));  //true
        System.out.println(str.equalsIgnoreCase("hi"));  //false

        // concat()  -> returns string and one argument(string) is needed.      Operation : returns concatenated string 
        String s1 = "Nara";
        String s2 = "yana";
        System.out.println(s1.concat(s2));  //Narayana
        System.out.println(s1 + s2);  //Narayana

        
        //valueOf()  -> returns string and one argument(any datatype except boolean) is needed.    Operation : returns the string from any datatype/literal.
        int a = 9;
        System.out.println(a + 2);  //11
        System.out.println(String.valueOf(a) + 2);  //92

    }
}
