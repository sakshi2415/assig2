package assignment1;

public class Task2 {
	
	static int sumOfArray(int arr[]) {
		
		int sum =0;
		
		for(int i =0; i<arr.length; i++) {
			
			sum = sum +arr[i];
			
			return sum;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10, 90, 78, 111, 8989, 7876};
		
		System.out.println("The sum of element: " + sumOfArray(arr));
	}

}
