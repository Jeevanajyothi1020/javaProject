import javax.swing.*;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
      /*  int a[]= {100,200,300,400,500};
        System.out.println("length of the array:" +a.length); */
     /*   int []a[]=new a[3][5];
        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;
        a[2][1]=500;
        a[2][2]=600; */
        //  int a[][] = {{100, 200}, {300, 400}, {500, 600}};
        // System.out.println("number of rows:" +a.length);
        //System.out.println("number of columns:" +a[0].length);
        //System.out.println(a[1][1]);
       /* for (int r = 0; r <= 2; r++) {
            for (int c = 0; c <= 1; c++) {
                System.out.print(a[r][c] + " ");
            } */
            /* for (int r = 0; r<a.length; r++)
            {

                for (int c = 0; c<a[r].length; c++)
                {
                    System.out.print(a[r][c] + "  ");
                }
                System.out.println();
            } */
          /*  for(int arr[]:a)
            {
                for(int x:arr)
                {
                    System.out.println(x);
                }
            } */
        /* Object a[]={100,11.5,'A',"HELLO",true};
          for(Object x:a)
        {
                System.out.println(x);
        } */
        /* for(int i=0;i<a.length;i++)
        {
                System.out.println(a[i]);
        } */
        /* int[] a ={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum+a[i];
        }
            System.out.println("sum of digits:" +sum);
    } */
      /*  int a[]= {10, 20, 30, 45, 36};
        System.out.println("Odd Numbers:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
} */
        // search
    /*    int a[] = {10, 20, 30, 40, 50};
        boolean status = false;
        int search_element = 30;
        for (int i = 0; i < a.length; i++) // for(x:a)
        {
            if (a[i] == search_element)   // if(x==search_element)
            {
                System.out.println("element found");
                status = true;
                break;
            }
        }
        if (status == false)
        {
            System.out.println("element not found");
        }
    }
} */
        // repeation
    /*    int a[] = {100, 200, 100, 300, 100, 500};
        int num = 100;
        int count = 0;
        for (int value : a) {
            if (value == num) {
                count++;
            }
        }
        System.out.println(count);
    }
} */
// sorting
     /*   int a[] = {100, 400, 300, 200, 500};
       System.out.println("before sorting...");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(a));
    } */
        // char s[] = {'C', 'A','D', 'E', 'B'};
    /*    String s[]={"jee","gayu","jani","pandu"};
        System.out.println("befoe sorting:" + Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("after sorting:" +Arrays.toString(s));

    }
} */
        int a[] = {100, 200, 300, 400, 500};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}






