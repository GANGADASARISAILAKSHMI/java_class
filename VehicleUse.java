
package vehicle;

public class VehicleUse {
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.colour="red";
		v.maxspeed=100;
		System.out.println("The vehicle colour is : "+v.colour);
		System.out.println("The vehicle  speed is : "+v.maxspeed);
		Car c=new Car();
		c.colour="black";
		c.maxspeed=150;
		c.maxtiers=4;
		System.out.println("The vehicle colour is : "+c.colour);
		System.out.println("The vehicle  speed is : "+c.maxspeed);
		System.out.println("The vehicle  speed is : "+c.maxtiers);
		
	
	}
	
}
