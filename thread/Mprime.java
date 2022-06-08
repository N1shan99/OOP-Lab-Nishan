import java.io.*;
import java.util.Scanner;

class Multiplication extends Thread {
    public void run() {
        System.out.println("multiplication table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }
}

class Prime extends Thread {
    public void run() {
        int count = 0, i = 1, j, n, no = 0;
        Scanner sc = new Scanner(System.in);
       System.out.println("\n\nprime numbers:");
        System.out.println("Enter value for N :");
        n = sc.nextInt();
        System.out.println("Prime Numbers are :");
        while (no != n) {
            count = 0;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i != 1) {
                System.out.print(i + "   ");
                no++;
            }
            i++;
        }
    }
}

public class Mprime {
    public static void main(String args[])
{
        Multiplication m = new Multiplication();
        Thread t=new Thread(m);
   
        t.start();
        Prime p = new Prime();
     Thread t2=new Thread(p);
        t2.start();
    }
}