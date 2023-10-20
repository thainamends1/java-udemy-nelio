package application;

import java.util.Scanner;

import services.PrintService;

//import services.PrintServiceInteger;
//import services.PrintServiceString;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Without Generics
        //PrintServiceInteger ps = new PrintServiceInteger();
        //PrintServiceString ps = new PrintServiceString();

        //With Generics
        //PrintService<Integer> ps = new PrintService<>();    //for integer
        PrintService<String> ps = new PrintService<>();    //for string

        System.out.printf("How many values? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            //Without Generics
            //int value = sc.nextInt();
            //String value = sc.next();
            
            //With Generics
            //Integer value = sc.nextInt();     //for integer
            String value = sc.next();           //for string
            ps.addValue(value);
        }

        ps.print();
        //Integer x = ps.first();       //for integer
        String x = ps.first();          //for string
        System.out.println("First: " + x);

        sc.close();
    }
}
