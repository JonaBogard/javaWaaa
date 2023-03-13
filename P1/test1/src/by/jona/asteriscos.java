package by.jona;
import java.util.Scanner;
public class asteriscos {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n=in.nextInt();
			System.out.println("Num:"+n);
			System.out.println("Linea");
			
			for(int i =0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
			
		}
	}