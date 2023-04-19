package cop;

public class Max_min {

	public static void main(String[] args)
	{
		int max=0;
		int []arr=new int[] {10,20,50,40,60,80,90};
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		for (int j = 0; j < arr.length; j++) {
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		}
		
		System.out.println(max+"======="+min);

	}

}
