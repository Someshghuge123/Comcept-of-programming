package cop;

public class merge {

	public static void main(String[] args) {
		int[] arr1=new int[] {1,2,3};
		int[] arr2=new int[] {4,5,6,7};
		int a=arr1.length;
		int b=arr2.length;
		int c=a+b;
		int []arr3=new int [c];
		for (int i = 0; i < a; i++) {
			arr3[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[i+3]=arr2[i];
		}
		for(int a1:arr3) {
			System.out.println(a1);
		}
	}

}
