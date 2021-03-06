package Test;
import org.junit.Assert;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sorters.InsertSorter;
import Sorters.MedianQuickSorter;
import Sorters.MergeSorter;
import Sorters.QuickCutOffSorter;
import Sorters.QuickSorter;
import Sorters.SelectionSorter;
import Sorters.Sorter;
import Sorters.ThreeWayQuickSort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorter_Test {
	Sorter insertSorter;
	Sorter selectionSorter;
	Sorter mergeSorter;
	Sorter quickSorter;
	Sorter quickCutOffSorter;
	Sorter medianQuickSorter;
	Sorter threeWayQuickSorter;
	int[] file1,file2,file3,file4,file5,file6;
	
	private int[] LoadFile(String filePath) {		
		String currentLine = null;
		BufferedReader br = null;
		ArrayList<Integer> ints = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(filePath));
			while ((currentLine=br.readLine()) != null) {
				ints.add(Integer.parseInt(currentLine));
			}
		}
		catch (IOException e) {
			System.out.println("HEYO");
			e.printStackTrace();
		}
		int[] a = new int[ints.size()];
		for(int i = 0; i <ints.size(); i++) {
			a[i] = ints.get(i);
		}
		return a;
	}
	@BeforeEach
	void setUp() throws Exception {
		this.insertSorter = new InsertSorter();
		this.selectionSorter = new SelectionSorter();
		this.mergeSorter = new MergeSorter();
		this.quickSorter = new QuickSorter();
		this.quickCutOffSorter = new QuickCutOffSorter();
		this.medianQuickSorter = new MedianQuickSorter();
		this.threeWayQuickSorter = new ThreeWayQuickSort();
		this.file1 = LoadFile("./src/Test/10.txt");
		this.file2 = LoadFile("./src/Test/50.txt");
		this.file3 = LoadFile("./src/Test/100.txt");
		this.file4 = LoadFile("./src/Test/1000.txt");
		this.file5 = LoadFile("./src/Test/bigInt.txt");
		this.file6 = LoadFile("./src/Test/int500k.txt");
	}
	@AfterEach
	void tearDown() {
		this.insertSorter = null;
		this.selectionSorter = null;
		this.mergeSorter = null;
		this.quickSorter = null;
		this.quickCutOffSorter = null;
		this.medianQuickSorter = null;
		this.threeWayQuickSorter = null;
	}
	@Test
	public void insertSorterHasSortMethod() {
		boolean hasMethod = false;
		Method[] methods = this.insertSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortIntArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("Insert Sorter needs to have SortIntArray function...",hasMethod);
	}
	@Test
	public void selectionSorterHasSortMethod() {
		boolean hasMethod = false;
		Method[] methods = this.selectionSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortIntArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("Selection Sorter needs to have SortIntArray function...",hasMethod);
	}
	@Test
	public void mergeSorterHasSortMethod() {
		boolean hasMethod = false;
		Method[] methods = this.mergeSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortIntArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("Merge Sorter needs to have SortIntArray function...",hasMethod);
	}
	@Test
	public void quickSorterHasSortMethod() {
		boolean hasMethod = false;
		Method[] methods = this.quickSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortIntArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("quick Sorter needs to have SortIntArray function...",hasMethod);
	}
	@Test
	public void quickCutOffSorterHasSortMethod() {
		boolean hasMethod = false;
		Method[] methods = this.quickCutOffSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortIntArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("quick Cut Off Sorter needs to have SortIntArray function...",hasMethod);
	}
	@Test
	public void medianQuickSorterHasSortMethod() {
		boolean hasMethod = false;
		Method[] methods = this.medianQuickSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortIntArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("Median Quick Sorter needs to have SortIntArray function...",hasMethod);
	}
	@Test
	public void threeWayQuickSorterHasSortMethod() {
		boolean hasMethod = false;
		Method[] methods = this.threeWayQuickSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortIntArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("3 way Quick Sorter needs to have SortIntArray function...",hasMethod);
	}
	@Test
	public void medianQuickSorterHasSortSubArrayMethod() {
		boolean hasMethod = false;
		Method[] methods = this.medianQuickSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortSubArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("Median Quick Sorter needs to have SortSubArray function...",hasMethod);
	}
	@Test
	public void selectionSorterHasSortSubArrayMethod() {
		boolean hasMethod = false;
		Method[] methods = this.selectionSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortSubArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("Selection Sorter needs to have SortSubArray function...",hasMethod);
	}
	@Test
	public void insertSorterHasSortSubArrayMethod() {
		boolean hasMethod = false;
		Method[] methods = this.insertSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortSubArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("Insert Sorter needs to have SortSubArray function...",hasMethod);
	}
	@Test
	public void mergeSorterHasSortSubArrayMethod() {
		boolean hasMethod = false;
		Method[] methods = this.mergeSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortSubArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("Merge Sorter needs to have SortSubArray function...",hasMethod);
	}
	@Test
	public void QuickSorterHasSortSubArrayMethod() {
		boolean hasMethod = false;
		Method[] methods = this.quickSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortSubArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("Quick Sorter needs to have SortSubArray function...",hasMethod);
	}
	@Test
	public void QuickCutOffSorterHasSortSubArrayMethod() {
		boolean hasMethod = false;
		Method[] methods = this.quickCutOffSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortSubArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("Quick Cut Off Sorter needs to have SortSubArray function...",hasMethod);
	}
	@Test
	public void threeWayQuickSorterHasSortSubArrayMethod() {
		boolean hasMethod = false;
		Method[] methods = this.threeWayQuickSorter.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().equals("SortSubArray")) {
				hasMethod = true;
				break;
			}
		}
		Assert.assertTrue("3 way quick Sorter needs to have SortSubArray function...",hasMethod);
	}
	
	@Test
	public void insertSorterHasFunctionalTestMethod() {
		Assert.assertNotEquals("",this.insertSorter.Test());
	}
	@Test
	public void selectionSorterHasFunctionalTestMethod() {
		Assert.assertNotEquals("",this.selectionSorter.Test());
	}
	@Test
	public void mergeSorterHasFunctionalTestMethod() {
		Assert.assertNotEquals("",this.mergeSorter.Test());
	}
	@Test
	public void quickSorterHasFunctionalTestMethod() {
		Assert.assertNotEquals("",this.quickSorter.Test());
	}
	@Test
	public void quickCutOffSorterHasFunctionalTestMethod() {
		Assert.assertNotEquals("",this.quickCutOffSorter.Test());
	}
	@Test
	public void medianQuickSorterHasFunctionalTestMethod() {
		Assert.assertNotEquals("",this.medianQuickSorter.Test());
	}
	@Test
	public void threeWayQuickSorterHasFunctionalTestMethod() {
		Assert.assertNotEquals("",this.threeWayQuickSorter.Test());
	}

	@Test
	public void insertSorterSortIntArrayWorksCorrectly() {
		int[] a = new int[]{8,23,8,32,90,3,6,1,0,45,2,67,2,42};
		this.insertSorter.SortIntArray(a);
		Assert.assertArrayEquals(new int[]{0,1,2,2,3,6,8,8,23,32,42,45,67,90},a);	
	}
	@Test
	public void selectionSorterSortIntArrayWorksCorrectly() {
		int[] a = new int[]{8,23,8,32,90,3,6,1,0,45,2,67,2,42};
		this.selectionSorter.SortIntArray(a);
		Assert.assertArrayEquals(new int[]{0,1,2,2,3,6,8,8,23,32,42,45,67,90},a);
	}
	@Test
	public void mergeSorterSortIntArrayWorksCorrectly() {
		int[] a = new int[]{8,23,8,32,90,3,6,1,0,45,2,67,2,42};
		this.mergeSorter.SortIntArray(a);
		Assert.assertArrayEquals(new int[]{0,1,2,2,3,6,8,8,23,32,42,45,67,90},a);
		}
	@Test
	public void quickSorterSortIntArrayWorksCorrectly() {
		int[] a = new int[]{8,23,8,32,90,3,6,1,0,45,2,67,2,42};
		this.quickSorter.SortIntArray(a);
		Assert.assertArrayEquals(new int[]{0,1,2,2,3,6,8,8,23,32,42,45,67,90},a);
	}
	@Test
	public void quickCutOffSorterSortIntArrayWorksCorrectly() {
		int[] a = new int[]{8,23,8,32,90,3,6,1,0,45,2,67,2,42};
		this.quickCutOffSorter.SortIntArray(a);
		Assert.assertArrayEquals(new int[]{0,1,2,2,3,6,8,8,23,32,42,45,67,90},a);
	}
	@Test
	public void medianQuickSorterSortIntArrayWorksCorrectly() {
		int[] a = new int[]{8,23,8,32,90,3,6,1,0,45,2,67,2,42};
		this.medianQuickSorter.SortIntArray(a);
		Assert.assertArrayEquals(new int[]{0,1,2,2,3,6,8,8,23,32,42,45,67,90},a);
	}
	@Test
	public void threeWayQuickSorterSortIntArrayWorksCorrectly() {
		int[] a = new int[]{8,23,8,32,90,3,6,1,0,45,2,67,2,42};
		this.threeWayQuickSorter.SortIntArray(a);
		Assert.assertArrayEquals(new int[]{0,1,2,2,3,6,8,8,23,32,42,45,67,90},a);
	}
	@Test
	public void mergeSorterMergeFunctionWorksCorrectly() {
		MergeSorter mergeSorter = new MergeSorter();
		int[] a = {1,2,4,6,3,6,8,9};
		mergeSorter.Merge(a,0,3,7);
		Assert.assertArrayEquals(a,new int[] {1,2,3,4,6,6,8,9});
	}
	
	@Test
	public void printSelectionSortTimes() {
		getSortTimesForGivenSorter(this.selectionSorter);
	}
	@Test
	public void printInsertSortTimes() {
		getSortTimesForGivenSorter(this.insertSorter);
	}
	@Test
	public void printMergeSortTimes() {
		getSortTimesForGivenSorter(this.mergeSorter);
		getLargeSortTimesForGivenSorter(this.mergeSorter);
	}
	@Test
	public void printQuickSortTimes() {
		getSortTimesForGivenSorter(this.quickSorter);
	}
	@Test
	public void printQuickCutOffSortTimes() {
		getSortTimesForGivenSorter(this.quickCutOffSorter);
		getLargeSortTimesForGivenSorter(this.quickCutOffSorter);
	}
	@Test
	public void printMedianQuickSortTimes() {
		getSortTimesForGivenSorter(this.medianQuickSorter);
		getLargeSortTimesForGivenSorter(this.medianQuickSorter);
	}
	@Test
	public void printThreeWayQuickSortTimes() {
		getSortTimesForGivenSorter(this.threeWayQuickSorter);
		getLargeSortTimesForGivenSorter(this.threeWayQuickSorter);
	}
	private void getSortTimesForGivenSorter(Sorter sorter) {
		System.out.println(sorter.getClass().getSimpleName()+" Sorter Sort Speeds (picoseconds):\n");
		System.out.println("[10]: "+(TimeToSort(file1,sorter)));
		System.out.println("[50]: "+(TimeToSort(file2,sorter)));
		System.out.println("[100]: "+(TimeToSort(file3,sorter)));
		System.out.println("[1000]: "+(TimeToSort(file4,sorter))+"\n");

	}
	private void getLargeSortTimesForGivenSorter(Sorter sorter) {
		System.out.println("[500000]: "+(TimeToSort(file5,sorter)));
		System.out.println("[1000000]: "+(TimeToSort(file6,sorter)) + "\n");
	}
	private long TimeToSort(int[] toSort,Sorter sorter) {
		int[] backup = Arrays.copyOf(toSort,toSort.length);
		long startTime = System.nanoTime();
		sorter.SortIntArray(toSort);
		long endTime = System.nanoTime();
		Arrays.sort(backup);
		if(!Arrays.equals(backup, toSort)) {
			return -1;
		}
		return (endTime-startTime);
	}
	
	@Test
	public void QuickSortWorstCaseScenario() {
		PathologicalInputGenerator a = new PathologicalInputGenerator();
		int arrayLength = 10000;
		int[] horrorArray = a.QuickSortNightmare(arrayLength);
		int[] normalArray = a.NormalArray(arrayLength);
		long WCS = TimeToSort(horrorArray,this.quickSorter);
		long NCS = TimeToSort(normalArray,this.quickSorter);
		System.out.println("Quick Sorter Worst Case Scenario Analysis:\nNormal Sorting Time: "+NCS+"\nWorst Case Scenario Sorting Time: "+WCS+"\nSpeed Factor: "+(WCS/NCS)+"\n");
	}
	
	@Test
	public void MedianQuickSortWorstCaseScenario() {
		PathologicalInputGenerator a = new PathologicalInputGenerator();
		int arrayLength = 10000;
		int[] horrorArray = a.MedianQuickSortNightmare(arrayLength);
		int[] normalArray = a.NormalArray(arrayLength);
		long WCS = TimeToSort(horrorArray,this.medianQuickSorter);
		long NCS = TimeToSort(normalArray,this.medianQuickSorter);
		System.out.println("Median Quick Sorter Worst Case Scenario Analysis:\nNormal Sorting Time: "+NCS+"\nWorst Case Scenario Sorting Time: "+WCS+"\nSpeed Factor: "+(WCS/NCS)+"\n");
	}
	@Test
	public void MedianQuickSortWorstCaseScenarioNoDuplicates() {
		PathologicalInputGenerator a = new PathologicalInputGenerator();
		int arrayLength = 10000;
		int[] horrorArray = a.QuickSortNightmare(arrayLength);
		int[] normalArray = a.NormalArray(arrayLength);
		long WCS = TimeToSort(horrorArray,this.medianQuickSorter);
		long NCS = TimeToSort(normalArray,this.medianQuickSorter);
		System.out.println("Median Quick Sorter Worst Case Scenario Analysis Without Duplicates:\nNormal Sorting Time: "+NCS+"\nWorst Case Scenario Sorting Time: "+WCS+"\nSpeed Factor: "+(WCS/NCS)+"\n");
	}
}
