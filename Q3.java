/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int a=1;a<=t;a++)
		{
		    String s=sc.next();
		    int co=0;
		    boolean f=false;
		    
		   do
		   {
		       f=false;
		       int i1=s.indexOf("1");
		       
		       
		       for(int y=i1;y<s.length();y++)
		       {
		           char c=s.charAt(y);
		           
		           if(c=='0')
		           {
		               f=true;
		               int i=s.indexOf("1",y);
		               if(i==-1)i=s.length();
		               s=s.substring(0,y-1)+s.substring(y,i)+1+s.substring(i);
		               co=co+i-y+1;
		               y=i;
		               //s=s.substring(0,y-1)+0+1+s.substring(y+1);
		               
		           }
		           
		       }
		      
		   }while(f);
		   System.out.println(co);
	}
}
}
