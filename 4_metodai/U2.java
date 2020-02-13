package task_4;

import java.util.Scanner;

public class U2 {
	
	/**
	 * Paduodamos datos dienu apskaiciavimas nuo metu pradzios
	 * @param year / paduodami metai
	 * @param month / paduodamas menesis
	 * @param day / paduodama diena
	 * @return / grazinamas apskaiciuotas intervalas dienomis intDays
	 */
	public static int dayCalc(int year, int month, int day) {
		int numDays=0; 										// dienu skaicius menesyje
		int intDays=0;										// apskaiciuotas intervalas dienomis

		if (month > 1) {
			for (int i = 1; i < month; i++) {

				switch (i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: numDays = 31; break;
				case 2:
					if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
						numDays = 29;
					else
						numDays = 28;
					break;
				case 4:
				case 6:
				case 9:
				case 11: numDays = 30; break;
				
				default:
					System.out.println("Neteisngas menesis");
					break;	
				}
				
				intDays+=numDays;
			}
			intDays+=day;
		} else 
			intDays = day;

	return intDays;

	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Iveskite metus nuo: ");
		int yf = sc.nextInt();
		System.out.print("Iveskite menesi nuo: ");
		int mf = sc.nextInt();
		System.out.print("Iveskite diena nuo: ");
		int df = sc.nextInt();
		System.out.print("Iveskite metus iki: ");
		int yt = sc.nextInt();
		System.out.print("Iveskite menesi iki: ");
		int mt = sc.nextInt();
		System.out.print("Iveskite diena iki: ");
		int dt = sc.nextInt();
		sc.close();
		
		int days;
		int daysInt = 0;
		
		// Apskaiciuojamas dienu skaicius tarp ivestu metu
		for (int i=yf; i<yt; i++) {
			if (((i % 4 == 0) && !(i % 100 == 0)) || (i % 400 == 0))
				days = 366;
			else
				days = 365;
			daysInt += days;
		}
		
		// Apskaiciuojamas dienu skaicius tarp ivestu datu
		int period = daysInt - (dayCalc(yf, mf, df) - dayCalc(yt, mt, dt));
		
		System.out.println("Dienu skaicius tarp nurodytu datu: "+period);
	
	}

}
