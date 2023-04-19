package cop;

import java.util.*;

public class Cop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[] {6,5,8,9,2,1};
		//int []arr1=new int [arr.length];
		Arrays.sort(arr);
		for(int a:arr)
		{
		System.out.println(a);	
		}
		System.out.println("==========================");
		for(int i=0;i<arr.length;i++)
		{
		for (int j = i+1; j < arr.length; j++)
		{
			if(arr[i]>arr[j])
			{
			int temp;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			
		}
				
		}
		for(int a:arr)
		{
		System.out.println(a);	
	}

}
}
