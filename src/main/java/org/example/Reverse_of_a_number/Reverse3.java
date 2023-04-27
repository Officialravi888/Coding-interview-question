package org.example.Reverse_of_a_number;

public class Reverse3 {
    static void getReverse(int num) {
        if (num == 0)
            return;
        int remainder = num % 10;
        System.out.println(remainder);
        getReverse(num/10);
    }

    public static void main(String[] args) {
        int num=12345678;
        getReverse(num);
    }
}
