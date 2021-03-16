package studyTool;

import java.util.Scanner;

public class GalToLit {

	public static void main(String[] args) {
		double gallon;
		double liters;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan Gallons : ");
		gallon = input.nextDouble();
		
		liters = gallon * 3785;
		
		System.out.println(gallon + " Gallon adalah " + liters + 
				" liter");

	}

}
