
public class quickSort {

	public static void QuickSort(int low, int high, int[] a) {
				if (low < high) {
			int partition = partition(low,high,a);
			QuickSort(low, partition, a);
			QuickSort(partition + 1, high, a);
		}

	}

	public static int partition(int low, int high, int[] a) {
		int pivot = a[low];
		int i = low;
		int j = high+1;

		while (i <j) {
			do {
				
				i++;
			} while (a[i] <= pivot && i < a.length-1);

			do {
				j--;
			} while (a[j] > pivot );

			if (i < j) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}

		}
		
		int m= a[low];
		a[low]=a[j];
		a[j]=m;
		
		return j;
	}

	public static void main(String[] args)

	{
		int[] a = { 5, 7, 23, 65, 21, 77, 34, 88, 41 };
		int b = a.length-1;
		//System.out.println(B);
		QuickSort(0, b, a);
		System.out.println("After Quick Sort");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}

	}
}
