//Operaciones version 1.0 copyrigth 
package seno;



public class Operaciones {

	
	public double funcion(int n, double x) {
		double numerador; // SE CREAN VARIABLES NECESARIAS
		double denominador;
		double factDeno=0.0;
		double multi;
		double resultado;
		double resultadoF = 0;
		
		double xRad=0.0; //VARIABLE DONDE SE ALMACENARAN LOS RADIANES
		xRad=Math.toRadians(x); //SE CONVIERTEN LOS GRADOS A RADIANES
		
		for (int i = 0; i < n; i++) { //SE CREA EL BUCLE PARA QUE FUNCIONE COMO SUMATORIA
			 numerador = Math.pow(-1, i); //SE REALIZA LA OPERACION DEL NUMERADOR Y SE ALMACENA EN LA VARIBALE
			 denominador = 2*i+1; //SE REALIZA LA OPERACION DEL DENOMINADOR Y SE ALMACENA EN LA VARIBALE
			 factDeno=factorial(denominador); // SE REALIZA EL FACTORIAL AL DENOMINADOR
			 multi= Math.pow(xRad,denominador ); // SE REALIZA LA OPERACION DE LA MULTIPLICACION Y SE REUTILIZA LA VARIABLE DENOMINADOR YA QUE TIENE LOS MISMOS VALORES
			
			 resultado= (numerador/factDeno)*multi; //SE REALIZA LO OPERACION COMPLETA DE TODOS LOS FACTORES
			 
			 resultadoF = resultadoF + resultado; //SE REALIZA UNA SUMA DE LOS RESULTADOS PARA FINALIZAR CON LA OPERACION DE LA SUMATORIA
			
		}
		return resultadoF;
	}
	
	public double factorial(double x) {
		
		if (x==0) { // TOMANDO COMO REFERENCIA LA REGLA DEL FACTORIAL, SI EL NUMERO ES 0 SU FACTORIAL SIEMPRE SERA IGUAL A 1 
			return 1; 
		}else { //DE LO CONTRARIO SE HACE LA OPERACION DE LA MULTIPLICACION DEL VALOR POR SU VALOR ANTERIOR
			return x * factorial(x-1);
		}
	
	}
}
