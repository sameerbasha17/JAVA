class String796 {
    public static void main(String [] args)
    {
        String s = "abcde";
        String goal = "cdeab";
        int len , temp;
        char ch;
        len = temp = s.length();
        while(len != 0)
        {
            ch = s.charAt(0);

            s = s.substring(1)+ch;
            System.out.println(s);
            
            len--;
            if(s.equals(goal))
            {
                System.out.println("true");
            }
        }
        System.out.println("false : " +s);
    }
}