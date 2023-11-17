import java.io.*;
class parent{
	
	void msg(){
		System.out.println("parent method");
	}
	
}

public class TestExceptionChild extends parent{
	
	void msg()  throws IOException{
		System.out.println("TestExceptionChild");
	}
	
	public static void main(String args[])
	{
		parent p = new TestExceptionChild();
		p.msg();
	}
}