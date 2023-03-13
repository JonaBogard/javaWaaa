package by.jona;

import java.util.Scanner;

public class rectangulo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int opcion=1;
		do {
			System.out.println("###Menu###\n");
			System.out.println("1. Dibujar Línea");
			System.out.println("2. Dibujar Cuadro");
			System.out.println("3. Dibujar Rectangulo");
			System.out.println("4. Dibujar Triangulo");
			System.out.println("5. Dibujar Triangulo V2");
			System.out.println("\n0. SALIR");
			System.out.println("\nELIGE UNA OPCION??");
			opcion=in.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("\n---Dibujar Linea--");
				System.out.println("Tamaño:  ");
				int n = in.nextInt();
				for (int i = 0; i < n; i++){
					System.out.print("* ");
				}
				System.out.print("\n\n");
				break;
			case 2:
				System.out.println("\n---Dibujar Linea--");
				System.out.println("Tamaño:  ");
				int c=in.nextInt();
				System.out.println("Num:"+c);
				System.out.println("Linea");
				
				for(int i =0;i<c;i++) {
					for(int j=0;j<c;j++) {
						System.out.print("*");
					}
					System.out.println(" ");
				}
				break;
			case 3:
				System.out.println("\n---Dibujar Rectangulo--");
				System.out.println("Tamaño de alto:  ");
				int r=in.nextInt();
				System.out.println("Num:"+r);
				System.out.println("Tamaño de ancho:  ");
				int a=in.nextInt();
				System.out.println("Num:"+a);
				System.out.println("Cuadro");
				
				for(int i =0;i<r;i++) {
					for(int j=0;j<a;j++) {
						System.out.print("*");
					}
					System.out.println(" ");
				}
				break;
			case 4:
				System.out.println("\n---Dibujar triangulo--");
				System.out.println("Tamaño de alto:  ");
				int h=in.nextInt();
				System.out.println("Num:"+h);
				System.out.println("Triangulo");
				
				for(int i =0;i<h;i++) {
					for(int j=0;j<i;j++) {
						System.out.print("*");
					}
					System.out.println(" ");
				}
				break;
			case 5:
				System.out.println("\n---Dibujar triangulo--");
				System.out.println("Tamaño de alto:  ");
				int K=in.nextInt();
				System.out.println("Num:"+K);
				System.out.println("Triangulo");
				
				for(int i =0;i<K;i++) {
					for(int j=0;j<K-1;j++) {
						System.out.print(" ");
					}
					for(int j = 0; j <=i ; j++) {
					System.out.print("* ");
					}
					System.out.println(" ");
				}
				System.out.print("\n\n");
				break;
			case 0:
				System.out.println("\n---GoodBye--");
				break;
			default: 

                System.out.println("Opcion invalida");
			}
		}while(opcion!=0);
		
	}

}
