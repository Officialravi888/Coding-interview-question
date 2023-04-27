package org.example.missingno;

import java.util.Scanner;

public class Missing_No {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        for (int i=0; i< n-1; i++){
        arr[i]=sc.nextInt();
        sum+=arr[i];
        }
        int s=n*(n+1)/2;
        System.out.println(s-sum);
    }
}
