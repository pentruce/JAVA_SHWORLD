package Final_ticket;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class TicketSystem_SHWORLD {
	ArrayList<OrderData_SHWORLD> Oradea = new ArrayList<OrderData_SHWORLD>(); //csv 파일 리스트
	

public OUTDATA_SHWORLD OUTDATA_SHWORLD = new OUTDATA_SHWORLD();


	int ticketSystem_SHWORLD()  {
		
		dowhile();
		return 0;

	}
	int dowhile() {

		do{

			keepgoing();

			OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.Finaldoi();

		}
		
		while(OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getFinal() == StaticValue_SHWORLD.CONTINUE_TICKET);
		return 0;

	}
	
	int anicalculate() {

		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.setAgeResult(OUTDATA_SHWORLD.Calculate_SHWORLD.age(OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getZiuamea(),

		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getStiu()));
		return 0;

	}
	

	int ticketPrice() {

		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.setPriceResult(OUTDATA_SHWORLD.Calculate_SHWORLD.ticketResult(OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getChooseTicket(), 

		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getAgeResult(), 
		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getZiua(), 

		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getSpecial_offer()));
		return 0;

	}

	

	int priceunu() {

		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.setPriceunu(OUTDATA_SHWORLD.Calculate_SHWORLD.lastPrice(OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getResult(), 

		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getPriceResult(), 
		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getSpecial_offer(), 

		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getCountPlus(), 
		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getResult(),

		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getZiua()));
		return 0;

	}

	

	int Resultfinal() {

		if (OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getAgeResult() < StaticValue_SHWORLD.BABY || 

		OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getAgeResult() >= StaticValue_SHWORLD.ADULT) {

		OUTDATA_SHWORLD.Calculate_SHWORLD.customerSpecial(StaticValue_SHWORLD.NONE);
		
		} 
		
		else {

			if (OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getChooseTicket() == StaticValue_SHWORLD.UNA) {

				if (OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getSpecial_offer() == StaticValue_SHWORLD.Soldier ||

					OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getSpecial_offer() == StaticValue_SHWORLD.Pregnant_Woman || 

					OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.ItemPlace.getSpecial_offer() == StaticValue_SHWORLD.Multiple_Children) {

					OUTDATA_SHWORLD.Calculate_SHWORLD.customerSpecial(StaticValue_SHWORLD.NONE);

				}

			}

		}
		return 0;

	}


	int keepgoing() {

		while(true){

			int ConNum;

			OUTDATA_SHWORLD.Calculate_SHWORLD.INDATA_SHWORLD.inputData();

			anicalculate();

			ticketPrice();

			priceunu();

			OUTDATA_SHWORLD.customer();

			Resultfinal();

			ConNum = OUTDATA_SHWORLD.price();

			if (ConNum == StaticValue_SHWORLD.CONTINUE_TICKET) {

				OUTDATA_SHWORLD.Again();
				

			} else if (ConNum == StaticValue_SHWORLD.EXIT) {

				OUTDATA_SHWORLD.exit();
				OUTDATA_SHWORLD.writeCsv(OUTDATA_SHWORLD.test);
				OUTDATA_SHWORLD.amandoua();

				break;

			}

		}
		return 0;

	}

}