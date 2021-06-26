/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
import java.util.Scanner;

public class TWotens {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
            int n=input.nextInt();
            if(n%10==0)
                System.out.println(0);
            else if((n*2)%10==0)
                System.out.println(1);
            else
                System.out.println(-1);
        }
    }
}
