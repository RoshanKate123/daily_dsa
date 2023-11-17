class Student{
	int id ;
	String name;
}
class InitObjRefVar{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.id = 101;
		s1.name = "Roshan";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}