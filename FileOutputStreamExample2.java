import  java.io.FileInputStream;
class FileOutputStreamExample2{
	public static void main(String args[])
	{
		try{
			FileInputStream fin = new FileInputStream("C:/Users/Roshan Ramdas Kate/OneDrive/Desktop/io.txt");
			int i = fin.read();
			System.out.print((char)i);
			
			
			fin.close();
			
		}catch(Exception e)
		{
		System.out.println(e);	
		}
	}
}