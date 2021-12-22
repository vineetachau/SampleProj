package sampleProj.javaAssignments.assignment1;

import java.util.Scanner;

public class TestArrayAndSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int search,flag=0;
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Enter the element to be seached");
		search = sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("Element "+search+" found at "+i+" position");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Element "+search+" not found");
		}
		System.out.println("Array Before Bubble Sort");  
		for(int i=0; i < arr.length; i++){  
			System.out.print(arr[i] + " ");  
		}  
		System.out.println();  
		bubbleSort(arr);
		System.out.println("Array After Bubble Sort");  
		for(int i=0; i < arr.length; i++){  
			System.out.print(arr[i] + " ");  
		} 
	}
	static void bubbleSort(int[] arr) {  
		int n = arr.length;  
		int temp = 0;  
		for(int i=0; i < n; i++){  
			for(int j=1; j < (n-i); j++){  
				if(arr[j-1] > arr[j]){  
					//swap elements  
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp;  
				}  
			}  
		}  
	}  
}
