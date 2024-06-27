package Air;

import java.util.Arrays;

public class AirConditioner {
	public static void main(String[] a) {
		int arr[] = new int[]{3,1,2,4,0,6,5};
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]> arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		for(int i=0;i<arr.length-1;i++) {
//			int min = i;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[j]<arr[min]) {
//					min = j; 
//				}
//			}
//			int temp = arr[min];
//			arr[min] = arr[i];
//			arr[i]=temp;
//		}
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
