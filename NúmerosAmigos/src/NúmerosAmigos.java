import java.util.Scanner;


public class N�merosAmigos {

	public static int sumaDivisores (int a) {
		int suma = 0;		//SUMATORIO DE DIVISORES
		for (int i = 1; i==a/2; i++) {		//PARA N VECES
			if (a%i==0) {		//SI N1 ES DIVISIBLE ENTRE I
				suma = suma + i;		//AUMENTAR VALOR DE SUMA
			}
		}
		return suma;		//DEVOLVER SUMA
	}

	public static boolean sonAmigos (int a, int b) {
		return (sumaDivisores(a) == b && sumaDivisores(b) == a);		//CONDICI�N N�MEROS AMIGOS

	}

	public static void main(String[] args) {
		//SUMATORIO DE DIVISORES DE N�MERO X = N�MERO Y
		//SUMATORIO DE DIVISORES DE N�MERO Y = N�MERO X
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		System.out.print("Introduzca un n�mero: ");		//SOLICITA VALOR
		int N1 = teclado.nextInt();		//ALMACENA VALOR
		System.out.print("Introduzca un n�mero: ");		//SOLICITA VALOR
		int N2 = teclado.nextInt();		//ALMACENA VALOR

		if (sonAmigos(N1,N2)) {		//SI M�TODO DEVUELVE TRUE
			System.out.print("Los valores son amigos.");		//OUTPUT
		}	else {		//SI NO
			System.out.print("Los valores no son amigos.");		//OUTPUT
		}
	}
}
