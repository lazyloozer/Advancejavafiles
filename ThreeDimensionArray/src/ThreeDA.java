import java.util.Scanner;
public class ThreeDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of schools");
		int m=sc.nextInt();
		System.out.println("Enter the total number of class");
		int n=sc.nextInt();
		
		System.out.println("Enter the total number of students");
		int o=sc.nextInt();
		int[][][]a=new int[m][n][o];
		
		 System.out.println("Enter the " +m*n*o+ "marks =" );
		 for(int i=0;i<=a.length-1;i++) {
			 for(int j=0;j<=a[i].length-1;j++) {
				 for(int k=0;k<=a[i][j].length-1;k++) {
					 a[i][j][k]=sc.nextInt();
					 
				 }
			 }
		 }
		
		 for(int i=0;i<=a.length-1;i++) {
			 for(int j=0;j<=a[i].length-1;j++) {
				 for(int k=0;k<=a[i][j].length-1;k++) {
					System.out.println( a[i][j][k]);
					 
				 }
			 }
		 }
		


	}

}
