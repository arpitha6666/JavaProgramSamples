package basicpgms;

public class MaxAndMinElementsInArray {
	public static void main(String[] args) {
		int a[]= {50,30,42,5,89};
		int max=a[0];
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Maximum is "+ max);
		System.out.println("Minimum is "+ min);
	}
}
