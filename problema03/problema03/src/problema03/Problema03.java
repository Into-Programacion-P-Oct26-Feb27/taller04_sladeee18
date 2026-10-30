/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Camilo Alarcon
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 


public class PlanillaTelefonica {
    public static void main(String[] args) {

        // Ingreso de variables por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Declarar variables
        String titular;
        String direccion;
        double costoMinuto;
        int minutosConsumidos;
        double totalPago;

        // Ingresar datos
        System.out.println("Ingrese el nombre del titular:");
        titular = entrada.nextLine();

        System.out.println("Ingrese su dirección:");
        direccion = entrada.nextLine();

        System.out.println("Ingrese el costo por minuto:");
        costoMinuto = entrada.nextDouble();

        System.out.println("Ingrese los minutos consumidos:");
        minutosConsumidos = entrada.nextInt();

        // Calcular el total a pagar
        totalPago = costoMinuto * minutosConsumidos;

        // Mostrar resultados
        System.out.printf(
            "================================\n"
            + "     PLANILLA DE SERVICIO TELEFÓNICO\n"
            + "================================\n"
            + "Titular: %s\n"
            + "Dirección: %s\n"
            + "--------------------------------\n"
            + "Costo por minuto: $%.2f\n"
            + "Minutos consumidos: %d\n"
            + "--------------------------------\n"
            + "VALOR TOTAL A PAGAR: $%.2f\n"
            + "================================\n",
            titular,
            direccion,
            costoMinuto,
            minutosConsumidos,
            totalPago
        )


