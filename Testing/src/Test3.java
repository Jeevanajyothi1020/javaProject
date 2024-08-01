public class Test3 {
    public static void main(String[] args) {
      /*  int i=1;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        } */
        /* int i=2;
        while(i<=10)
        {
            System.out.println(i);
            i+=2;
        } */
        /* int i=1;
        while(i<=10)
        {
            if(i%2==0)
            {
                System.out.println(i + "even");
            }
            else
            {
                System.out.println(i + "odd");
            }
            i++;

        } */
        /* int i=10;
        while(i>0)
        {
            System.out.println(i);
            i--;
        } */
       /* int i=1;
        do
            {
                System.out.println(i);
                i++;
            }
            while (i <= 10) ;*/

        // Reverse a number
       /* int num=9987, reverse=0;
        while(num!=0)
        {
            int remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        System.out.println("reverse the number:" +reverse); */
        //  Palindrome number
        /* int num=131,revnum=0, onum=num;
        while(num!=0)
        {
            int remainder=num%10;
            revnum=revnum*10+remainder;
            num=num/10;
        }
        if (onum==revnum)
        {
            System.out.println("It is a palindrome number:" +onum);
        }
        else
        {
            System.out.println("It is not a palindrome number:" +onum);
        } */
        // Count num of digits
       /* int count=0, num=13456;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println(+count); */
        // Number of even and odd
      /*  int num=9999444, even_count=0,odd_count=0;
        while(num>0)
        {
            int rem=num%10;
            if(rem%2==0)
            {
                even_count++;
            }
            else
            {
                odd_count++;
            }
            num=num/10;
        }
        System.out.println("number of even numbers:" +even_count);
        System.out.println("number of odd numbers:" +odd_count); */
        // Sum of digits
        /* int n=2345, sum=0;
        while(n!=0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("sum of number of digits:" +sum); */
        // Armstrong number
      /*  int n = 153, temp = n, sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("It is a armstrong number:");
        } else {
            System.out.println("It is not a armstrong number");
        } */
    }
}

