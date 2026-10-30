/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author Camilo Alarcon
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



/**
 *
 * @author SALASC
 */


    /**
     * @param args the command line arguments
     */
    
    

public class CompraComputadora {
    public static void main(String[] args) {

        // Ingreso de datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Declaración de variables
        String nombre;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double costoBase;
        double costoAdicional;
        double costoFinal;

        // Ingresar datos
        System.out.println("Ingrese su nombre y apellido:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el valor del CPU:");
        cpu = entrada.nextDouble();

        System.out.println("Ingrese el valor del teclado:");
        teclado = entrada.nextDouble();

        System.out.println("Ingrese el valor del ratón:");
        raton = entrada.nextDouble();

        System.out.println("Ingrese el valor de la pantalla:");
        pantalla = entrada.nextDouble();

        // Calcular costo base
        costoBase = cpu + teclado + raton + pantalla;

        // Calcular costo adicional del 15%
        costoAdicional = costoBase * 0.15;

        // Calcular costo final
        costoFinal = costoBase + costoAdicional;

        // Mostrar resultados
        System.out.printf(
            "================================\n"
            + "          REPORTE DE COMPRA\n"
            + "================================\n"
            + "Nombre del cliente: %s\n"
            + "--------------------------------\n"
            + "Valores iniciales:\n"
            + "CPU: $%.2f\n"
            + "Teclado: $%.2f\n"
            + "Ratón: $%.2f\n"
            + "Pantalla: $%.2f\n"
            + "--------------------------------\n"
            + "Costo base: $%.2f\n"
            + "Costo adicional del 15%%: $%.2f\n"
            + "================================\n"
            + "COSTO FINAL: $%.2f\n"
            + "================================\n",
            nombre,
            cpu,
            teclado,
            raton,
            pantalla,
            costoBase,
            costoAdicional,
            costoFinal
        );

     
    
    

