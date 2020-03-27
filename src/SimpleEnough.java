import java.util.Scanner;


public class SimpleEnough {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		String[] a=new String[39];
		long m=n;
		if(n<=(long)Math.pow(10,12)){//condition to check value of n(0<=n<=10^12)
			for(int i=0;i<39;i++){
				if(m>1){
					m= (long) Math.floor(m/2);
					a[i] = Long.toString(m);
				}
				else
					break;
			}//for loop closed
			for(int i=0;i<39;i++){
				if(a[i]!=null)
					System.out.println(a[i]);
				else 
					break;
			}
		}//if closed
		s.close();
	}//main method closed
	static public int value(String a){
		
		return 0;
	}

}//class closed
