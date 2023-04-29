package org.example.fibonacci;

public class Fibonacci1 {
    public static void main(String[] args) {
        int num = 5, a = 0, b = 1;
        System.out.println(a+""+b);
        int temp;
        for (int i=2; i<num; i++){
            temp=a+b;
            a=b;
            b=temp;
            System.out.println(temp+"");

        }
    }
}
