import java.util.*;
public class Assignment6_7 {
	public static int count(String str) {
		int count=0;
		for(int a=0;a<str.length();a++) {
			char ch=str.charAt(a);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your word");
		String str = sc.next();
		str.toLowerCase();
		
	System.out.println("count of vowels: "+count(str));
	sc.close();
	}

}
