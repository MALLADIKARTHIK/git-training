package Testing;

public class Calculator {
	
	public static int fact(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		return fact;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=fact(5);
		System.out.println(fact);
	}

}
