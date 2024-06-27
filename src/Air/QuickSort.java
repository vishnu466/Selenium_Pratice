package Air;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

public class QuickSort
{
	public static void main(String[] args) {
		int arr[] = new int[]{3,1,2,4,0,6,5};
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = new Random().nextInt(10);
//		}
		int l = 0 , h = arr.length-1;
		System.out.println("Before:");
		System.out.println(Arrays.toString(arr));
		mergeSort(arr);
		System.out.println("After:");
		System.out.println(Arrays.toString(arr));
		System.out.println(LocalTime.now());	
		
	}
	public static void mergeSort(int arr[]) {
		int len = arr.length;
		if(len<2) {
			return;
		}
		int mid = len/2;
		
		int leftArray[] = new int[mid];
		int rightArray[] = new int[len-mid];
		
		for(int i=0;i<mid;i++) {
			leftArray[i] = arr[i];
		}
		for(int i=mid;i<len;i++) {
			rightArray[i-mid] = arr[i];
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		merge(arr,leftArray,rightArray);
		
	}
	public static void merge(int[] arr, int[] leftArray, int[] rightArray) {
		int l_len = leftArray.length;
		int r_len = rightArray.length;
		
		int i=0,j=0,k=0;
		while(i < l_len && j < r_len) {
			if(leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			}
			else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while(i<l_len) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<r_len) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
		
		
	}
//	public static void quickSort(int arr[],int l,int h) {
//		if(l>=h) {
//			return;
//		}
//		int pivot = arr[h];
//		int low = l , high = h;
//		while(low<high) {
//			while(arr[low]<=pivot && low<high) {
//				low++;
//			}
//			while(arr[high]>=pivot && low<high) {
//				high--;
//			}
//			swap(arr,low,high);
//		}
//		swap(arr,low,h);
//		quickSort(arr,l,low-1);
//		quickSort(arr,low+1,h);
//		
//	}
//	public static void swap(int arr[],int index1 ,int index2) {
//		int temp = arr[index1];
//		arr[index1] = arr[index2];
//		arr[index2] = temp;
//	}
	
}
