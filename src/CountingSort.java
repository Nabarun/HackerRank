import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountingSort {
	protected static ArrayList<Integer> createArray(int n){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<n; i++){
			arr.add(i); 
		}
		Collections.shuffle(arr);
		return arr;
	}
	
	protected static int[] sort(ArrayList<Integer> arr){
		int[] kArr = new int[arr.size()];
		int[] sortedArr = new int[arr.size()];
		int total =0;
		for (int i=0; i< arr.size(); i++){
			kArr[arr.get(i)]++;
		}
		for(int i=0; i < arr.size(); i++){
			int temp = kArr[i];
			kArr[i] =  total;
			total = total+ temp;	
			
					
		}
		
		for(int i=0;i<arr.size()-1; i++){
			int data = kArr[arr.get(i)];
			sortedArr[data]= arr.get(i);
		}
		return sortedArr;
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int length = s. nextInt();
				
		ArrayList<Integer> arr = createArray(length);
		
		int[] sortArr = sort(arr);
		
		for(int i: sortArr){
			System.out.println(i);
		}
	}
}
