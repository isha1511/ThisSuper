
class Parent {
	String name;

	void method()
	{
		System.out.println("Method from Parent");
	}
}

class Child extends Parent {
	int id;

	void method()
	{
		System.out.println("Method from Child");
	}
}

public class UpCastDownCast{

	
	public static void main(String[] args){
		// Upcasting
		Parent p = new Child();
		p.name = "Isha";

		//Printing the parentclass name
		System.out.println(p.name);
		p.method();

		// Downcasting Explicitly
		Child c = (Child)p;
        
		c.id = 1;
		System.out.println(c.name);
		System.out.println(c.id);
        c.method();//method of child class
		new Parent().method();//method of parent class
	}
}
