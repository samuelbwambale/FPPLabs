package lab4_inheritance_and_polymorphism.prog4_2_closedCurve;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Circle(3),
								 new Rectangle(3,7)};
		//compute areas
		for(ClosedCurve cc : objects) {
			String nameOfCurve = cc.getClass().getSimpleName();
			System.out.println(" The area of this " + nameOfCurve + " is " + cc.computeArea());
			
		}
    
	}

}