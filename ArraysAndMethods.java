import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysAndMethods {

	public static void main(String[] args) {
		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.		
		//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		//      (i.e. do not use ages[7] in your code). Print the result to the console. 
		//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int ages[] = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 17;
		
		int agesLastMinusFirst = ages[ages.length-1] - ages[0];
		System.out.println("Age of last value in array minus the first value in the array = " + agesLastMinusFirst);
		
		int sum = 0;
		int average = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
			average = sum/ages.length;
		}
		System.out.println("Average age = " + average);
		System.out.println();
		
		List<Integer> age = new ArrayList<>();
		age.add(3);
		age.add(9);
		age.add(23);
		age.add(64);
		age.add(2);
		age.add(8);
		age.add(28);
		age.add(93);
		
		int ageListLastMinusFirst = (age.get(age.size()-1)) - age.get(0);
		System.out.println("Age of last value in list minus the first value in the array = " + ageListLastMinusFirst);
		age.add(17);
		ageListLastMinusFirst = (age.get(age.size()-1)) - age.get(0);
		System.out.println("New Age of last value in list minus the first value in the array = " + ageListLastMinusFirst);
		
		int sumList = 0;
		int averageList = 0;
		for (int i = 0; i < age.size(); i++) {
			sumList += age.get(i);
			averageList = sumList/age.size();
		}
		System.out.println("Average age in List = " + averageList);
		
		System.out.println();
		
		//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		//b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		double nameSum = 0;
		double nameAverage =0;
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		for (int i = 0; i < names.length; i++) {
			nameSum += names[i].length();
		}
		System.out.println("Sum of all letters in array = " + (int)nameSum);
		nameAverage = nameSum/names.length;
		System.out.println("Average letters per string = " + nameAverage);
		
		String concatNames = "";
		for (int i = 0; i < names.length; i++) {
			concatNames += names[i] + " ";
		}
		System.out.println("Concatenated names within the string array = " + concatNames);
		
		System.out.println();
		
		//3.	How do you access the last element of any array?
		System.out.println("Last element of an array = example[example.length-1]");
		
		//4.	How do you access the first element of any array?
		System.out.println("First element of an array = example[0]");
		
		System.out.println();
		
		//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int nameLengths[] = new int[6];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int newNameSum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			newNameSum += nameLengths[i];
		}
		System.out.println("Sum of the lengths of names in the array = " + newNameSum + " letters.");
		
		System.out.println();
		
		//7.
		System.out.print("Concatenated string method = " );
		System.out.println(concatenatedString("Hello", 3));
		System.out.println();
		
		//8.
		String firstName = "Jimmy";
		String lastName = "Dean";
		System.out.print("Full name method = ");
		System.out.println(fullName(firstName, lastName));
		System.out.println();
		
		//9.
		System.out.print("Is the ages array sum greater than 100? ");
		System.out.println(isArrayGreaterthan100(ages));
		System.out.print("Is the nameLength array sum greater than 100? ");
		System.out.println(isArrayGreaterthan100(nameLengths));
		System.out.println();
		
		//10.
		double doubleArray[] = {3.74, 32.844, 78.45, 44.900, 9.13, 56.45, 7.664, 5.335};
		System.out.print("The average of an array of doubles = ");
		System.out.println(getAverage(doubleArray));
		System.out.println();
		
		//11.
		double newDoubleArray[] = {1.234, 32.66776, 0.344, 4.56, 6.75, 1.23456};
		System.out.print("Does the first array have a greater average than the second array? ");
		System.out.println(getAverage(doubleArray, newDoubleArray));
		System.out.println();
		
		//12.
		boolean isHotOutside = true;
		double moneyInPocket = 10.51;
		System.out.print("Will buy drink? ");
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		isHotOutside = false;
		moneyInPocket = 10.51;
		System.out.print("Will buy drink? ");
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		isHotOutside = false;
		moneyInPocket = 10.5;
		System.out.print("Will buy drink? ");
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		isHotOutside = true;
		moneyInPocket = 10.5;
		System.out.print("Will buy drink? ");
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		System.out.println();
		
		//13.
		int newAge[] = {3, 9, 23, 64, 2, 8};
		System.out.println("\nString Builder method example: ");
		System.out.println(ageOfPerson(names, newAge));
		System.out.println("Concatentating two arrays to form a new array example: ");
		ageOfPersonArray(names, newAge);
		System.out.println();
		System.out.println("HashMap combining two arrays: ");
		System.out.println(ageOfPersonMap(names, newAge));
		
		
	}
	//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String concatenatedString(String word, int n) {
		String concat= "";
		for (int i = 0; i < n; i++) {
			concat += word;
		}
		return concat;
	}
	
	//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean isArrayGreaterthan100(int array[]) {
		int sum = 0;
		for (int numbers : array) {
			sum += numbers;
		}
		return sum > 100;
	}
	
	//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double getAverage(double array[]) {
		double sum = 0;
		double average = 0;
		for (double numbers : array) {
			sum += numbers;
			average = sum/array.length;
		}
		return average;
	}
	//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean getAverage(double array1[], double array2[]) {
		double sum1 = 0;
		double average1 = 0;
		for (double numbers : array1) {
			sum1 += numbers;
			average1 = sum1/array1.length;
		}
		double sum2 = 0;
		double average2 = 0;
		for (double numbers : array2) {
			sum2 += numbers;
			average2 = sum2/array2.length;
		}
		return average1 > average2;
	}
	//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.5;
	}
	//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	// This method builds using StringBuilder and concatenates an array of names and ages to print out the associated age of a person based on the index of the arrays 
	public static StringBuilder ageOfPerson(String names[], int age[]) {
		StringBuilder ageName = new StringBuilder("");
		for (int i = 0; i < age.length; i++) {
			ageName.append(names[i] + " is " + age[i] + '\n');
		}
		return ageName;
	}
	// This method is similar to the previous method but it is a void method that concatenates two arrays and prints to the screen when called upon
	public static void ageOfPersonArray(String names[], int age[]) {
		String ageName[] = new String[age.length];
		for (int i = 0; i < age.length; i++) {
			ageName[i] = names[i] + " is " + age[i];
			System.out.println(ageName[i]);
		}
	}
	// This is another similar method to the prior two but instead takes two arrays to return a hashmap
	public static Map <String, Integer> ageOfPersonMap(String names[], int age[]) {
		Map <String, Integer> newMap = new HashMap<>();
		for (int i = 0; i < age.length; i++) {
			newMap.put(names[i], age[i]);  
		}
		return newMap;
	}
	
}
