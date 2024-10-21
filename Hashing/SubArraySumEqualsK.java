//$Id$
package com.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class SubArraySumEqualsK {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the size of array:");
	int size=sc.nextInt();
	Integer[] input=new Integer[size];
    for(int i=0;i<size;i++)
    {
    	input[i]=sc.nextInt();
    }
    System.out.print("Enter the K value:");
    Integer k=sc.nextInt();
    sc.close();
    System.out.println(solve(input,k));
}
public static ArrayList<ArrayList<Integer>> solve(Integer[] input,Integer k)
{
	ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
	for(int i=0;i<input.length;i++)
	{
		int sum=0;
		ArrayList<Integer> subArray=new ArrayList<Integer>();
		for(int j=i;j<input.length;j++)
		{
			subArray.add(input[j]);
			sum+=input[j];
			if(sum==k)
			{
				result.add(new ArrayList<Integer>(subArray));
			}
			
		}
	}
	return result;
}

}

