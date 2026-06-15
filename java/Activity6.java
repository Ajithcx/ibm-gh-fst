package fst;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	public List<String> passengers;
	public int maxPassengers;
	public Date lastTimeTookOf;
	public Date lastTimeLanded;
	
	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<>();
	}
	
	public void onboard(String passenger) {
		if(passengers.size() <= maxPassengers) {
			passengers.add(passenger);
		}
		else {
			System.out.println("Maximum capacity reached");
		}
	}
	
	public Date takeOff() {
		lastTimeTookOf = new Date();
		return lastTimeTookOf;
	}
	
	public void land() {
		lastTimeLanded = new Date();
		passengers.clear();
	}
	
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	
	public List getPassengers() {
		return passengers;
	}
}

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane = new Plane(10);
		plane.onboard("Mahesh");
		plane.onboard("Ajith");
		plane.onboard("Jashwanth");
		plane.onboard("Jerome");
		plane.onboard("Sridhar");
		System.out.println("Take Off time - " + plane.takeOff());
		System.out.println("Passenger List - " + plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Last Time Landed - " + plane.getLastTimeLanded());
		
	}

}