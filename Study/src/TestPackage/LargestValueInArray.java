package TestPackage;

public class LargestValueInArray {
	
	public int getLargest(int[] a, int arrlength){  
		int temp;  
		for (int i = 0; i < arrlength; i++)   
		        {  
		            for (int j = i + 1; j < arrlength; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[arrlength-1];  
		}  

	public static void main(String[] args) {
		
		int[] arr1 = {1,0,90,3,100,45};
		
		LargestValueInArray l = new LargestValueInArray();
		
		int largeNo = l.getLargest(arr1, arr1.length);
		
		System.out.println(":Largest Number is : "+ largeNo);
		

	}

}
