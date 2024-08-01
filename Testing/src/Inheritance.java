/*class A
{
    int a=100;
    void display()
    {
        System.out.println(a);
    }
}
class B extends A {
    int b = 200;

    void show() {
        System.out.println(b);
    }
}
        class C extends B{
            int c;
            void print()
            {
                System.out.println(c);
            }
        }






public class Inheritance {
    public static void main(String[] args) {
        //B bobj=new B();

       // System.out.println(bobj.a);
        //System.out.println(bobj.b);
        //bobj.display();
        //bobj.show();
        C cobj=new C();
        cobj.a=100;
        cobj.b=200;
        cobj.c=300;
       cobj.display();
       cobj.show();
       cobj.print();
    }
} */
 /*class parent
{
    void display(int a)
    {
        System.out.println(a);
    }
}
class child1 extends parent
{
    void show(int b)
    {
        System.out.println(b);
    }
}
class child2 extends parent{
     void print(int c)
     {
         System.out.println(c);
     }

}
public class Inheritance {
    public static void main(String[] args) {
        child1 c1=new child1();
        c1.display(100);
        c1.show(200);
        child2 c2=new child2();
        c2.display(100);
        c2.print(300);
    }
} */

