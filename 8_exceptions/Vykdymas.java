package trycatchND;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vykdymas {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Scanner scFile;
		
		String fileName;
		//kintamieji tolesniam programos darbo vykdymui/nutraukimui realizuoti
		String yn = "Y";
		String ny = "Y";
		
		//darbuotojo duomenu isvedimas
		while (yn.equals(ny) == true) {

			System.out.print("Iveskite darbuotojo pavarde: ");
			// String - pavarde.txt
			fileName = sc.next() + ".txt";
			
			// Scanner - pavarde.txt
			try {
				scFile = new Scanner(new File(fileName));			
			
			while (scFile.hasNext()) {
				System.out.println(scFile.nextLine());
			}
			} catch (FileNotFoundException e) {
				System.out.println("Failo " + fileName + " nepavyko rasti!");
			}
			
			// ny = Y, jei parenkamas N, iseinama is ciklo
			System.out.print("Ar norite testi (Y/N): ");
			
			ny = (sc.next());
			
		}

		sc.close();
		
	}

}
