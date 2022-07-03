package mypackage;

import java.util.Scanner;

class Bicycle{
	public int gear;
	public int speed;
	public Bicycle(int ss, int ss2) {
		this.gear = ss;
		this.speed = ss2;
	}
	
	public String toString() {
		return("No. of gears are "+gear+"\n"+"speed of bicycle is "+speed);
	}
} 
class MountainBike extends Bicycle{
	public int seatHeight;

	public MountainBike(int ss, int ss2, int ss3) {
		super(ss, ss2);
		this.seatHeight = ss3;
	}
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	public String toString() {
		return (super.toString() + "\nseat height is "+seatHeight);
		
	}
}
public class Test {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {
			try (Scanner s1 = new Scanner(System.in)) {
				try (Scanner s2 = new Scanner(System.in)) {
					System.out.println("Enter No. of gears");
					int ss = s.nextInt();
					System.out.println("Enter Speed of Cycle");
					int ss2 = s1.nextInt();
					System.out.println("Enter Seat height");
					int ss3 = s2.nextInt();
					MountainBike mb = new MountainBike(ss, ss2, ss3);
					System.out.println(mb.toString());
				}
			}
		}

	}

}
