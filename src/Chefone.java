
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
public class Chefone {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int[] arr={1,2,5,10,50,100};
        while(t>0)
        {
            int n=input.nextInt();//100
            int ctr=0,i=5;
            while(n!=0)
            {
                if(arr[i]<=n)
                {
                    while(arr[i]<=n)
                    {
                        n-=arr[i];
                        ctr++;
                    }
                }
                i--;
            }
               System.out.println(ctr);
               t--;
        }
        
    }
}
