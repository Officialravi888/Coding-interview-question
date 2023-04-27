package org.example.Reverse_of_a_number;

public class Revers4 {
    public static void getReverse(int num){
        if (num==0)
            return;
        int remainder=num%10;
        System.out.println(remainder);
        getReverse(num/10);
    }
    public static void main(String[] args) {
        int num=1233;
        boolean a=num<0? true:false;
        if (a) {
            System.out.println("" );
            num=num*1;
        }
        getReverse(num);
    }
}
