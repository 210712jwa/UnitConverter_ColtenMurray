import java.util.Scanner;

public class Converter {
 public static void main(String[] args) {
	 
	 UserInput input = new UserInput();
	 
	 int mainMenuSelection;
	 int firstUnitSelection;
	 int secondUnitSelection;
	 
	 // Main Menu Loop
	 do {
		 mainMenuSelection = menu();
		 input.setMainMenuSelection(mainMenuSelection);
		 // User chose volume conversion
		 if(mainMenuSelection ==1) {
			// Selecting First Unit
			 System.out.println("Please Choose Converting Unit:");
			 firstUnitSelection = volumeConversionMenu();
			 input.setFirstUnitSelection(firstUnitSelection);
			// Check for quit
			 if(firstUnitSelection !=5) {
				// Selecting Second Unit
				 System.out.println("Please Choose Unit to Convert to:");
				 secondUnitSelection = volumeConversionMenu();
				 input.setSecondUnitSelection(secondUnitSelection);
				// Check for quit
				 if(secondUnitSelection != 5) {
					 getInput(input);
					 convertVolume(input);
					 printConversion(input);
				 }
			 }
			 
		 }
		 // User chose distance conversion
		 else if(mainMenuSelection == 2) {
			 // Selecting First Unit
			 System.out.println("Please Choose Converting Unit:");
			 firstUnitSelection = distanceConversionMenu();
			 input.setFirstUnitSelection(firstUnitSelection);
			 // Check for quit
			 if(firstUnitSelection !=5) {
				// Selecting Second Unit
				 System.out.println("Please Choose Unit to Convert to:");
				 secondUnitSelection = distanceConversionMenu();
				 input.setSecondUnitSelection(secondUnitSelection);
				// Check for quit
				 if(secondUnitSelection != 5) {
					 getInput(input);
					 convertDistance(input);
					 printConversion(input);
				 }
			 }
		 }
			 
	 }while(mainMenuSelection != 3);
	 	 
	 	 
 }
 
 public static int menu() 
 {
	 Scanner menuSelection = new Scanner(System.in);
	 // Main menu options
	 System.out.println("Please Select an Option:");
		 System.out.println("1. Volume Conversions");
		 System.out.println("2. Distance Conversions");
		 System.out.println("3. Quit");
		 int selection = menuSelection.nextInt();
	 //menuSelection.close();
	 return selection;
}
 
 public static int volumeConversionMenu() {
	 Scanner menuSelection = new Scanner(System.in);
	 // Volume menu options
	 System.out.println("1. US Gallons");
	 System.out.println("2. Liters");
	 System.out.println("3. Cubic Feet");
	 System.out.println("4. Imperial Cup");
	 System.out.println("5. Quit");
	 int selection = menuSelection.nextInt();
		 
	 return selection;

 }
 public static int distanceConversionMenu() {
	 Scanner menuSelection = new Scanner(System.in);
	 // Distance menu options
	 System.out.println("1. Feet");
	 System.out.println("2. Meters");
	 System.out.println("3. Miles");
	 System.out.println("4. Kilometers");
	 System.out.println("5. Quit");
	 int selection = menuSelection.nextInt();
		 
	 return selection;

 }
 
 // Collects user value input
 public static void getInput(UserInput input)
 {
	 Scanner inputValue = new Scanner(System.in);
	 System.out.println("Please input # of " + input.getFirstUnit() + ":");
	 double value = inputValue.nextDouble();
	 input.setValue(value);
	 
 }
 
 public static void convertVolume(UserInput input)
 {
	 switch(input.getFirstSelection()) {
	 case 1:
		 convertGallons(input);
		 break;
	 case 2:
		 convertLiters(input);
		 break;
	 case 3:
		 convertCubicFt(input);
		 break;
	 case 4:
		 convertImperialCups(input);
		 break;
	 }
 }
 
