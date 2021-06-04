package robot;

public class Robot{

	//Main
	public static void main(String[] args) {

		Robot_class r1 = new Robot_class("Pikachu", "blue", "Electricity");
		Robot_class r2 = new Robot_class("Flami", "green", "Fire/Flight");
		
		r1.introduce();
		r2.introduce();
		
		Person p1 = new Person("Said", 22);
		Person p2 = new Person("Yasin", 23);
		
		p1.isOwned = r2;
		p2.isOwned = r1;
		
		p1.sitdown();
		p2.situp();
		
		p1.talk();
		p2.talk();
	}
	
}

class Robot_class{
	
	String name;
	String color;
	String element;

	//Constructor
	Robot_class(String n, String c, String e){
		
		this.name = n;
		this.color = c;
		this.element = e;
	}	

	void introduce() {
		
		System.out.println("My name is " + this.name);
		System.out.println("My color is " + this.color);
		System.out.println("My element is " + this.element);
	}
}

class Person{
	
	String name;
	int age;
	boolean isSitting;
	Robot_class isOwned;
	
	//Constructor
	Person(String n, int a){
		
		this.name = n;
		this.age = a;
	}	

	void sitdown() {
		
		this.isSitting = true;
	}
	
	void situp() {
		
		this.isSitting = false;
	}
	
	void talk() {
		
		System.out.println("My name is " + this.name + " and I am " + this.age + "years old");
		System.out.println("My Sitting position is: " + this.isSitting + " and I own " + this.isOwned.name);
	}
}