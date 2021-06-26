
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
public class Remiss {
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
            int a=input.nextInt();
            int b=input.nextInt();
            int c=a>b?a:b;
            int d=a+b;
            System.out.println(c+" "+d);
            t--;
        }
    }
}
