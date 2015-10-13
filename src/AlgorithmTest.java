import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
public class AlgorithmTest {
	@Test
	public void TestInsertionSort(){
		int[] array = new int[6];
		array[0] = 6;
		array[1] = 3;
		array[2] = 1;
		array[3] = 7;
		array[4] = 39;
		array[5] = 33;
		
		InsertionSort sort = new InsertionSort();
		int[] array2 = sort.sort(array);
		
		int[] expected = new int[6];
		expected[0]=1;
		expected[1]=3;
		expected[2]=6;
		expected[3]=7;
		expected[4]=33;
		expected[5]=39;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(array[0]);
		arr.add(array[1]);
		arr.add(array[2]);
		
		Assert.assertArrayEquals(array2,expected);
	}
	@Test
	public void TestQuickSort(){
		int[] arr = new int[9];
		arr[0] = 1;
		arr[1] = 0;
		arr[2] = -1;
		arr[3] = 4;
		arr[4] = 8;
		arr[5] = 3;
		arr[6] = 2;
		arr[7] = 2;
		
		int[] sortedArr = QuickSort.quickSort(arr, 0, 7);
		for(int i: sortedArr){
			System.out.println(i);
		}
	}
	@Test
	public void TestLIS(){
		int[] arr = new int[6];
		arr[0] = 5;
		arr[1] = 4;
		arr[2] = 7;
		arr[3] = 6;
		arr[4] = 12;
		arr[5] = 15;
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		int size = lis.getNewArraySize(arr);
		System.out.println(size);
		Assert.assertTrue(size == 4);
	}
	
	@Test
	public void TestCombSort(){
		int[] arr = new int[6];
		arr[0]= 7;
		arr[1] = 4;
		arr[2] = 2;
		arr[3] = 6;
		arr[4] = 1;
		arr[5] = 9;
		
		arr = CombSort.sortArray(arr);
		for(int i: arr){
			System.out.print(i+" ");
		}
		Assert.assertEquals(arr[0], 1);
	}
}

