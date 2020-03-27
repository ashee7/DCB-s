import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class SumOfTwoArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int k1=complicated(scn.nextInt());
		int k2=complicated(scn.nextInt());
		int m=k1+k2;
		//int n=(Integer.toString(m).length());
		int o=10,k=0,r=0;
		while(m>0){
			r=m%10;
			m/=10;
			k=k*o+r;
			//o*=10;
		}
		while(k>0){
			System.out.print(k%10+", ");
			k/=10;
		}
		System.out.println("END");
		scn.close();
	}
	static int complicated(int m){//takes m spaced input in array and returns after conversion to a complete integer
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		String[] input2 = new String[m]; 
		//int[] b=new int[m];
		int k=0,o=(int) Math.pow(10,m-1);
		try {
			input2 = in.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		for(int i=0;i<m;i++){
			k=k+Integer.parseInt(input2[i])*o;
			o/=10;
		}
		
		return k;
	}
}
