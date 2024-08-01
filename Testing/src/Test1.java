public class Test1 {
    public static void main(String[] args) {
        // Arthimetic operators
  /*      int a=100, b=200;
        System.out.println("sum of a and b is:"+(a+b));
        System.out.println("sub of a and b is:"+(a-b));
        System.out.println("mul of a and b is:"+(a*b));
        System.out.println("div of a and b is:"+(a/b));
        System.out.println("mod of a and b is:"+(a%b));
*/
        // Relational / comparison operators
        // returns boolean value T/F
    /*    System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println(a==b);
        boolean res=a>b;
        System.out.println(res);
        */
        // Logical operators
        // returns boolean values
        // works between 2 boolean values
      /*  boolean x=true, y=false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);
        boolean b1=10>20;
        System.out.println(b1);
        boolean b2=20>10;
        System.out.println(b2);
        System.out.println(b1 && b2);
        System.out.println(b1 || b2);
        System.out.println((10<20) && (20>10));
       */
        // Incremental and Dec
        // case 1
        /* int a=10;
        a++;
        System.out.println(a);
        */
        // case 2  post increment
        /* int a=20;
        int res=a++;
        System.out.println(res);
        System.out.println(a);
        */
        // case 3  pre increment
        /* int a=10;
        int res=++a;
        System.out.println(res);
        System.out.println(a);
        */
        // case 1 post decrement
        /* int a=10;
        a--;
        System.out.println(a);
        */
        // case 2
        /* int a=20;
        int res=a--;
        System.out.println(res);
        System.out.println(a);
*/
        // case 3
      /*  int a=12;
        int res=--a;
        System.out.println(res);
        System.out.println(a);
*/
        // Assignment
       /* int a=10;
        a+=5;
        System.out.println(a);
        a-=5;
        System.out.println(a);
        a*=5;
        System.out.println(a);
        a/=5;
        System.out.println(a);
        a%=5;
        System.out.println(a);
*/
        // Ternary operator
        /* int a=200, b=100;
        int x=(a>b)? a:b;
        System.out.println(x);
         */
   //int x=(1==1)? 100:200;
       // System.out.println(x);
       // int x=(1==2)? 200:100;
        //System.out.println(x);
        /*int person_age=15;
        String res=(person_age>=20)? "Eligible": "Not Eligible";
        System.out.println(res);
        */
        int a=10,b=20;
       int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}
