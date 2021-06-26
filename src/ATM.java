
import java.util.Scanner;

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
public class ATM {
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
         double y=input.nextDouble();
         y=(x%5==0 && x<=y-0.5)?y=y-x-0.5:y;
         System.out.println(y);
        }
      
    }



