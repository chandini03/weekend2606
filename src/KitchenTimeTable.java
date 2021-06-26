


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class KitchenTimeTable {
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int i,c;
        while(t>0)
        {
            int n=input.nextInt();
            int[] a =new int[n];
            int[] b =new int[n];
            for(i=0;i<n;i++){
                a[i]  = input.nextInt();
            }
            for(i=0;i<n;i++){
                b[i]=input.nextInt();
            }
            c=0;
            if(a[0]>= b[0]){
                c++;
            }
            for(i=1;i<n;i++)
            {
                if(a[i]-a[i-1]>=b[i]){
                    c++;
                }
            }
            System.out.println(c);
            t--;
        }
      
    }
}
