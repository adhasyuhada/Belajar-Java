class MountainBike extends Bicycle{
	//fields and method defining 
	//a mountain bike would go here
	int bracker = 0;
	void shockBraker(int newValue){
		bracker = newValue;
	}
	void printState(){
		System.out.println("cadence : " + cadence + " speed : " + speed + " gear : " + gear + " shockBraker : "+ bracker);
	}

}