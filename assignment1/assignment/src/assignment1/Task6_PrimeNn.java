package assignment1;

public class Task6_PrimeNn {

	public static void main(String[] args) {

		int i=0;
		int num=0;
		
		String primeNumbers = " ";
		
		for(i=1; i<=1000; i++) {
			
			int count=0;
			
			for(num=i; num>=1; num--) {
				
				if(i%num==0) {
					
					count = count + 1;
				}
			}
			
			if (count ==2) {
				
				primeNumbers = primeNumbers + i  + " ";
				
			}
		}
		
		System.out.println("Prime Number from 1 to 1000 are :");
		System.out.println(primeNumbers);
		
	}

}
