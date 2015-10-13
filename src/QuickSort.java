import java.io.*;
import java.util.*;

public class QuickSort {
    
    protected static int[] quickSort(int[] str, int low, int high){   
        if(str == null || str.length ==0){
            return null;
        }
        
        if(low>=high){
            return null;
        }
        
        int middle = low + (high-low)/2;
        int pivot = str[middle];
        int i=low;
        int j=high;
        while(i<=j){
            while(str[i]<pivot){
                i++;
            }
            while(str[j] > pivot){
                j--;
            }
            if(i<=j){
                int temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                j--;
                i++;
            }                    
        }
        if (low < j)
			quickSort(str, low, j);
 
		if (high > i)
			quickSort(str, i, high);
        
        //String string = new String(str);
        return str;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int column = s.nextInt();
        int rows = s.nextInt();
        String[][] stringGrid = new String[column][rows];
        for(int i=0; i< column; i++){
            for(int j= 0; j< rows; j++){
                stringGrid[i][j] = s.next();                
            }
        }
        for(int i=0; i< column; i++){
            for(int j= 0; j< rows; j++){
                String str = quickSort(stringGrid[i][j].toCharArray(),0,4);              
                System.out.println(str);
            }
        }        
    }
}