package strings;

public class SplitStringPreservingInvertedCommas {

	public static void main(String[] args) {
		String input = "arpitha is \"working\" in \"TCS\" ";
		String templ_replace=input.replaceAll("\"", "#");
		String[] tem_arr=templ_replace.split(" ");
		for(String items:tem_arr) {
			String n =items.replaceAll("#", "\"");
			System.out.println(n);
		}
	}

}
