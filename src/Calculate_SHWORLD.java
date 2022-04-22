package Final_ticket;

import java.util.Calendar;

public class Calculate_SHWORLD {

INDATA_SHWORLD INDATA_SHWORLD = new INDATA_SHWORLD();

	

	int age(int birth, int id) {

		Calendar cal = Calendar.getInstance();

		

		int interAge = 0;	

		int curr_year;

		int curr_month;

		int curr_day;

		

		curr_year = cal.get(Calendar.YEAR);

		curr_month = cal.get(Calendar.MONTH) + 1;

		curr_day = cal.get(Calendar.DAY_OF_MONTH);

		

		if (id < 3) {

			interAge = curr_year - (1900 + birth / 10000) - 1;

		} else {

			interAge = curr_year - (2000 + birth / 10000) - 1;

		}

		if (birth % 10000 <= (curr_month * 100 + curr_day)) {

			interAge++;

		}

		

		return interAge;

	}

	

	int companionPrice(int ticket, int Ziua, int wow) {

		String coId;

		int coAgeResult = 0;

		int coGeneInt, coBirthInt;

		int price_two = 0;

		

		if(!(wow == StaticValue_SHWORLD.Soldier && ticket == StaticValue_SHWORLD.UNA)){

			coId = INDATA_SHWORLD.Indata();

			coBirthInt = Integer.parseInt(coId.substring(0, 6));

			coGeneInt = Integer.parseInt(coId.substring(6, 7));

			

			coAgeResult = age(coBirthInt, coGeneInt);

		}

		

		if (ticket == StaticValue_SHWORLD.TOT) {

			if (Ziua == StaticValue_SHWORLD.ONEDAY) {

				if (wow == StaticValue_SHWORLD.DisabledPeople || wow == StaticValue_SHWORLD.Patriot) {

					if (coAgeResult < StaticValue_SHWORLD.CHILD) {

						price_two = (int) (StaticValue_SHWORLD.CHILD_1DAY_TOT * 0.5);

					} else if (coAgeResult < StaticValue_SHWORLD.TEEN) {

						price_two = (int) (StaticValue_SHWORLD.TEEN_1DAY_TOT * 0.5);

					} else if (coAgeResult < StaticValue_SHWORLD.ADULT) {

						price_two = (int) (StaticValue_SHWORLD.ADULT_1DAY_TOT * 0.5);

					}

				} 

			} else {

				if (wow == StaticValue_SHWORLD.DisabledPeople || wow == StaticValue_SHWORLD.Patriot) {

					if (coAgeResult < StaticValue_SHWORLD.CHILD) {

						price_two = (int) (StaticValue_SHWORLD.CHILD_AFTER4_TOT * 0.5);

					} else if (coAgeResult < StaticValue_SHWORLD.TEEN) {

						price_two = (int) (StaticValue_SHWORLD.TEEN_AFTER4_TOT * 0.5);

					} else if (coAgeResult < StaticValue_SHWORLD.ADULT) {

						price_two = (int) (StaticValue_SHWORLD.ADULT_AFTER4_TOT * 0.5);

					}

				} 

				}

			}

		 else {

			if (Ziua == StaticValue_SHWORLD.ONEDAY) {

				switch(wow){

					case 2:

					case 3:

						if (coAgeResult < StaticValue_SHWORLD.CHILD) {

							price_two = (int) (StaticValue_SHWORLD.CHILD_1DAY_UNA * 0.5);

						} else if (coAgeResult < StaticValue_SHWORLD.TEEN) {

							price_two = (int) (StaticValue_SHWORLD.TEEN_1DAY_UNA * 0.5);

						} else if (coAgeResult < StaticValue_SHWORLD.ADULT) {

							price_two = (int) (StaticValue_SHWORLD.ADULT_1DAY_UNA * 0.5);

						}

						break;

				}

			} else {

				switch(wow){

					case 2:

					case 3:

						if (coAgeResult < StaticValue_SHWORLD.CHILD) {

							price_two = (int) (StaticValue_SHWORLD.CHILD_AFTER4_UNA * 0.5);

						} else if (coAgeResult < StaticValue_SHWORLD.TEEN) {

							price_two = (int) (StaticValue_SHWORLD.TEEN_AFTER4_UNA * 0.5);

						} else if (coAgeResult < StaticValue_SHWORLD.ADULT) {

							price_two = (int) (StaticValue_SHWORLD.ADULT_AFTER4_UNA * 0.5);

						}

						break;

				}

			}

		}

		return price_two;

	}

	

