/*
* Analisis
* Descripcion del programa: El objetivo es generar una factura calculando los costos de paquetes de viaje
* Entradas: noches de hospedaje, transporte, nombre, documento de identidad, edad, ciudad de donde cotiza el viaje (Con bono: tipo de transporte que usará, cedula)
* Salidas: Factura final
* Ejemplo: (sin bono) María tiene 19 años, su numero de documento es 1107848324 y se comunica desde Cali, desea hospedarse 2 noches, por lo que el 
costo final de su factura es de 880000
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes 
    final double COSTO_POR_NOCHE = 150000; 
    final double COSTO_TRAYECTO_AVION = 250000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario 
    
        int edad, documentoI, noches;
        String nombre, ciudad;

        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario 
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();
        System.out.println("Que edad tienes?");
        edad = escaner.nextInt();

        // ...
        System.out.println("Bienvenido " + nombre + "!");
        // ...

        System.out.println("Por favor, describe tu número de documento");
        documentoI = escaner.nextInt();

        System.out.println("Desde donde te comunicas con nosotros?");
        ciudad = escaner.nextLine();

        System.out.println("Bienvenido a eventos ATLAS, cuantas noches deseas hospedarte? (Minimo 1 maximo 4)");
        noches = escaner.nextInt();



        // Declaracion de salidas calculadas 
        double totalTransporte,totalPorNoche;
       

        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calcularTotalTransporte();
        // aqui podrian faltar parametros
	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
        return 0;  
    }

    public double calcularTotalPorNoche(Int noches) {
        return noches * 150000; 
    }

	

	
}