package Final_ticket;

import java.util.Scanner;

public class INDATA_SHWORLD {

	public Scanner scanner = new Scanner(System.in);

	public OrderData_SHWORLD ItemPlace = new OrderData_SHWORLD();

	

	void inputData() {

		System.out.println("1. Park&Museum Pass\n2. Park_only");

		ItemPlace.setChooseTicket(scanner.nextInt());

		System.out.println("Enter your ID_Number");

		ItemPlace.setID(scanner.next());

		
		ItemPlace.setZiuamea(Integer.parseInt(ItemPlace.getID().substring(0, 6)));

		ItemPlace.setStiu(Integer.parseInt(ItemPlace.getID().substring(6, 7)));

		System.out.println("1. 1Day\n2. After4");

		ItemPlace.setZiua(scanner.nextInt());

		System.out.println("How many tickets do you want? (MAX = 10)");

		ItemPlace.setCountPlus(scanner.nextInt());

		System.out.println("Special price offers for =>\n1. None\n2. DisabledPeople\n3. patriot\n4. soldier\n5. pregnant woman\n6. multiple children");

		ItemPlace.setSpecial_offer(scanner.nextInt());

	}

	

	String Indata() {

		String coId;

		

		System.out.println("Enter the ID of the accompanying person!");

		coId = scanner.next();

		

		return coId;

	}

	

	int Inputvalue() {

		int ConNum;

		

		System.out.println("Would you like to continue ticketing?\n1. YES\n2. NO");

		ConNum = scanner.nextInt();

		

		return ConNum;

	}

	

	void Finaldoi(){

		System.out.print("Wanna continue? => 1: YES 2: No, thanks!) :");

		ItemPlace.setFinal(scanner.nextInt());

		

		ItemPlace.setPricedoi(0);

	}

}