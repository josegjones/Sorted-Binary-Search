class SortedBinarySearch
{
	int BSearch(int[]a, int x)
	{
		int H = 0;
		int T = a.length -1;
		int halfIndex = T/2;
		
		while(H <= T)
		{
			if(x<a[H] || x>a[T])
			{
				return -1;
			}
			else if(a[halfIndex] == x)
			{
				System.out.println("halfIndex: " + halfIndex + " H: " + H + " T: " + T);
				return halfIndex;
			}
			else if(a[H] == x)
			{
				return H;
			}
			else if(a[T] == x)
			{
				return T;
			}
			else if(a[halfIndex] < x)
			{
				System.out.println("-------------- <x --------------------");
				System.out.println("halfIndex: " + halfIndex + " H:" + H + " T:" + T + " Value:" + a[halfIndex]);
				H = halfIndex + 1;
				halfIndex = (H+T)/2;
				System.out.println("halfIndex:" + halfIndex + " H:" + H + " T:" + T + " Value:" + a[halfIndex]);
				System.out.println("---------------------------------------");
			}
			else
			{
				System.out.println("-------------- >x --------------------");
				System.out.println("halfIndex:" + halfIndex + " H:" + H + " T:" + T + " Value:" + a[halfIndex]);
				T = halfIndex - 1;
				halfIndex = (H+T)/2;
				System.out.println("halfIndex:" + halfIndex + " H:" + H + " T:" + T + " Value:" + a[halfIndex]);
				System.out.println("---------------------------------------");
			}
		}
			
		return -2;	
	}
}