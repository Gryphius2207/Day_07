package mypackage;

public class Dog {
	
	String name;
	String breed;
	int age;
	String color;
	
	public Dog(String name, String breed, int age, String color) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
		
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return breed;
		
	}
	@Override
	public String toString() {
		return("Hi my name "+this.getName()+"\n breed "+this.getBreed()+"\n color "+
		this.getColor()+"\n Age: "+this.getAge()) ;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog scott = new Dog("Scott","Lab",5,"Brown");
		System.out.println(scott.toString());
	}

}
