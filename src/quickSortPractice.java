
public class quickSortPractice {
	
	public static void quicksort(int[] a,int low, int high)
	{
		if(low<high)
		{
			int partition=partition(a,low,high);
			quicksort(a, low, partition);
			quicksort(a,partition+1,high);
			
		}
	}
	
	public static int partition(int []a,int low,int high)
	{
		int pivot=a[low];
		int i= low;
		int j=high+1;
		while(i<j)
		{
		do
		{
			i++;
		}while(a[i]<=pivot && i<(a.length-1) );
		do
		{
			j--;
		}while(a[j]>pivot);
		if(i<j)
		{
		int m=a[j];
		a[j]=a[i];
		a[i]=m;
		}
	}
	int p=a[low];
	a[low]=a[j];
	a[j]=p;
	return j;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {8,6,56,43,42,12,95,3};
		int b=a.length;
		quicksort(a,0,b-1);
		System.out.print("After sorting the nos are ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
