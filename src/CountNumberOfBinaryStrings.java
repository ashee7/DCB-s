import java.util.Scanner;


public class CountNumberOfBinaryStrings {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			if(a[i]==0){
				System.out.println(0);
				break;
			}
			else{
				int k=0;
				for(int j=0;j<Math.pow(2, a[i]);j++){
					int b=checkNo(Integer.parseInt(Integer.toBinaryString(j)));
					if(b==1)
						k++;
					else 
						continue;
				}
				System.out.println(Integer.toString(k));
			}
		}
		s.close();
		//System.out.println(Integer.parseInt(Integer.toBinaryString(9)));
	}
	
	private static int checkNo(int m) {//checks if the number in binary code has any adjacent 1's or not
		while(m>0){
			int a=m%10;
			m/=10;
			int b=m%10;
			if(a==1 && b==1){
				return 0;
			}
			else 
				continue;
		}		
		return 1;		
	}
}
