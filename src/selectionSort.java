
public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 7, 23, 65, 21, 77, 34, 88, 41 ,34};
		for(int i=0;i<a.length;i++)
		{
			int min=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<min)
				{
					int m=min;
					min=a[j];
					a[j]=m;
				}
			}
			a[i]=min;
		}
			System.out.println("The numbers are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

		
	}

}
