package basicpgms;

public class SwapWithoutTempVariable {

	public static void main(String[] args) {
		int a =3,b=5;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a : "+ a + " b : "+b);
		

	}

}
