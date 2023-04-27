package org.example.Reverse_of_a_number;

public class Reverse2 {

    public static int reverse(int num, int rev) {
        if (num == 0)
            return rev;
        int rem = num % 10;
        rev=rev*10+rem;
        return reverse(num/10,rev);
    }
    public static void main(String[] args) {
        int num=12345, rev=0;
        System.out.println(""+reverse(num,rev));
    }

}
