package org.example.factorial;

public class Factorial {
    public static void main(String[] args) {
        int num=6;
        int factorial=fib(num);
        System.out.println(""+num+"="+factorial);
    }
    static int fib(int num){
        if(num>=1)
            return num*fib(num-1);
        else
            return 1;
    }
}
