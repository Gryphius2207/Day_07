package mypackage;

class Encapsulation{
	private String Name;
	private int RollNo;
	private int Age;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
}
public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj = new Encapsulation();
		obj.setName("Hari");
		obj.setAge(23);
		obj.setRollNo(22);
		
		System.out.println("My Name is "+obj.getName()+"\nMy Age is "+
				obj.getAge()+
				"\nMy RolNO is "+obj.getRollNo());
	}

}
