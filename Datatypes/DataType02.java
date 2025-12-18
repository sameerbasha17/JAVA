
// Finding the maximum and minimum value of Integer data type and its size in bytes

/*Notes :
 ☆ Every data type has a wrapper class in Java
 ☆ Wrapper classes are used to convert primitive data types to objects and vice versa
 ☆ Each wrapper class has methods and members which can be used to perform various operations on the corresponding primitive data type
 ☆ Integer is a wrapper class for int data type
 ☆ Float is a wrapper class for float data type
 ☆ Double is a wrapper class for double data type
 ☆ Character is a wrapper class for char data type
 ☆ Boolean is a wrapper class for boolean
 ☆ Long is a wrapper class for long data type
 ☆ Short is a wrapper class for short data type
 ☆ Byte is a wrapper class for byte data type
 */


public class DataType02				//class name
{
	public static void main (String [] args )
	{
		System.out.println("Maximum value of Integer : " + Integer.MIN_VALUE);				// finding the maximum value of Integer data type

		System.out.println("Minimum value of Integer : " + Integer.MAX_VALUE);				// finding the minimum value of Integer data type

		System.out.println("Size (in bytes) : " + Integer.BYTES);							// finding the size of Integer data type in bytes

		System.out.println("Size (in bits) : " + Integer.SIZE);								// finding the size of Integer data type in bits	
	}
}

// Output :
// Maximum value of Integer : -2147483648
// Minimum value of Integer : 2147483647
// Size (in bytes) : 4

/* How to see the member/methods inside the Wrapper class ?
  1.open the cammand prompt
  2.write "javap java.lang.Integer" and hit enter
  3.It will show all the members and methods inside the Integer wrapper class
  4.Similarly you can check for other wrapper classes also by replacing Integer with Float, Double, Character, Boolean, Long, Short, Byte etc...
 
 ☆ Example : 
C:\Users\Sameer\Desktop>javap java.lang.Integer
Compiled from "Integer.java"
public final class java.lang.Integer extends java.lang.Number implements java.lang.Comparable<java.lang.Integer>, java.lang.constant.Constable, java.lang.constant.ConstantDesc {
  public static final int MIN_VALUE;   
  public static final int MAX_VALUE;
  public static final java.lang.Class<java.lang.Integer> TYPE;
  static final char[] digits;
  static final byte[] DigitTens;
  static final byte[] DigitOnes;
  public static final int SIZE;
  public static final int BYTES;
  public static java.lang.String toString(int, int);
  public static java.lang.String toUnsignedString(int, int);
  public static java.lang.String toHexString(int);
  public static java.lang.String toOctalString(int);
  public static java.lang.String toBinaryString(int);
  public static java.lang.String toString(int);
  public static java.lang.String toUnsignedString(int);
  static int getChars(int, int, byte[]);
  static int stringSize(int);
  public static int parseInt(java.lang.String, int) throws java.lang.NumberFormatException;
  public static int parseInt(java.lang.CharSequence, int, int, int) throws java.lang.NumberFormatException;
  public static int parseInt(java.lang.String) throws java.lang.NumberFormatException;
  public static int parseUnsignedInt(java.lang.String, int) throws java.lang.NumberFormatException;
  public static int parseUnsignedInt(java.lang.CharSequence, int, int, int) throws java.lang.NumberFormatException;
  public static int parseUnsignedInt(java.lang.String) throws java.lang.NumberFormatException;
  public static java.lang.Integer valueOf(java.lang.String, int) throws java.lang.NumberFormatException;
  public static java.lang.Integer valueOf(java.lang.String) throws java.lang.NumberFormatException;
  public static java.lang.Integer valueOf(int);
  public java.lang.Integer(int);
  public java.lang.Integer(java.lang.String) throws java.lang.NumberFormatException;
  public byte byteValue();
  public short shortValue();
  public int intValue();
  public long longValue();
  public float floatValue();
  public double doubleValue();
  public java.lang.String toString();
  public int hashCode();
  public static int hashCode(int);
  public boolean equals(java.lang.Object);
  public static java.lang.Integer getInteger(java.lang.String);
  public static java.lang.Integer getInteger(java.lang.String, int);
  public static java.lang.Integer getInteger(java.lang.String, java.lang.Integer);
  public static java.lang.Integer decode(java.lang.String) throws java.lang.NumberFormatException;
  public int compareTo(java.lang.Integer);
  public static int compare(int, int);
  public static int compareUnsigned(int, int);
  public static long toUnsignedLong(int);
  public static int divideUnsigned(int, int);
  public static int remainderUnsigned(int, int);
  public static int highestOneBit(int);
  public static int lowestOneBit(int);
  public static int numberOfLeadingZeros(int);
  public static int numberOfTrailingZeros(int);
  public static int bitCount(int);
  public static int rotateLeft(int, int);
  public static int rotateRight(int, int);
  public static int reverse(int);
  public static int compress(int, int);
  public static int expand(int, int);
  public static int signum(int);
  public static int reverseBytes(int);
  public static int sum(int, int);
  public static int max(int, int);
  public static int min(int, int);
  public java.util.Optional<java.lang.Integer> describeConstable();
  public java.lang.Integer resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup);
  public int compareTo(java.lang.Object);
  public java.lang.Object resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup) throws java.lang.ReflectiveOperationException;
  static {};
}
 
 */

 // This is a java program to use the members of wrapper class to find size or range etc..of primitive data type 