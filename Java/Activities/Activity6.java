package hello;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Plane plane=new Plane(10);
		plane.onboard("apple");
		plane.onboard("banana");
		plane.onboard("car");
		System.out.println("Plane took off at: " +plane.takeoff());
		
		System.out.println("People on the plane: "+plane.getPassesngers());
		
		Thread.sleep(5000);
		
		plane.land();
		
		//System.out.println(plane.getLastTimeLanded());
		System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassesngers());
		
		
	}
}

