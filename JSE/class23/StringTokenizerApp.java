package com.google.app;
import java.util.StringTokenizer;

public class StringTokenizerApp
	{
public static void main(String args[])
{
	String msg = " My Name Is Srinu.";
	StringTokenizer st = new StringTokenizer(msg);
	System.out.println(" No Of Words in a Given String => "+st.countTokens());

	while(st.hasMoreTokens())
	{
	System.out.println(st.nextToken());
	}
	
	
}
	}