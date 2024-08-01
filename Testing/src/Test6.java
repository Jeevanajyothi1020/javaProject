import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
      /*  String s="jeevana";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("reverse a string:" +rev); */

        // without using string methods
        /* String s1="welcome";
        String rev1="";
        char a[]=s1.toCharArray();
        for(int i=s1.length()-1;i>=0;i--)
        {
            rev1=rev1+a[i];
        }
        System.out.println("reverse string:" +rev1); */
        // using StringBuffer class
      /*  StringBuffer s=new StringBuffer("welcome");
        System.out.println("reverse string is:" +s.reverse());
        // using StringBulider class
        StringBuilder s1=new StringBuilder("welcome");
        System.out.println("reverse string is:" +s1.reverse()); */
        // mutable - can change
        int a[]={20,30,10,50,40};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // immutable
     /*   String s=new String("welcome");
        System.out.println(s);
        String concatstring=s.concat("to java");
        System.out.println(s);
        System.out.println(concatstring); */
// String - immutable
        String s="welcome";
        s.concat("to java");
        System.out.println(s);
        // StringBuffer - mutable
        StringBuffer sb=new StringBuffer("welcome");
        sb.append("to java");
        System.out.println(sb);
        // StringBuilder mutable
        StringBuilder su= new StringBuilder("welcometo");
        su.append("to java");
        System.out.println(su);





    }
}
