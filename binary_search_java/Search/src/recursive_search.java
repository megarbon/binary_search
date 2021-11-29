
public class recursive_search {
		   int rec_bin_search(int my_arr[], int left, int right, int x){
		      if (right >= left){
		         int mid = left + (right - left) / 2;
		         if (my_arr[mid] == x)
		         return mid;
		         if (my_arr[mid] > x)
		         return rec_bin_search(my_arr, left, mid - 1, x);
		         return rec_bin_search(my_arr, mid + 1, right, x);
		      }
		      return -1;
		   }
		   public static void main(String args[]){
			   recursive_search my_object = new recursive_search();
		      int my_arr[] = { 10, 25, 114, 9, 78, 66, 12, 101, 99, 33};
		      int len = my_arr.length;
		      int x = 101;
		      int result = my_object.rec_bin_search(my_arr, 0, len - 1, x);
		      if (result == -1)
		         System.out.println("The element is not present in the array");
		      else
		         System.out.println("The element has been found at index " + result);
		   }
}
