package lab6_innerclasses.prog6_2_instance_innerclass;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	//returns the value in the instance variable of Bottom
	int readBottom() {
		Middle m = new Middle();
		Middle.Bottom bottom = m.new Bottom();
		return bottom.b;
	}
	class Middle {
		int m = 2;
		//returns sum of instance variable in Top and 
		//instance variable in Bottom
		int addTopAndBottom() {
			Bottom bottom = new Bottom();
			return t + bottom.b;
		}
		class Bottom {
			int b = 3;
			//returns the product of the instance variables
			//in all three classes
			int multiplyAllThree() {
				return t * m * b;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();

		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());

	}

}
