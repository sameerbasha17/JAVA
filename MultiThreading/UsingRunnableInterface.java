package JAVA.MultiThreading;

class Test2 implements Runnable
{
    public void run()
    {
        int i = 1;
        while(true)
        {
            System.out.println(i + "Hello");
            i++;
        }
    }
}

public class UsingRunnableInterface 
{
    public static void main(String[] as)
    {
        Test2 obj = new Test2();
        Thread th = new Thread(obj);
        th.start();

        int i = 1;
        while(true)
        {
            System.out.println(i + " World");
            i++;
        }
    }
}

/*
Output : (Middle of output)
========
22Hello
37 World
38 World
39 World
40 World
41 World
42 World
43 World
44 World
45 World
23Hello
24Hello
25Hello
26Hello
27Hello
28Hello
29Hello
30Hello
31Hello
32Hello
33Hello
34Hello
35Hello
36Hello
46 World
47 World
48 World
49 World
50 World
51 World
52 World
53 World
54 World
55 World
56 World
57 World
58 World
59 World
60 World
61 World
62 World
37Hello
38Hello
63 World
64 World
65 World
66 World
67 World
68 World
69 World
70 World
71 World
72 World
73 World
74 World
75 World
76 World
77 World
78 World
79 World
80 World
81 World
82 World
83 World
84 World
85 World
86 World
87 World
88 World
39Hello

*/