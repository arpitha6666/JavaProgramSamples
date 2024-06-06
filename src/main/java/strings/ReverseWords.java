package strings;

public class ReverseWords {

	public static void main(String[] args) {
		String sentence = "I live in Bengaluru";
		StringBuffer sb = new StringBuffer();
		String[] temp = sentence.split(" ");
		for(int i = temp.length-1;i>=0;i--) {
			sb.append(String.valueOf(temp[i])+" ");
		}
		System.out.println("Reversed string : "+ sb.toString());
	}
}
