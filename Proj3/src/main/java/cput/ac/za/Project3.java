package cput.ac.za;

public class Project3
{
    int a;
    int b;

    public void setA(int a)
    {
        this.a = a;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public static int Add(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args)
    {
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println(c);
        System.out.println(a + b);
        System.out.println(Add(6,12));
    }
}
