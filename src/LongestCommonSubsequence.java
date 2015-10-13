
public class LongestCommonSubsequence {
	protected int[][] getDynamicArray(char[] string1, char[] string2){
		int[][] dynamicArr = new int[string1.length][string2.length];
		for(int i=0; i< string1.length; i++){
			for(int j=0; j< string2.length; j++){
				dynamicArr[i][j] = 0;
			}
		}
		return dynamicArr;
	}
	
	
}
