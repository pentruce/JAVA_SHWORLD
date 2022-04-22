package Final_ticket;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class OUTDATA_SHWORLD {

	ArrayList<OrderData_SHWORLD> Oradea = new ArrayList<OrderData_SHWORLD>();

	Calculate_SHWORLD Calculate_SHWORLD = new Calculate_SHWORLD();
	
	ArrayList test = new ArrayList();
	
	void CSVtest() {
		test.add("a");
		test.add("b");
	}

	int price() {

		int ConNum;

		
		System.out.println("Total price is: " + Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getPriceunu());

		ConNum = Calculate_SHWORLD.INDATA_SHWORLD.Inputvalue();

		
		return ConNum;

	}


	void exit(){

		int temp = 0;

		System.out.println("Terminate ticket issuance. SEE YOU!\n");

		System.out.println("====================== SH'S -- WORLD ======================");

		for (int index = 0; index < Oradea.size(); index++) {

			if (Oradea.get(index).getChooseTicket() == StaticValue_SHWORLD.TOT) {

				System.out.print("1. Park & Museum Pass\n");

			} else {

				System.out.print("2. Park_only\n");

			}

			if (Oradea.get(index).getAgeResult() < StaticValue_SHWORLD.Infant)  {

				System.out.print("Infant ");

			} else if (Oradea.get(index).getAgeResult() < StaticValue_SHWORLD.BABY) {

				System.out.print("Baby ");

			} else if (Oradea.get(index).getAgeResult() < StaticValue_SHWORLD.CHILD) {

				System.out.print("Child ");

			} else if (Oradea.get(index).getAgeResult() < StaticValue_SHWORLD.TEEN) {

				System.out.print("Youth ");

			} else if (Oradea.get(index).getAgeResult() < StaticValue_SHWORLD.ADULT) {

				System.out.print("Adult ");

			} else {

				System.out.print("Seniors ");

			}

			if (Oradea.get(index).getZiua() == StaticValue_SHWORLD.ONEDAY) {

				System.out.print("1Day ");

			} else {

				System.out.print("After4 ");

			}

			System.out.print("X     " + Oradea.get(index).getCountPlus() + "     ");

			System.out.print(Oradea.get(index).getPriceunu() + "won");

			

			temp += Oradea.get(index).getPriceunu();

			Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.setPricedoi(temp);

			
			if (Oradea.get(index).getSpecial_offer() == StaticValue_SHWORLD.NONE) {

				System.out.println(" [None]");

			} else if (Oradea.get(index).getSpecial_offer() == StaticValue_SHWORLD.DisabledPeople) {

				System.out.println(" [Special price offers for DisabledPeople]");

			} else if (Oradea.get(index).getSpecial_offer() == StaticValue_SHWORLD.Patriot) {

				System.out.println(" [Special price offers for patriot]");

			} else if (Oradea.get(index).getSpecial_offer() == StaticValue_SHWORLD.Soldier) {

				System.out.println(" [Special price offers for soldier]");

			} else if (Oradea.get(index).getSpecial_offer() == StaticValue_SHWORLD.Pregnant_Woman) {

				System.out.println(" [Special price offers for pregnant woman]");

			} else if (Oradea.get(index).getSpecial_offer() == StaticValue_SHWORLD.Multiple_Children) {

				System.out.println(" [Special price offers for multiple children]");

			} 

		}

		System.out.println("\nTotal price is: " + Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getPricedoi());

		System.out.println("===========================================================\n");

	}
	
	public void writeCsv(ArrayList<OrderData_SHWORLD> oradea) {
		String fileName = "C:\\Users\\sohyeon\\Desktop\\SHWORLD\\report.csv";
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(fileName);
			for (OrderData_SHWORLD Oradea : oradea) {
				out.write(Oradea.getBytes());
			}
			System.out.println("\n▶ 파일이 C드라이브 SHWORLD 폴더에 저장되었습니다.\n");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				out.close();
			} catch (IOException e) {
			}
		}
	}
	void amandoua() {

	ArrayList Oradea = new ArrayList<OrderData_SHWORLD>();

	}
	
	void customer() {

		Oradea.add(Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace);

	}

	void Again() {

		Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace = new OrderData_SHWORLD();
	}
}