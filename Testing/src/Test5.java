import java.sql.SQLOutput;
import java.util.Arrays;

public class Test5
{
    public static void main(String[] args) {
       //String s="welcome";
        //String s=new String("welcome");
        //System.out.println(s);

        // Length of a string
       /* String s="welcome";
        int l=s.length();
        System.out.println(l);
        System.out.println("welcome".length()); */

        // concat() - joining strings
     /*   String s1="welcome";
        String s2=" to java";
        String s3=" Automation";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1+s2+s3);
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s1.concat(s2+s3));
        System.out.println("welcome"+" to java");
        System.out.println("welcome".concat(" to java")); */

        // trim() - remove spaces right and left side
       /* String s="  welcome ";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.trim());
        System.out.println(s.trim().length()); */
        // charAt() - returns a character from a string based on index
     /*  String s="welcome";
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(0)); */

//contains() - returns true or false
      //  String s="welcome";
       /* System.out.println(s.contains("wel"));
        System.out.println(s.contains("come"));
        System.out.println(s.contains("Wel"));
        System.out.println(s.contains("COME")); */
        // equals() , equalsIgnoreCase() - compare strings
   /* String  s1="welcome";
      String s2="welcome";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Welcome"));
        System.out.println(s1.equalsIgnoreCase("WeLcome")); */

        // replace single/multiple
     /*   String s="welcome to selenium java selenium python course";
        System.out.println(s.replace('e','x'));
        System.out.println(s.replace("selenium","automation")); */
        // substring()-extract substring from the main string
       /* String s="selenium";
        System.out.println(s.substring(1,5));;
        System.out.println(s.substring(0,4)); */
        // toUpperCase() toLowerCase()
       /* String s="welcome";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        String x="jeevana20@gmail.com";
        System.out.println(x.toUpperCase());
        String b[]=x.split("@");
      System.out.println(b[0]);
      System.out.println(b[1]);
        System.out.println(Arrays.toString(b)); */
// ex1
     /*   String amount="$14,20,55";
        System.out.println(amount.replace("$",""));
        System.out.println(amount.replace("$","").replace(",","")); */
        //ex2
String s="123@abc";
String arr[]=s.split(",");
        System.out.println(Arrays.toString(arr));


    }
}
