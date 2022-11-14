package assignment1;

public class Task1_Swap_two_no {

	public static void main(String[] args) {
	

		int a = 10, b = 20, temp;

		System.out.println("Before Swapping Two Number:" + a + "   " + b);
		System.out.println("A ==" + a);
		System.out.println("B ==" + b);

		temp = a;

		a = b; 

		b = temp; 

		System.out.println("After Swapping Two Number:" + a + "   " + b);
		System.out.println("A ==" + a);
		System.out.println("B ==" + b);
	}

}
