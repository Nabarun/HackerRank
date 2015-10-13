
public class InsertionSort {
	protected int[] sort(int[] arr){
		for(int i=1;i< arr.length; i++){
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key){
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;		
	}
	
	protected static void printArray(int[] arr){
		for(int i: arr){
			System.out.print(i +" ");
		}
	}
	
	public static void main(String[] args){
		int[] array = new int[6];
		array[0] = 6;
		array[1] = 3;
		array[2] = 1;
		array[3] = 7;
		array[4] = 39;
		array[5] = 33;
		
		InsertionSort sort = new InsertionSort();
		int[] newArr = sort.sort(array);
		printArray(newArr);
	}
}
