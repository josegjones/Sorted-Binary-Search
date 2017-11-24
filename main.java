class main
{

 public static void main(String args[])
 {
	 
	 int numbers[] = new int[20];
	 
	 for(int i = 0; i < 20; i++)
	 {
		 numbers[i] = i;
		 //System.out.println(numbers[i]);
	 }
	 
	 SortedBinarySearch bSearch = new SortedBinarySearch();
	 
	 int index = bSearch.BSearch(numbers,8);
	 
	 System.out.println(index);
	 
	 
	 
 }


}