package ejercicios;

/*
 * REALIZAR UN PROGRAMA QUE IMPRIME 25 TERMINOS DE LA
 * SERIE 11-2-24,(no ingresan valores por teclado)
 */
public class ejercicio1 {

	public static void main(String[] args) {
		int num1,num2;
		num1=-2+11;
		num2=-2+24;
	     for (int i = 1; i <= 25; i++) {
	            System.out.print(num1 + " ");
	            
	            if (i % 2 != 0) { 
	                num1 -= num2;
	            } else {
	                num1 += num2 * 2;
	            }
	        }
         System.out.print(num1 + " ");

	}

}
