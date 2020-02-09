//Main version 1.0 copyrigth 
package seno;

import java.util.Scanner; // SE IMPORTA EL PAQUETE DEL SCANNER


public class Main {

	public static void main(String[] args) {
		Operaciones ope= new Operaciones(); //SE REALIZA UNA INSTANCIA DE LA CLASE OPERACIONES
		Scanner Leer = new Scanner(System.in); //ESTA LINEA ES PARA CREAR UNA VARIABLE QUE NOS AYUDARA A GUARDAR LOS DATOS DIGITADOS POR EL USUARIO
			
	System.out.print("Digite los grados: ");  //SE SOLICITAN LOS GRADOS
		double Grad=Leer.nextDouble(); //SE GUARDAN LOS GRADOS EN LA VARIABLE GRAD
		System.out.print("Digite numero de repetisiones: "); // SE SOLICITAN LAS REPETICIONES
		int N=Leer.nextInt();  // SE GUARDA EL NUMERO DE REPETICIONES EN UNA VARIABLE
		
		System.out.println("El resultado es: "+ope.funcion(N, Grad)); // SE LLAMA EL METODO DONDE SE REALIZAN LAS OPERACIONES Y SE MUESTRA EL RESULTADO
	}

}
