class Bicycle{
	int cadence = 0;
	int speed = 0;
	int gear = 1;

	void changeCadence(int newValue){
		cadence = newValue;
	}

	void speedUp(int increment){
		speed = speed + increment;
	}

	void applyBreaks(int decrement){
		speed = speed - decrement;
	}

	void changeGear(int newValue){
		gear = newValue;
	}

	void printState(){
		System.out.println("cadence : " + cadence + " speed : " + speed + " gear : " + gear);
	}

}