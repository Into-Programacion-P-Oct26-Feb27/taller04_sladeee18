/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Camilo Alarcon
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


    /**
     * @param args the command line arguments
     */
    
       


        // Ingreso de datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Declaración de variables
        String nombreCliente;

        // Precios base
        double precioMensualNetflix;
        double precioMensualYouTube;
        double precioMensualDropBox;
        double precioMensualSpotify;

        // Dinero que se descuenta
        double descuentoNetflix;
        double descuentoYouTube;
        double descuentoDropBox;
        double descuentoSpotify;

        // Precios después del descuento
        double precioFinalNetflix;
        double precioFinalYouTube;
        double precioFinalDropBox;
        double precioFinalSpotify;

        // Variables para los totales
        double costoTotal;
        double dineroAhorrado;
        double costoTotalDescuento;

        // Ingresar datos
        System.out.println("Ingrese el nombre del cliente:");
        nombreCliente = entrada.nextLine();

        System.out.println("Ingrese la mensualidad de Netflix:");
        precioMensualNetflix = entrada.nextDouble();

        System.out.println("Ingrese la mensualidad de YouTube:");
        precioMensualYouTube = entrada.nextDouble();

        System.out.println("Ingrese la mensualidad de DropBox:");
        precioMensualDropBox = entrada.nextDouble();

        System.out.println("Ingrese la mensualidad de Spotify:");
        precioMensualSpotify = entrada.nextDouble();

        // Calcular los descuentos
        descuentoNetflix = 0.23 * precioMensualNetflix;
        descuentoYouTube = 0.23 * precioMensualYouTube;
        descuentoDropBox = 0.45 * precioMensualDropBox;
        descuentoSpotify = 0.00 * precioMensualSpotify;

        // Calcular precios finales
        precioFinalNetflix = precioMensualNetflix - descuentoNetflix;
        precioFinalYouTube = precioMensualYouTube - descuentoYouTube;
        precioFinalDropBox = precioMensualDropBox - descuentoDropBox;
        precioFinalSpotify = precioMensualSpotify - descuentoSpotify;

        // Calcular costo total sin descuento
        costoTotal = precioMensualNetflix + precioMensualYouTube
                   + precioMensualDropBox + precioMensualSpotify;

        // Calcular costo total con descuento
        costoTotalDescuento = precioFinalNetflix + precioFinalYouTube
                            + precioFinalDropBox + precioFinalSpotify;

        // Calcular dinero ahorrado
        dineroAhorrado = costoTotal - costoTotalDescuento;

        // Mostrar resultados
        System.out.printf(
            "====================================\n"
            + "       REPORTE DE SERVICIOS\n"
            + "====================================\n"
            + "Nombre del cliente: %s\n"
            + "------------------------------------\n"
            + "PRECIOS MENSUALES:\n"
            + "Netflix: $%.2f\n"
            + "YouTube: $%.2f\n"
            + "DropBox: $%.2f\n"
            + "Spotify: $%.2f\n"
            + "------------------------------------\n"
            + "DESCUENTOS:\n"
            + "Netflix (23%%): $%.2f\n"
            + "YouTube (23%%): $%.2f\n"
            + "DropBox (45%%): $%.2f\n"
            + "Spotify (0%%): $%.2f\n"
            + "------------------------------------\n"
            + "COSTO TOTAL SIN DESCUENTO: $%.2f\n"
            + "DINERO AHORRADO: $%.2f\n"
            + "COSTO TOTAL CON DESCUENTO: $%.2f\n"
            + "====================================\n",
            nombreCliente,
            precioMensualNetflix,
            precioMensualYouTube,
            precioMensualDropBox,
            precioMensualSpotify,
            descuentoNetflix,
            descuentoYouTube,
            descuentoDropBox,
            descuentoSpotify,
            costoTotal,
            dineroAhorrado,
            costoTotalDescuento,
            
        

  

        
    



