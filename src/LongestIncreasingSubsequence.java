
public class LongestIncreasingSubsequence {
	public int getNewArraySize(int[] arr){
		int size = 0;		
		int initialSize = arr.length;
		int[] tempArr = GetTempArr(initialSize);
		for(int i =0;i< initialSize; i++){
			for(int j =0; j<i; j++){
				if(arr[j] < arr[i]){
					tempArr[i] = Math.max(tempArr[i], tempArr[j]+1);
				}
			}
			for(int j=0; j<initialSize; j++){
				System.out.print(tempArr[j]+" ");
			}
			System.out.println();
		}
		for(int i: tempArr){
			if(size < i){
				size = i;
			}
		}
		return size;
	}
	
	protected int[] GetTempArr(int size){
		int[] t = new int[size];
		for(int i=0;i<size;i++){
			t[i] =1;
		}
		return t;
	}
}
