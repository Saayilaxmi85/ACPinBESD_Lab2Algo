package com.gl.lab2;

import java.util.Scanner;

public class MoneyDenominations {
	
	public int size, i, min, temp, startPoint= 0;
	public int array[], arraysorted[];
	public boolean status;
	
	Scanner sc = new Scanner(System.in);
	
	private int sortedvalue;
	public void implementationOfInsertionSort() {
		// Insert values
		
		insertValues();
		
		status = checkForStatus();
		
		// Sort values();
		
		do {
		//	sort();
		  //  printValues();
			sortedvalue += 1;
			status = checkForStatus();
			} while (status == false);
		}
		//	}
				
	
	public void insertValues() {
		for (i = 0; i < size; i++) {
		//	System.out.print("Enter element at position " +i + ": ");
			
			array[i] = sc.nextInt(); 
			}
		}
	int[] sort(int arraysorted[]) {
		int j = sortedvalue;
		while ((j > 0) && (j < size) && (array[j]< array[j - 1])) {
			temp = array[j - 1];
			
			array[j - 1] = array[j];
			array[j] = temp;
			j -= 1;
			}
		arraysorted = array;
		return arraysorted;
		}
//	int  printValues(int array[]) {
		//for (int i = 0; i < size; i++) {
			//System.out.println("Value at position " + i + "is:" + array[i]);
			//
			//}
		
			//}
	public boolean checkForStatus() {
		for (i = 0; i < size - 1; i++) {
			if (array[i] > array[i + 1]) {
				sortedvalue = i + 1;
				return false;
				}
			}
		return true;
			}
	
	
	public static void main(String[] args) {
		
		MoneyDenominations md = new MoneyDenominations();
		md.implementationOfInsertionSort();
		

		int sizeOfDenomination;
		int arrCurrencyDenominations[];
		int arrCurrencyNoteCont[];
		int paymentValue;


		Currency currency = new Currency();

		Scanner input = new Scanner(System.in);

		System.out.println("enter the size of currency denominations");

		sizeOfDenomination = input.nextInt();

		arrCurrencyDenominations = new int[sizeOfDenomination];
		arrCurrencyNoteCont = new int[sizeOfDenomination];

		System.out.println("enter the currency denominations value");

		for (int i = 0; i < arrCurrencyDenominations.length; i++) {

			arrCurrencyDenominations[i] = input.nextInt();
		}

		
		arrCurrencyDenominations = currency.sort(arrCurrencyDenominations);
		currency.printArray(arrCurrencyDenominations);

		System.out.println("enter the amount you want to pay");

		paymentValue = input.nextInt();

		for (int i = arrCurrencyDenominations.length -1 ; i >= 0; i--) {
			if (paymentValue >= arrCurrencyDenominations[i]) {
				arrCurrencyNoteCont[i] = paymentValue / arrCurrencyDenominations[i];
				paymentValue = paymentValue - arrCurrencyNoteCont[i] * arrCurrencyDenominations[i];
			}
		}

		for (int i = 0; i < arrCurrencyNoteCont.length; i++) {
			if (arrCurrencyNoteCont[i] != 0) {
				System.out.println(arrCurrencyDenominations[i] + " : " + arrCurrencyNoteCont[i]);  
			}
		}

		input.close();
	}
		
}


