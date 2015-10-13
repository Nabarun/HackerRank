
public class CombSort {
	public static int[] sortArray(int[] arr){
		if(arr.length >2){
			int gap = arr.length-1;
			while(gap!=0){
				int i = 0;
				int j = i+ gap;
				while(j != arr.length){
					if(arr[i]> arr[j]){
						arr[i] = arr[i] ^ arr[j];
						arr[j] = arr[j] ^ arr[i];
						arr[i] = arr[i] ^ arr[j];
						i++;
						j++;
					}
				}
				gap --;
			}
		}
		return arr;
	}
	
	public static void main(String[] args){
		int[] arr = new int[6];
		arr[0]= 7;
		arr[1] = 4;
		arr[2] = 2;
		arr[3] = 6;
		arr[4] = 1;
		arr[5] = 9;
		
		arr = sortArray(arr);
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
}
