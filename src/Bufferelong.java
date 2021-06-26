/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
import java.io.*;

public class Bufferelong {
     public static void main (String[] args) throws IOException
	{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          long a=Long.parseLong(br.readLine());
          System.out.println(a);
        }
         
}
