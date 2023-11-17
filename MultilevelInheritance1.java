class Animal{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal{
	void bark(){
		System.out.println("Dog is barking");
	}
}

class BabyDog extends Dog{
	void weep(){System.out.println("BabyDog is weeping");}
}
	
class MultilevelInheritance1{
	
	public static void main(String args[])
	{
		BabyDog b = new BabyDog();
		b.eat();
		b.bark();
		b.weep();
	}
}