package org.pc.com;

public class BinarySearchconcepts {

public static int binarySearch(int arr[],int x,int low,int high) {
	
	while(low<=high) {
		int mid=low+(high-low)/2;
		if(x==arr[mid])
			return mid;
		if(x>arr[mid])
		  low=mid+1;
		else
		high=mid-1;
		
	}
	return -1;
	
}	
	
	public static void main(String[] args) {

		int arr[] ={3,4,5,6,7,8};
		int x=7;
		int n=arr.length;
		int result=binarySearch(arr,x,0,n-1);
		if(result==-1) {
			System.out.println("element not found");
		}else {
			System.out.println("element found at position:"+result);
		}
	}

}
