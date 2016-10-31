class ChildInheritance {
	float salary = 4000000;
}
	class InheritanceEx extends ChildInheritance{
		int Bonus = 1200000;
		public static void main(String[] args) {
			InheritanceEx ab1 = new InheritanceEx();
			InheritanceEx ab2 = new InheritanceEx();
			System.out.println("Sallary " + ab1.salary + " " + "Bonus " + ab2.Bonus);
		}

}