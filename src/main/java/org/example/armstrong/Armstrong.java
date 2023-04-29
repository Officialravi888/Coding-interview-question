package org.example.armstrong;

public class Armstrong{
    public static void main(String[] args) {
        int num=390,len;
        len=order(num);
        if(armstrong(num,len))
            System.out.println(num+":armstrong");
        else
            System.out.println(num+": notarmstrong");
    }
    static int order(int x){
        int len=0;
        while (x!=0){
            len++;
            x=x/10;
        }
        return len;
    }
    static boolean armstrong(int num, int len){
        int sum=0, temp, digit;
        temp=num;
        while (temp!=0){
            digit=temp%10;
            sum=sum+(int)Math.pow(digit,len);
            temp/=10;
        };
        return num==sum;
    }
}
