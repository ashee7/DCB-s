import java.util.Scanner;


public class FindIt {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int N=scn.nextInt();
		int[] a= new int[N];
		for(int i=0;i<N;i++){
			a[i]=scn.nextInt();
		}
		int Q= scn.nextInt();
		int[] b= new int[Q];
		for(int i=0;i<Q;i++){
			b[i]=scn.nextInt();
		}
		
		for(int i=0;i<Q;i++){
			int k=0;
			for(int j=0;j<N;j++){
				if(a[j]%b[i]==0)
					k++;
				else continue;
			}
			System.out.println(k);
		}
		scn.close();
	}

}
