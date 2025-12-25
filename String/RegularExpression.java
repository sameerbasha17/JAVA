public class RegularExpression 
{
    public static void main(String [] args)
    {
        // ., [abc], [abc][xy], [a-z0-9], xy, x|y, [^abc]

        String str1 = "a";
        System.out.println(str1.matches(".")); //true

        String str2 =  "&";
        System.out.println(str2.matches("."));  //true

        String str3 = "9";
        System.out.println(str3.matches("."));  //true

        String str4 = "A";
        System.out.println(str3.matches("."));  //true

        String str5 = "c";
        System.out.println(str5.matches("[abc]"));  //true
        System.out.println(str5.matches("[ABCDEF]"));  //false

        String str6 = "ka";
        System.out.println(str6.matches("[klm][kabc]")); //true
        String str7 = "ak";
        System.out.println(str7.matches("[klm][kabc]")); //false
        String str8 = "ab";
        System.out.println(str8.matches("[ab][cdef]")); //false

        String s1 = "a";
        System.out.println(s1.matches("[a-z]")); //true

        String s2 = "7";
        System.out.println(s2.matches("[0-9]")); //true
        System.out.println(s2.matches("[a-z0-9A-Z]")); //true

        String s3 = "xy";
        System.out.println(s3.matches("xy"));  //true
        System.out.println(s3.matches("x"));  //false
        System.out.println(s3.matches("y"));  //false

        System.out.println(s1.matches("a|b"));  //true
        System.out.println(s2.matches("1|7"));  //true
        System.out.println(s2.matches("1 | 7"));  //false because a space is added.


        String s4 = "a";
        System.out.println(s4.matches("[^abc]")); //false
        System.out.println(s4.matches("[^b-z]"));  //true

        // /d, /D, /s, /S, /w, /W

        String number = "7";
        System.out.println(number.matches("\\d")); //true
        System.out.println(number.matches("\\D")); //false

        String s5 = " ";
        System.out.println(s5.matches("\\s")); //true
        System.out.println(s5.matches("\\S")); //false

        String s6 = "s";
        String s7 = "A";
        String s8 = "9";
        String s9 = "17";
        // System.out.println(s6.matches("\d"));  error because compiler thinks \d as escape sequence so use \\d
        System.out.println(s7.matches("\\w")); //true
        System.out.println(s8.matches("\\w")); //true
        System.out.println(s9.matches("\\W")); //false

    }    
}
