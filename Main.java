/******************************************************************************
Given an array of positive integers. Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements
to its right side. Also, the rightmost element is always a leader.

Input : 5
            7 4 5 7 3

Output: 7 7 3
All elements on the right of 7 (at index 0) are smaller than or equal to 7. Also, all 
the elements of right side of 7 (at index 3) are smaller than 7. And, the last element 3 
is itself a leader since no elements are on its right.
*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Hello World");

    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int f = 0, j = 0;
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      {
	a[i] = sc.nextInt ();
      }
    while (j < n)
      {
	f = 0;
	for (int i = j; i < n; i++)
	  {
	    if (a[i] > a[j])
	      f = 1;
	  }
	if (f == 0)
	  System.out.print (a[j] + " ");
	j++;
      }

  }
}
