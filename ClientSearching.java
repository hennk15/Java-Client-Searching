package lab2020;

public class ClientSearching {
		  
		   //Define the function to iteratively search an element in an array.
		   static int seq_search(int[] arr, int element)
		   {
		       int index;
		      
		       //For loop iterates all elements in the array.
		       for(index=0;index<=arr.length;index++)
		       {
		           //Check for the required element.
		           if(arr[index]==element)
		               return index+1;
		       }
		      
		       return -1;      
		   }  
		  
		   //Define the function to search an element in an array using iterative binary search.
		   static int binary_search(int[] sorted_arr, int element)
		   {
		       int min = 0;
		       int max = sorted_arr.length-1;
		  
		       while(min<=max)
		       {
		           int mid_ele = (min+max)/2;
		          
		           //Check if the middle element is equal to the element.
		           if(sorted_arr[mid_ele] == element)
		               return mid_ele+1;
		          
		           //Check if the middle element is smaller than the element.
		           if(sorted_arr[mid_ele] < element)
		               min=mid_ele+1;
		          
		           //If the middle element is greater than the element.
		           else
		               max=mid_ele-1;       
		       }  
		      
		       return -1;      
		   }
		  
		   //Define the function to search an element in an array using recursive binary search.
		   static int recursive_binary(int[] sorted_arr, int element, int min, int max)
		   {  
		       if(min<=max)
		       {
		           int mid_ele = (min+max)/2;
		          
		           if(sorted_arr[mid_ele] == element)
		               return mid_ele+1;
		          
		           if(sorted_arr[mid_ele] > element)
		               return recursive_binary(sorted_arr, element, min,mid_ele-1 );
		                      
		          
		           else
		               return recursive_binary(sorted_arr, element, mid_ele+1,max );
		       }  
		      
		       return -1;      
		   }
		  
		   //Driver function.
		   public static void main(String args[])
		   {
		       int[] array = {20, 10, 60, 40, 50, 80};
		      
		       System.out.println("The number 40 is at position: " + seq_search(array,40) + "\n");
		       System.out.println("The number 60 is at position: " + binary_search(array,60) + "\n");
		       System.out.println("The number 45 is at position: " + recursive_binary(array,45,0,6) + "\n");
		      
		       return;
		   }
		}