 public static void convertDistance(UserInput input) {
	 switch(input.getFirstSelection()) {
	 case 1:
		 convertFeet(input);
		 break;
	 case 2:
		 convertMeters(input);
		 break;
	 case 3:
		 convertMiles(input);
		 break;
	 case 4:
		 convertKilometers(input);
		 break;
	 }
	 
 }
 public static void convertGallons(UserInput input) {
	 double gallons2Liters = 3.78541;
	 double gallons2Cubicft = 0.133681;
	 double gallons2Cup= 13.3228;
	 double convertedvalue = 0;
	 switch(input.getSecondSelection()) {
	 case 1: 
		 convertedvalue = input.getInputValue();
		 break;
	 case 2:
		 convertedvalue = input.getInputValue()*gallons2Liters;
		 break;
	 case 3:
		 convertedvalue = input.getInputValue()*gallons2Cubicft;
		 break;
	 case 4:
		 convertedvalue = input.getInputValue()*gallons2Cup;
		 break;
	 }
	 input.setConvertedValue(convertedvalue);
 }
 public static void convertLiters(UserInput input) {
	 double liters2Gallons = 0.264172;
	 double liters2Cubicft = 0.0353147;
	 double liters2Cup = 3.51951;
	 double convertedvalue = 0;
	 switch(input.getSecondSelection()) {
	 case 1:
		 convertedvalue= input.getInputValue()*liters2Gallons;
		 break;
	 case 2:
		 convertedvalue= input.getInputValue();
		 break;
	 case 3:
		 convertedvalue= input.getInputValue()*liters2Cubicft;
		 break;
	 case 4:
		 convertedvalue= input.getInputValue()*liters2Cup;
		 break;
	 }
	 input.setConvertedValue(convertedvalue);
	 
 }
 public static void convertCubicFt(UserInput input) {
	 double Cubicft2Gallons = 7.48052;
	 double Cubicft2Liters = 28.3168;
	 double Cubicft2Cup = 99.6614;
	 double convertedvalue = 0;
	 switch(input.getSecondSelection()) {
	 case 1:
		 convertedvalue= input.getInputValue()*Cubicft2Gallons;
		 break;
	 case 2:
		 convertedvalue= input.getInputValue()*Cubicft2Liters;
		 break;
	 case 3:
		 convertedvalue= input.getInputValue();
		 break;
	 case 4:
		 convertedvalue= input.getInputValue()*Cubicft2Cup;
		 break;
	 }
	 input.setConvertedValue(convertedvalue);
	 
 }
 public static void convertImperialCups(UserInput input) {
	 double Cup2Gallons = 0.0750594;
	 double Cup2Liters = 0.284131;
	 double Cup2Cubicft = 0.010034;
	 double convertedvalue = 0;
	 switch(input.getSecondSelection()) {
	 case 1:
		 convertedvalue= input.getInputValue()*Cup2Gallons;
		 break;
	 case 2:
		 convertedvalue= input.getInputValue()*Cup2Liters;
		 break;
	 case 3:
		 convertedvalue= input.getInputValue()*Cup2Cubicft;
		 break;
	 case 4:
		 convertedvalue= input.getInputValue();
		 break;
	 }
	 input.setConvertedValue(convertedvalue);
 }
 public static void convertFeet(UserInput input) {
	 double feet2Meters = 0.3048;
	 double feet2Miles = 0.000189394;
	 double feet2Kilometers = 0.0003048;
	 double convertedvalue = 0;
	 switch(input.getSecondSelection()) {
	 case 1:
		 convertedvalue= input.getInputValue();
		 break;
	 case 2:
		 convertedvalue= input.getInputValue()*feet2Meters;
		 break;
	 case 3:
		 convertedvalue= input.getInputValue()*feet2Miles;
		 break;
	 case 4:
		 convertedvalue= input.getInputValue()*feet2Kilometers;
		 break;
	 }
	 input.setConvertedValue(convertedvalue);
	 
 }
 public static void convertMeters(UserInput input) {
	 double meters2Feet = 3.28084;
	 double meters2Miles = 0.000621371;
	 double meters2Kilometers = 0.001;
	 double convertedvalue = 0;
	 switch(input.getSecondSelection()) {
	 case 1:
		 convertedvalue= input.getInputValue()*meters2Feet;
		 break;
	 case 2:
		 convertedvalue= input.getInputValue();
		 break;
	 case 3:
		 convertedvalue= input.getInputValue()*meters2Miles;
		 break;
	 case 4:
		 convertedvalue= input.getInputValue()*meters2Kilometers;
		 break;
	 }
	 input.setConvertedValue(convertedvalue);
	 
 }
 public static void convertMiles(UserInput input) {
	 double miles2Feet = 5280;
	 double miles2Meters = 1609.34;
	 double miles2Kilometers = 1.60934;
	 double convertedvalue = 0;
	 switch(input.getSecondSelection()) {
	 case 1:
		 convertedvalue= input.getInputValue()*miles2Feet;
		 break;
	 case 2:
		 convertedvalue= input.getInputValue()*miles2Meters;
		 break;
	 case 3:
		 convertedvalue= input.getInputValue();
		 break;
	 case 4:
		 convertedvalue= input.getInputValue()*miles2Kilometers;
		 break;
	 }
	 input.setConvertedValue(convertedvalue);
	 
 }
 public static void convertKilometers(UserInput input) {
	 double kilometers2Feet = 3280.84;
	 double kilometers2Meters = 1000;
	 double kilometers2Miles = 0.621371;
	 double convertedvalue = 0;
	 switch(input.getSecondSelection()) {
	 case 1:
		 convertedvalue= input.getInputValue()*kilometers2Feet;
		 break;
	 case 2:
		 convertedvalue= input.getInputValue()*kilometers2Meters;
		 break;
	 case 3:
		 convertedvalue= input.getInputValue()*kilometers2Miles;
		 break;
	 case 4:
		 convertedvalue= input.getInputValue();
		 break;
	 }
	 input.setConvertedValue(convertedvalue);
 }
 public static void printConversion(UserInput input) {
	 System.out.println(input.getInputValue() + " " + input.getFirstUnit() + " Converts into " + input.getConvertedValue() + " " + input.getSecondUnit());
	 
 }
}
