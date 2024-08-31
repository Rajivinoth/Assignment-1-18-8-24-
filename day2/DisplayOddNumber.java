package week1.day2;

public class DisplayOddNumber {
	
	public static void main(String[] args) {
		//write a logic to print the odd number from 1
		for (int i = 0; i <=10; i++) {
			if (i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
