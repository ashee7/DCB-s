import java.util.Scanner;


public class CheckSumString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		int[] b=new int[a.length()];
		for(int i=0;i<a.length();i++){
			char x=a.charAt(i);
			b[i]=Character.getNumericValue(x);
		}
		
		for(int i=0;i<a.length();i++)
			System.out.println(b[i]);
		s.close();
	}
	

}
