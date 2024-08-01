public class Cobject {
    // variables
    int eid;
    String ename;
    String job;
    int sal;
    //Methods
    void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);
    }
    public static void main(String[] args) {
        Cobject emp1=new Cobject();
        emp1.eid=100;
        emp1.ename="Jeevana";
        emp1.job="Tester";
        emp1.sal=10000;
        emp1.display();
        Cobject emp2=new Cobject();
        emp2.eid=101;
        emp2.ename="Jyothi";
        emp2.job="Tester";
        emp2.sal=20000;
        emp2.display();



    }
}
