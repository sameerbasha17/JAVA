public class PredefinedMethods 
{
    public static void main(String[] args)
    {
        String str = "Hi JAVA Program";

        for(int i = 0; i < str.length(); i++)
        {
            System.out.print(str.charAt(i) + "  ");
        }
        System.out.println();
        for(int i = 0; i < str.length(); i++)
        {
            if(i <= 9){System.out.print("0");}
            System.out.print(i + " ");
        }
        System.out.println("\n"); // two empty lines

        /* --------------------------- String Methods ----------------------------------------- */
        // charAt(int index)
        System.out.println("Char At index 2 : " + str.charAt(2)); // space will print

        // length()
        System.out.println("Length : "  + str.length());

        // codePointAt(int index)
        System.out.println("code Point at index 4 : " + str.codePointAt(4));

        // toCharArray() -> converts the String into a character array.
        char[] arr = str.toCharArray();
        for(char x : arr)
        {
            System.out.print(x + " ");
        }
        System.out.println();

        // getBytes() -> converts the String into a byte array.
        byte[] bArr = str.getBytes();
        for(byte b : bArr)
        {
            System.out.print(b + " ");
        }
        System.out.println("\n-------------------------------------------------------------\n");

        /* ------------------- Comparision Methods ---------------------------- */
        String str1 = "Cola";
        String str2 = "Coco";
        String str3 = "Coco";
        String str4 = "COCO";

        System.out.println("String 1 : " + str1 + "\nString 2 : " + str2 + "\nString 3 : " + str3 + "\nString 4 : " + str4);

        // equals() -> checks the contents in the strings(case - sensitive)
        System.out.println("equals 1 and 2 : " + str1.equals(str2)); // false
        System.out.println("equals 2 and 3 : " + str2.equals(str3)); // true
        System.out.println("equals 3 and 4 : " + str3.equals(str4)); // false;

        System.out.println();

        // equalsIgnoreCase() -> checks the contents in the strings(case not sensitive)
        System.out.println("equalsIgnoreCase 1 and 2 : " + str1.equalsIgnoreCase(str2)); // false
        System.out.println("equalsIgnoreCase 2 and 3 : " + str2.equalsIgnoreCase(str3)); // true
        System.out.println("equalsIgnoreCase 3 and 4 : " + str3.equalsIgnoreCase(str4)); // true;

        System.out.println();

        // compareTo() -> checks the Dictionary order of words, return int value (case - sensitive)
        System.out.println("compareTo 1 and 2 : " + str1.compareTo(str2)); // 9
        System.out.println("compareTo 2 and 3 : " + str2.compareTo(str3)); // 0
        System.out.println("compareTo 3 and 4 : " + str3.compareTo(str4)); // 32

        System.out.println();

        // compareToIgnoreCase() -> checks the Dictionary order of words, return int value
        System.out.println("compareToIgnoreCase 1 and 2 : " + str1.compareToIgnoreCase(str2)); // 9
        System.out.println("compareToIgnoreCase 2 and 3 : " + str2.compareToIgnoreCase(str3)); // 0
        System.out.println("compareToIgnoreCase 3 and 4 : " + str3.compareToIgnoreCase(str4)); // 0

        System.out.println();

        /* ----------------------------------- Search methods -------------------------------------  */
    }
}
