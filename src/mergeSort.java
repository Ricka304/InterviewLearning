
public class mergeSort {
	
	
	

	public  void mergeSortAlgo(int[] a, int low,int high)
	{
		
		if(low<high)
		{
			int middle= (low+high)/2;
			System.out.println("merge(a "+low+","+ middle+")");
			mergeSortAlgo(a, low, middle);
			System.out.println("merge(a "+(middle+1)+","+ high+")");
			mergeSortAlgo(a, middle+1, high);
			System.out.println("Actlmerge(a "+low+","+(middle)+","+ high+")");
			merge(a,low,middle,high);
		}
	}
	public  void merge(int[] a, int low,int middle,int high)
	{
		int []b =new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		int i=low;
		int j=middle+1;
		int k=low;
		while(i<=middle && j<=high)
		{
			if(b[i]<=b[j])
			{
				a[k]=b[i];
				i++;
			}
			else
			{
				a[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			System.out.println("hii" +i +"middle "+middle);
			a[k]=b[i];
			k++;
			i++;
		}
		System.out.println("The numbers are");
		for(int p=0;p<a.length;p++)
		{
			System.out.print(a[p]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeSort m=new mergeSort();
				
			int[] a = { 5, 7, 23, 65, 21, 77, 34, 88, 41 ,34};
		
		
		m.mergeSortAlgo(a,0,a.length-1);
		System.out.println("The numbers are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		

	}

}
