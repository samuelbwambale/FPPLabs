package lab2_java_fundamentals.prog2_1_objects;


public class Main {

	public static void main(String[] args) {


		Address cust1add1 = new Address("10 Adams", "Chicago", "IL", "52556");
		Address cust1add2 = new Address("110 Burlington", "Fairfield", "IA", "52556");
		Address cust2add1 = new Address("322 Harrison", "Los Angels", "CA", "52556");
		Address cust2add2 = new Address("2210 Burlington", "Fairfield", "IA", "52556");

		Customer cust1 = new Customer("Sam", "Bwambale", "102-81-0001");
		cust1.setBillingAddress(cust1add1);
		cust1.setShippingAddress(cust1add2);

		Customer cust2 = new Customer("Allan", "Gay", "102-82-0002");
		cust2.setBillingAddress(cust2add1);
		cust2.setShippingAddress(cust2add2);

		// Creates a Customer array of length 2
		Customer[] custArray = new Customer[2];
		custArray[0] = cust1;
		custArray[1] = cust2;
		
		for (int i = 0; i < custArray.length; ++i) {
			Address billingAddress = custArray[i].getBillingAddress();
			if (billingAddress.getCity().equals("Chicago")) {
				System.out.println("Found a customer from Chicago " + custArray[i].toString());
			}
		}

	}

}

