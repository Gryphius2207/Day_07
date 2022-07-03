package mypackage;

public class Sum {

		public int add(int x,int y) {
			return x + y;
		}
		public int add(int x,int y,int z) {
			return x+y+z;	
		}
		public double add(double x,double y) {
			return x+y;			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s = new Sum();
		System.out.println(s.add(10,20));
		System.out.println(s.add(10, 20, 30));
		System.out.println(s.add(10.34, 20.54));
		
	}

}
