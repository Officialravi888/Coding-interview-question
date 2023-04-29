package org.example.fibonacci;

public class Fibonacci2 {
    static int a=0,b=1,temp;
    public static void main(String[] args) {
        int num=15;
        System.out.println(a+""+b);
        fib(num-2);
    }
    static int fib(int n){
        if(n>0) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.println(temp + "");
            fib (n - 1) ;
        }
            return 0;
    }
}
