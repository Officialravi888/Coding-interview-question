package org.example.Palindrome;

public class Demo {
    public static void main(String[] args) {
        int num=120245, revers=0;
        int temp=num;
        while (temp!=0){
            int remainder=temp%10;
            revers=revers*10+remainder;
            temp/=10;
        };
        if (num==revers)
            System.out.println(num+":Palindrome");
        else
            System.out.println(num+":Not Palindrome");
    }
}
