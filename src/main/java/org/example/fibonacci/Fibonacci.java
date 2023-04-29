package org.example.fibonacci;

public class Fibonacci {
    //5 number Fibonacci---: 8
    public static void main(String[] args) {
        int n1=0, n2=1, n3;
        System.out.println(n1+"add"+n2);
        for (int i=0; i<7; i++){
            n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println("print fibonacci no:"+n2);
    }
}
