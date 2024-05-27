package OverallOverview;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
//        int a=5;
//        int b=100;
//        swap both values without third variable
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        a=a*b;//50
//        b=a/b;//5
//        a=a/b;//10
//Swap using third variable
//        int c=a;
//        a=b;
//        b=c;
//        System.out.println("a="+a+" ,b="+b);
//        int n=5000;
//        //operators
//       //convert integer into binary format
//        System.out.println(a&b);
//        System.out.println(a|b);
////    System.out.println(~a);
////        System.out.println(~b);
//        System.out.println(a<<b);//10*2^5;
//        System.out.println(a>>b);//10/2^5;
//        System.out.println(n>>>b);//a converted to binary,
        //binary value converted into 32 bit
//        binary values shifted b times right side
//          remainder converted into decimal

        //ternary operator

        //a,b,c the greatest number using ternary operator


        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int result=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(result);

//        Arrays
//            [2, 5 ,18,10,2,6]
//           k maximum and minimum and k < length
//            k=4
//            max=5,min=6




         }
}
