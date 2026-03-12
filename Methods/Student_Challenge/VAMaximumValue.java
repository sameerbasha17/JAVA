// Task : Using variable arguments find the maximum value.

public class VAMaximumValue 
{
    public static void main(String ...agrs)
    {
        System.out.println(findMax(34,34,342,432,342,432,232,23,43,43,2,43));  // 432
        System.out.println(findMax(17,8)); // 17
        System.out.println(findMax()); // -2147483648
    }    

    static int findMax(int ...x)
    {
        if(x.length == 0) return Integer.MIN_VALUE;
        int max = x[0];

        for(int ele : x)
        {
            if( max < ele)
            {
                max = ele;
            }
        }
        return max;
    }
}
