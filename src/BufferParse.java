
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
public class BufferParse {
    public static void main (String[] args) throws IOException
	{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          
          int b =Integer.parseInt(br.readLine(),8);
          System.out.println(b);
          
          /*
          Double a = Double.parseDouble(br.readLine();
          dt var = dt.parsedt(br.readLine());
          dt means datatype=double,int,float,lonf,short.....etcc
          */
        }
}
/*for binary use 2
 octal 8
hexa 16
20-10100
20%2=0
10%2=0
5%2=1
2%2=0
1%2=1

*/

