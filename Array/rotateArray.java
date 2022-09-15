package com.InterviewBit.Array;
import java.util.Arrays;
import java.util.Scanner;
/* leetcode 189==>https://leetcode.com/problems/rotate-array/ */

public class rotateArray {
    public static void Rotate(int[] num,int n)
    {
        n=n%num.length;
        reverse(num,0,num.length-1);
        reverse(num,0,n-1);
        reverse(num,n,num.length-1);
        System.out.print(Arrays.toString(num));
    }
    public static void reverse(int[] num,int start,int end)
    {
        while(start<end)
        {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number of Array Element : ");
         int number=sc.nextInt();
         int[] num=new int[number];
         for(int i=0;i<num.length;i++)
         {
             num[i]=sc.nextInt();
         }
         System.out.println("Enter The Number you Want To Rotate");
          int n=sc.nextInt();
         Rotate(num,n);

    }

}
