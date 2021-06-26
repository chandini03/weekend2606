
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
public class alphabets {
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
         input.nextLine();
         
         while(t>0)
         {
             String s=input.nextLine();
             switch(s)
             {
                 case "B":case "b":System.out.println("Battleship");break;
                 case "C":case "c":System.out.println("Cruiser");break;
                 case "D":case "d":System.out.println("Destroyer");break;
                 case "F":case "f":System.out.println("Frigate");break;
                 
             }
             t--;
         }
        }
}
