import java.io.FileOutputStream;
class FileOutputStreamExample1{
	public static void main(String args[])
	{
		try{
		FileOutputStream fout = new FileOutputStream("C:/Users/Roshan Ramdas Kate/OneDrive/Desktop/io.txt");
		String s = "Welccome to io";
		byte[] b = s.getBytes();
		fout.write(b);
		fout.close();
		
		System.out.println("Sucesss");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}