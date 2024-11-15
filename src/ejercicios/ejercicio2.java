package ejercicios;

import java.util.Scanner;

/*
 * SE INGRESA TRES VALORES, SI TODOS SON IGUALES SE IMPRIME LA SUMA
 * DEL PRIMER CON EL SEGUNDO Y A ESTE RESULTADO SE LE MULTIPLICA POR
 * EL TERCERO
 */
public class ejercicio2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float suma,multiplicar;
		int num1,num2,num3;
		System.out.println("ingrese valor:");
		num1=sc.nextInt();
		System.out.println("ingrese valor:");
		num2=sc.nextInt();
		System.out.println("ingrese valor:");
		num3=sc.nextInt();
		if(num1==num2 && num2==num3 && num3==num1) {
			suma=num1+num2;
			multiplicar=suma*num3;
			System.out.println("El resultado es: "+multiplicar);
		}
		/*int[] num=new int[3];
		int cont=0;
		for(int i=0;i<num.length;i++) {
			System.out.println("ingrese valor:");
			num[i]=sc.nextInt();
			if((i+1)==num.length) {
				for(int e=0;e<num.length-1;e++) {
					if(num[e]==num[+1]) {
						cont++;
					}
				}
				if(cont==2){
					suma=num[0]+num[1];
					multiplicar=suma*num[2];
					System.out.println("El resultado es: "+multiplicar);
				}
				
			}
		}*/
	}

}
