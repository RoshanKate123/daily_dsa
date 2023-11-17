class Employee {
	float salary = 40000;
}

class SingleInheritance1 extends Employee{
	float bonus = 500;
	public static void main(String args[])
	{
		SingleInheritance1 p = new SingleInheritance1();
		System.out.println(p.salary);
		System.out.println(p.bonus);
	}
}