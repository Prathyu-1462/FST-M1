package hello;
import java.util.*;
class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    Plane(int maxPassengers) {
    	this.maxPassengers=maxPassengers;
    	this.passengers= new ArrayList<>();
    	
    }
    public void onboard(String passengers) {
    	this.passengers.add(passengers);
	}
    
   public Date takeoff() {
	   this.lastTimeTookOf=new Date();
	return lastTimeTookOf;
}
   
    public void land() {
    	this.lastTimeLanded=new Date();
    	this.passengers.clear();
	
    }
    public Date getLastTimeLanded() {
    	
        return lastTimeLanded;
    }

    public List<String> getPassesngers() {
		return passengers;
    	
    }
    
}
