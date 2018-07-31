package BasicsOfImplementation;

import java.util.Arrays;


public class ArrayIntersection {
	
	static void insertionSort(int [] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>=1;j--) {			//this loop starting from j=i
				if(arr[j-1]>arr[j]) {	//if previous element is greater than swap
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
 	}
	
	public static void main(String[] args) {
		
		int [] arr1= {1,2,3,5,6,3,4,2,2,3,8};
		int [] arr2= {1,2,3 ,3,5,6,4};
		
		
		intersection(arr1, arr2);
		
	}
	
	public static void intersection(int[] arr1, int[] arr2){
		insertionSort(arr1);//sorting array 1 
		insertionSort(arr2);//sorting array 2	
		// 1  2 2 2  4 4  5 6 7
		// 2  2 3 4 5  6 7 8
		int p1=0;//pointer to array 1
		int p2=0;	//pointer to array 2
		while(p1<arr1.length && p2<arr2.length) {
			if(arr1[p1]>arr2[p2]) {
				p2++;
			}
			else if(arr1[p1]<arr2[p2]) {
				p1++;
			}
			else {
				System.out.println(arr1[p1]);
				p1++;p2++;
				
			}
		}

	}




}









