package principal;

import java.time.LocalDate;
import java.util.Arrays;

import auxiliar.Practicas;
import modelo.Datos;
import modelo.Equipo;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;

public class Principal {
	// metodo por el que debe empezar la ejecución ..
	public static void main(String[] args) {
		/*
		 * Persona persona; persona = new Persona();
		 * 
		 * persona.setNombre("Manolo"); System.out.println("nif : " + persona.getNif());
		 * System.out.println("nombre : " + persona.getNombre());
		 * System.out.println("altura : " + persona.getAltura());
		 * System.out.println("persona1 creada");
		 */
		/*
		 * Persona padre = new Persona(); padre.setNombre("JorgePadre");
		 * padre.setSexo('M'); Persona madre = new Persona();
		 * madre.setNombre("MariaMadre"); madre.setNif("44567981H"); madre.setSexo('F');
		 */

		/*
		 * Persona persona2 = new Persona("43897124R", "PEPE", 'F', LocalDate.of(1999,
		 * 9, 21), 170, padre, madre); System.out.println("persona2 creada");
		 * System.out.println("Nombre madre : " + persona2.getMadre().getNombre());
		 */
		// crear un Estudiante

		
		 Estudiante estAnonimo = new Estudiante(123);
		 System.out.println(estAnonimo.toString()); 
		 Estudiante estudiante = new
		 Estudiante(111, "44556677G","BBB", 'M', LocalDate.now(), 187, estAnonimo,null);
		 Estudiante estudiante1 = new Estudiante(111, "44556677G","ZZZ", 'M', LocalDate.now(), 187, estAnonimo,null);
		 Estudiante estudiante2 = new Estudiante(111, "44556677G","DDD", 'M', LocalDate.now(), 187, estAnonimo,null);
		 Estudiante estudiante3 = new Estudiante(111, "44556677G","CCC", 'M', LocalDate.now(), 187, estAnonimo,null);
		 
		 Estudiante [] listaEstudiantes = {estAnonimo,estudiante1,estudiante2,estudiante3};
		 
		 
		 //System.out.println(estudiante.toString());
		  
		 Profesor profe1 = new Profesor(); System.out.println(profe1);
		 
		Practicas practicas = new Practicas();
		// new Practicas().muestraNumerosDe1A1000();
		// practicas.muestraNumerosDe1A1000();
		// practicas.muestraNumeros3(20, 25);
		// practicas.generaAleatorios2(3,10,11);
		// practicas.estadisticaCadena("Las&%=\" PalmAs\\ de Gran CanarIa");
		// int [] numeros=practicas.generaAleatorios3(100, 1, 6);
		// int[] frecuencia = practicas.frecuenciaAparicion(100, 1, 8);
		// practicas.listaDiasSemana();
		// Estudiante[] lista = new Datos().getEstudiantes();
		// practicas.listaEstudiantes(new Datos().getEstudiantes());
		int[][] visitantesYear = { { 2, 4, 5, 1, 3, 2, 1, 1, 1, 3, 5, 1 },
				{ 23, 1, 56, 12, 32, 23, 17, 12, 11, 34, 45, 13 }, { 23, 3, 56, 12, 32, 23, 17, 12, 11, 34, 45, 12 },
				{ 23, 1, 56, 12, 32, 23, 17, 12, 11, 34, 45, 13 }, { 23, 4, 56, 12, 32, 23, 17, 12, 11, 34, 45, 10 },
				{ 23, 3, 56, 12, 32, 23, 17, 12, 11, 34, 45, 45 }, { 23, 1, 56, 12, 32, 23, 17, 12, 11, 34, 45, 37 }

		};
		String[] islas = { "GC", "LTE", "FTV", "TFE", "LPA", "GOM", "HIE" };
		String[] meses = { "ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC" };

		/*
		 * int isla=2; int mes =7; System.out.println("Visitantes en "+ islas[isla]
		 * +" : " + practicas.visitantesIslaYear(isla, visitantesYear));
		 * System.out.println("Visitantes  en Canarias en el mes " + meses[mes]+ " : " +
		 * practicas.visitantesMesYear(mes, visitantesYear));
		 */

	/*	String[] misDatos = { "123","abc", "345", "1x2", "990" };
		//int[] res = practicas.convierteCadenasANumeros(misDatos);
		float saldo= 1000.0f;
		float[] movimientos= {10.0f, -5.0f,20.5f};
		
		float saldoFinal = practicas.calculaSaldo(saldo, movimientos);
		*/
		int[] datos = practicas.generaAleatorios3(500, 1, 500);
		//practicas.ordenaEnteros(datos);
		//Arrays.sort(datos);
		/*
		String[] cadenas =  {"perro","gato","alce"};
		practicas.ordenaCadenas(cadenas);
		

		System.out.println("Ordena estudiantes:");
		practicas.ordenaEstudiantes(listaEstudiantes);
		for (int i = 0; i < listaEstudiantes.length; i++) {
			System.out.println(listaEstudiantes[i].getNombre());	
		}
		*/
		int [] lista1 = {1,3,5,7,9,11};
		int [] lista2 = {2,4,6,8,10};
		
		int [] resultado = practicas.mezclaListasOrdenadas(lista1, lista2);
		int [] resultado2 = practicas.mezclaListasOrdenadasProfesor(lista1, lista2);
		for (int i = 0; i < resultado.length; i++) {
			System.out.print(" - " + resultado[i] + " - ");
		}
		System.out.println("");
		for (int i = 0; i < resultado2.length; i++) {
			System.out.print(" - " + resultado2[i] + " - ");
		}
		
		//le doy un nif y me tiene que decir si es valido o no
		
		System.out.println("a".charAt(0));
		
		Datos miDato = new Datos();
		int [] resultados = practicas.obtenerClasificacion(miDato.getResultados());
		System.out.println(resultados);
		int [] resultados2 = practicas.obtenerClasificacion2(miDato.getResultados());
		System.out.println(resultados2);
		
		Equipo [] clasificacion = practicas.obtenerClasificacion3(miDato.getPuntosJornada());
		System.out.println(clasificacion);
		
		System.out.println(String.valueOf(123));
		System.out.println(practicas.esPrimo(9));
		//int [] listaPrimos = practicas.listaNumPrimos(10);
		int [] listaFibonacci = practicas.numerosFibonacci(1);
		System.out.println(listaFibonacci);
		
		int [][] matriz = {{1,4,7,9},{2,5,8},{3,6}}; 
		practicas.recorrerMatrizIrregularPorColumnas(matriz);
		
		System.out.println();
		Integer [][] matriz2 = {{1,4,null,7,9},{2,null,5,8},{3,null,6}}; 
		practicas.recorrerMatrizIrregularPorColumnas2(matriz2);

		
		System.out.println("fin");
	}

}
