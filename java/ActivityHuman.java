package fst;



public class ActivityHuman {

	public static void main(String[] args) {
		Boy b1 = new Boy(), b2 = new Boy(), b3 = new Boy();
		
		Girl g1 = new Girl(), g2 = new Girl(), g3 = new Girl();
		
		Robot r1 = new Robot(), r2 = new Robot(), r3 = new Robot();
		
		System.out.println("Population of Humans = " + Human.count);
		System.out.println("Population of Robots = " + Robot.rcount);

	}

}

abstract class Human {
	
	static int count = 0;
	
	abstract void walking();
	
	abstract void talking();
}

class Boy extends Human{
	
	Boy() {
		count++;
	}
	
	public void walking() {
		System.out.println("Boy is walking");
	}
	
	public void talking() {
		System.out.println("Boy is talking");
	}
}

class Girl extends Human{
	
	Girl() {
		count++;
	}
	
	public void walking() {
		System.out.println("Girl is walking");
	}
	
	public void talking() {
		System.out.println("Girl is talking");
	}
}

class Robot {
	
	static int rcount = 0;
	
	Robot() {
		rcount++;
	}
	
	public void walking() {
		System.out.println("Robot is walking");
	}
	
	public void talking() {
		System.out.println("Robot is talking");
	}
}