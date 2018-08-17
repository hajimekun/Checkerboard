/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		for ( int row = 1;  row <= 8;  ++row ) {
            	for ( int col = 1;  col <= 8;  ++col ) {
            	if ( (row+col)%2==0 )
            	System.out.print("#");
            	else
            	System.out.print(" ");
                   
               }
		System.out.println();
            }
	
	}
}