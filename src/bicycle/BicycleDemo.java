class BicycleDemo{
	public static void main(String[] args){
		Bicycle bike = new Bicycle();
		bike.changeCadence(100);
		bike.speedUp(240);
		bike.changeGear(5);
		bike.printState();

		System.out.println("Mountain Bike");
		MountainBike mb = new MountainBike();
		mb.changeCadence(100);
		mb.speedUp(67);
		mb.changeGear(3);
		mb.shockBraker(1);
		mb.printState();

	}
}