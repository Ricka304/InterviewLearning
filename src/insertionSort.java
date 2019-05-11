
public class insertionSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insertionSort m=new insertionSort();
		
		int[] a = { 5, 7, 23, 65, 21, 77, 34, 88, 41 ,34};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<i;j++)
		{
			if(a[j]>a[i])
			{
				int m=a[i];
				a[i]=a[j];
				a[j]=m;
			}
		}
	}
		System.out.println("The numbers are");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}

	}

}
