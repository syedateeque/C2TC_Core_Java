package Exception_Handling;

import java.io.IOException;

public class ExceptionHandlingDemo3 {
	void m()throws IOException
	{
	throw new IOException("device error");//checked exception
	}
	void n()throws IOException
	{
	m();
	}
	void p()
	{
	try
	{
	n();
	}
	catch(Exception e){System.out.println("exception handled");}
	}
	public static void main(String args[])
	{
  ExceptionHandlingDemo3 obj=new ExceptionHandlingDemo3();
	obj.p();
	System.out.println("normal flow...");
	}

}
