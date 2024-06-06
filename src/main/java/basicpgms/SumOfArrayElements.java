package basicpgms;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int a[] = {5,11,2,8,2,13};
		int sum=0;
		for(int element :a){
			sum= sum+element;
		}
		/*for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}*/
		System.out.println("Sum is "+sum);

	}

}
