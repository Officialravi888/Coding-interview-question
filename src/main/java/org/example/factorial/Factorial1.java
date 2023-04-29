package org.example.factorial;

public class Factorial1 {
    public static void main(String[] args) {
        int num=6;
        System.out.println(""+num+"="+fact(num));
    }
    static int fact(int num){
        int res=1;
        for(int i=2; i<num; i++){
            res*=i;
        }
        return res;
    }
}
