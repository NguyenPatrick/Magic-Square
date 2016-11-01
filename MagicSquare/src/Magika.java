import java.util.Scanner;

// http://www.javawithus.com/programs/towers-of-hanoi

public class Magika {

	
	public static Boolean CheckMagika(int[] array)
	{
		Boolean squareOrNot = false;
		int[] rowz = new int[9];
		
		rowz[1] = array[1] + array[2] + array[3]; 
		rowz[2] = array[4] + array[5] + array[6]; 
		rowz[3] = array[7] + array[8] + array[9]; 
		rowz[4] = array[1] + array[4] + array[7]; 
		rowz[5] = array[2] + array[5] + array[8]; 
		rowz[6] = array[3] + array[6] + array[9]; 
		rowz[7] = array[1] + array[5] + array[9]; 
		rowz[0] = array[3] + array[5] + array[7]; 
		
		if ((rowz[1] == rowz[2]) && (rowz[2] == rowz[3]) && (rowz[3] == rowz[4]) && (rowz[4] == rowz[5])
				&& (rowz[5] == rowz[6]) && (rowz[6] == rowz[7]) && (rowz[7] == rowz[8]) && (rowz[8] == rowz[0]))
		{
			squareOrNot = true;
		
		}
		return squareOrNot;
	}
	
	public static void Permutation()
	{
		int[] magikaArray = new int [10];
		
		 for (int counter1 = 0; counter1 < magikaArray.length; counter1++)
		 {
			 for (int counter2 = 0; counter2 < magikaArray.length - 1; counter2++)
			 {
				 int temp;
				 temp = magikaArray[counter1];
				 magikaArray[counter1] = magikaArray[counter2];
				 magikaArray[counter2] = temp;
			 }
			 
			 if (CheckMagika(magikaArray) == true);
			 {
				 System.out.println("Square Is Magika!");			 
			 }
		 }
	}
	 public static void main (String[] args)
	 {
		 Permutation();
	 }
}