	int ticketResult(int ticket, int interAge, int Ziua, int wow) {

		int price_one = 0;

		

		if (interAge < StaticValue_SHWORLD.Infant) {

			price_one = StaticValue_SHWORLD.FREE;

		} else if (interAge < StaticValue_SHWORLD.BABY) {

			price_one = StaticValue_SHWORLD.BABY;

		} else {

			if (ticket == StaticValue_SHWORLD.TOT) {

				if (Ziua == StaticValue_SHWORLD.ONEDAY) {

					if (interAge >= StaticValue_SHWORLD.ADULT) { 

						price_one = StaticValue_SHWORLD.CHILD_1DAY_TOT;

					} else { 

						if (wow == StaticValue_SHWORLD.NONE) {

							if (interAge < StaticValue_SHWORLD.CHILD) {

								price_one = StaticValue_SHWORLD.CHILD_1DAY_TOT;

							} else if (interAge < StaticValue_SHWORLD.TEEN) {

								price_one = StaticValue_SHWORLD.TEEN_1DAY_TOT;

							} else if (interAge < StaticValue_SHWORLD.ADULT) {

								price_one = StaticValue_SHWORLD.ADULT_1DAY_TOT;

							}

						} else if (wow == StaticValue_SHWORLD.DisabledPeople || wow == StaticValue_SHWORLD.Patriot) {

							if (interAge < StaticValue_SHWORLD.CHILD) {

								price_one = (int) (StaticValue_SHWORLD.CHILD_1DAY_TOT * 0.5);

							} else if (interAge < StaticValue_SHWORLD.TEEN) {

								price_one = (int) (StaticValue_SHWORLD.TEEN_1DAY_TOT * 0.5);

							} else if (interAge < StaticValue_SHWORLD.ADULT) {

								price_one = (int) (StaticValue_SHWORLD.ADULT_1DAY_TOT * 0.5);

							}

						} 

						else if (wow == StaticValue_SHWORLD.Pregnant_Woman) {

							price_one = (int) (StaticValue_SHWORLD.ADULT_1DAY_TOT * 0.5);

						} else if (wow == StaticValue_SHWORLD.Multiple_Children) {

							if (interAge < StaticValue_SHWORLD.CHILD) {

								price_one = (int) (StaticValue_SHWORLD.CHILD_1DAY_TOT * 0.7);

							} else if (interAge < StaticValue_SHWORLD.TEEN) {

								price_one = (int) (StaticValue_SHWORLD.TEEN_1DAY_TOT * 0.7);

							} else if (interAge < StaticValue_SHWORLD.ADULT) {

								price_one = (int) (StaticValue_SHWORLD.ADULT_1DAY_TOT * 0.7);

							}

						}

					}

				} else {

					if (interAge >= StaticValue_SHWORLD.ADULT) { 

						price_one = StaticValue_SHWORLD.CHILD_AFTER4_TOT;

					} else {

						if(wow == StaticValue_SHWORLD.NONE) {

							if (interAge < StaticValue_SHWORLD.CHILD) {

								price_one = StaticValue_SHWORLD.CHILD_AFTER4_TOT;

							} else if (interAge < StaticValue_SHWORLD.TEEN) {

								price_one = StaticValue_SHWORLD.TEEN_AFTER4_TOT;

							} else if (interAge < StaticValue_SHWORLD.ADULT) {

								price_one = StaticValue_SHWORLD.ADULT_AFTER4_TOT;

							}

						} else if(wow == StaticValue_SHWORLD.DisabledPeople || wow == StaticValue_SHWORLD.Patriot) {

							if (interAge < StaticValue_SHWORLD.CHILD) {

								price_one = (int) (StaticValue_SHWORLD.CHILD_AFTER4_TOT * 0.5);

							} else if (interAge < StaticValue_SHWORLD.TEEN) {

								price_one = (int) (StaticValue_SHWORLD.TEEN_AFTER4_TOT * 0.5);

							} else if (interAge < StaticValue_SHWORLD.ADULT) {

								price_one = (int) (StaticValue_SHWORLD.ADULT_AFTER4_TOT * 0.5);

							}

						} else if(wow == StaticValue_SHWORLD.Pregnant_Woman) {

							price_one = (int) (StaticValue_SHWORLD.ADULT_AFTER4_TOT * 0.5);

						} else if(wow == StaticValue_SHWORLD.Multiple_Children) {

							if (interAge < StaticValue_SHWORLD.CHILD) {

								price_one = (int) (StaticValue_SHWORLD.CHILD_AFTER4_TOT * 0.7);

							} else if (interAge < StaticValue_SHWORLD.TEEN) {

								price_one = (int) (StaticValue_SHWORLD.TEEN_AFTER4_TOT * 0.7);

							} else if (interAge < StaticValue_SHWORLD.ADULT) {

								price_one = (int) (StaticValue_SHWORLD.ADULT_AFTER4_TOT * 0.7);

							}

						}	

					}

				}

			} else {  

				if (Ziua == StaticValue_SHWORLD.ONEDAY) {

					if (interAge >= StaticValue_SHWORLD.ADULT) { 

						price_one = StaticValue_SHWORLD.CHILD_1DAY_UNA;

					} else {

						if (wow == StaticValue_SHWORLD.NONE || wow == StaticValue_SHWORLD.Soldier ||

							wow == StaticValue_SHWORLD.Pregnant_Woman || wow == StaticValue_SHWORLD.Multiple_Children) {

							if (interAge < StaticValue_SHWORLD.CHILD) {

								price_one = StaticValue_SHWORLD.CHILD_1DAY_UNA;

							} else if (interAge < StaticValue_SHWORLD.TEEN) {

								price_one = StaticValue_SHWORLD.TEEN_1DAY_UNA;

							} else if (interAge < StaticValue_SHWORLD.ADULT) {

								price_one = StaticValue_SHWORLD.ADULT_1DAY_UNA;

							}

						} else if (wow == StaticValue_SHWORLD.DisabledPeople || wow == StaticValue_SHWORLD.Patriot) {

							if (interAge < StaticValue_SHWORLD.CHILD) {

								price_one = (int) (StaticValue_SHWORLD.CHILD_1DAY_UNA * 0.5);

							} else if (interAge < StaticValue_SHWORLD.TEEN) {

								price_one = (int) (StaticValue_SHWORLD.TEEN_1DAY_UNA * 0.5);

							} else if (interAge < StaticValue_SHWORLD.ADULT) {

								price_one = (int) (StaticValue_SHWORLD.ADULT_1DAY_UNA * 0.5);

							}

						}

					}

				} else { 

					if (interAge >= StaticValue_SHWORLD.ADULT) { 

						price_one = StaticValue_SHWORLD.CHILD_AFTER4_UNA;

					} else {

						if (wow == StaticValue_SHWORLD.NONE || wow == StaticValue_SHWORLD.Soldier ||

							wow == StaticValue_SHWORLD.Pregnant_Woman || wow == StaticValue_SHWORLD.Multiple_Children) {

							if (interAge < StaticValue_SHWORLD.CHILD) {

								price_one = StaticValue_SHWORLD.CHILD_AFTER4_UNA;

							} else if (interAge < StaticValue_SHWORLD.TEEN) {

								price_one = StaticValue_SHWORLD.TEEN_AFTER4_UNA;

							} else if (interAge < StaticValue_SHWORLD.ADULT) {

								price_one = StaticValue_SHWORLD.ADULT_AFTER4_UNA;

							}

						} else if (wow == StaticValue_SHWORLD.DisabledPeople || wow == StaticValue_SHWORLD.Patriot) {

							if (interAge < StaticValue_SHWORLD.CHILD) {

								price_one = (int) (StaticValue_SHWORLD.CHILD_AFTER4_UNA * 0.5);

							} else if (interAge < StaticValue_SHWORLD.TEEN) {

								price_one = (int) (StaticValue_SHWORLD.TEEN_AFTER4_UNA * 0.5);

							} else if (interAge < StaticValue_SHWORLD.ADULT) {

								price_one = (int) (StaticValue_SHWORLD.ADULT_AFTER4_UNA * 0.5);

							}

						}

					}

				}

			}

		}

		return price_one;

	}

	

	int lastPrice(int Result, int price_one, int wow, int menu, int price_two, int Ziua) {

		int restPrice;

		int priceResult = 0;

		

		if (Result != 0) {

			if (wow == 2 || wow == 3) {

				priceResult = (int) (price_one / 0.5 * (menu - 2) + price_two + price_one);

			} else if (wow == 4) {

				if (Ziua == 1) {

					restPrice = StaticValue_SHWORLD.ADULT_1DAY_TOT;

				} else {

					restPrice = StaticValue_SHWORLD.ADULT_AFTER4_TOT;

				}

				priceResult = restPrice * (menu - 2) + price_two + price_one;

			}

		} else {

			priceResult = price_one * menu;

		}

		

		return priceResult;

	}

 

	void customerSpecial(int wow) {

		INDATA_SHWORLD.ItemPlace.setSpecial_offer(wow);

	}

}