package Sorters;

import java.util.Arrays;

public class SelectionSorter extends Sorter {

	@Override
	public void SortIntArray(int[] Sorted) {
		SortSubArray(Sorted,0,Sorted.length-1);
	}
	@Override
	public void SortSubArray(int[] Sorted, int p, int r) {
		int[] toSort = Arrays.copyOf(Sorted,Sorted.length);
		for (int i = p; i <= r ;i++) {
			int minPos = 0;
			for(int j = 0; j<toSort.length;j++) {
				if(toSort[j] < toSort[minPos]) {
					minPos = j;
				}
			}
			Sorted[i] = toSort[minPos];
			toSort[minPos] = Integer.MAX_VALUE;
		}		
	}
	
	public static void main(String[] Args) {
		int[] a = new int[]{8,23,8,32,90,3,6,1,0,45,2,67,2,42};
		Sorter sorter = new SelectionSorter();
		sorter.SortIntArray(a);
		System.out.println(Arrays.toString(a));
	}
}
