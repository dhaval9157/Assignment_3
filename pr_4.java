class cricket
{
    void print()
    {
        System.out.println("match");
    }
}
class ipl extends cricket
{
    void print()
    {
        System.out.println("t20");
    }
}
class odi extends cricket
{
    void print()
    {
        System.out.println("oneday");
    }
}
class test extends cricket
{
    void print()
    {
        System.out.println("test");
    }
}
public class pr_4
{
    public static void main(String[] args)
    {
        cricket a=new cricket();
        a.print();
        ipl b=new ipl();
        b.print();
        odi c=new odi();
        c.print();
        test d=new test();
        d.print();
    }
}
