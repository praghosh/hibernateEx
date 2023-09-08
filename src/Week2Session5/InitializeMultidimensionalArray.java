package Week2Session5;

import java.util.Arrays;

public class InitializeMultidimensionalArray {
	public static void main(String[] args) {
		int[][] multidimensionalArray = { {1,2},{2,3}, {3,4} };



		for(int i = 0 ; i < multidimensionalArray.length ; i++){
			//row
			for(int j = 0 ; j < multidimensionalArray[0].length; j++){
				System.out.print(multidimensionalArray[i][j] + " ");
			}
			System.out.println();
		}

		// test is a 3d array
		int[][][] test = {
				{
					{1, -2, 3}, 
					{2, 3, 4}
				}, 
				{ 
					{-4, -5, 6, 9}, 
					{1}, 
					{2, 3}
				} 
		};

		int threeDArray [] [][] = {
				{ 
					{1,2},
					{2,3}, 
					{3,4} 
				}, 
				{ 
					{1,2},
					{2,3}, 
					{3,4} 
				}
		};
	}

}
