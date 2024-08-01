public class StaticDemo {
    static int a=10;
    int b=20;
    static void m1()
    {
        System.out.println("this is m1 static method...");
    }
    void m2()
    {
        System.out.println("this is m2 non-static method...");
    }

    public static void main(String[] args) {
        System.out.println(a); //sm can access static stuff directly(without obj)
        m1();
      //  System.out.println(b); // can not accesss
       // m2();
        StaticDemo sd=new StaticDemo();
        System.out.println(sd.b);
    sd.m2();
}
}
