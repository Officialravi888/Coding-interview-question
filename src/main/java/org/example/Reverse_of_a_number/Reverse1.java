package org.example.Reverse_of_a_number;

public class Reverse1 {
    public static void main (String[]args) {
        int num=12373954;
        int reverse=0, rem;
        for(; num!=0; num=num/10){
            rem=num%10;
            reverse=reverse*10+rem;

        }
        System.out.println(""+reverse);
    }
}