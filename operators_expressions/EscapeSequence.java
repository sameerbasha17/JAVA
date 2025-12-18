public class EscapeSequence 
{
    public static void main(String [] args) 
    {
        System.out.print("Hello\tSameer.\n");   // Tabspace and new line
        System.out.println("\' Hello \'\t\"Sameer\""); //Single quote, tabspace and double quote
        System.out.println("Hi"+"\t"+"i am"+"\n"+"Sameer");     
        System.out.print("\u0041"+"\n");   // Hexa-decimal
        System.out.println("\132");        // Octal
        System.out.print("\\hi");
        System.out.println("Basha");
        System.out.print("Hello\bhi\n");
        System.out.print("Hi\fsir\n");
        System.out.print("helloo\rmadam");
    }
}
