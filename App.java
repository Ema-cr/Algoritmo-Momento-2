import java.util.Scanner;

public class App {
    public static final double DESCUENTO_COMPRA_SUPERIOR = 10;/*SOLO SI LA COMPRA SUPERA 100K */
    public static final double IVA = 19; /*IVA DEL 19%* SE USA CON EL VALOR YA CON EL DESCUENTO*/
    public static final double PRECIO_PRODUCTO_BASICO = 20000;
    public static final double PRECIO_PRODUCTO_MEDIO = 50000;
    public static final double PRECIO_PRODUCTO_PREMIUM = 90000;
    public static final double UMBRAL_DESCUENTO = 100000;
    public static int cantidadArticulos = 0;
    public static double compraTotal = 0;
    public static int productosPremium = 0;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=== Bienvenido al menú que productos deseas comprar?: ==== \n"
            + "1. Producto Básico - $" + PRECIO_PRODUCTO_BASICO + "\n"
            + "2. Producto Medio - $" + PRECIO_PRODUCTO_MEDIO + "\n"
            + "3. Producto Premium - $" + PRECIO_PRODUCTO_PREMIUM + "\n"
            + "4. Finalizar compra\n"
            + "Elija una opción: ");
            opcion = leer.nextInt();

            if (opcion == 1) {
                compraTotal += PRECIO_PRODUCTO_BASICO;
                cantidadArticulos ++;
                System.out.println("Llevas: $" + compraTotal);            
            } else if (opcion == 2) {
                compraTotal += PRECIO_PRODUCTO_MEDIO;
                cantidadArticulos ++;
                System.out.println("Llevas: $" + compraTotal);
            } else if (opcion == 3) {
                compraTotal += PRECIO_PRODUCTO_PREMIUM;
                cantidadArticulos ++;
                productosPremium ++;
                System.out.println("Llevas: $" + compraTotal);
            } else if (opcion == 4) {
                System.out.println("Compra Finalizada");
            } else {
                System.out.println("Opcion Invalida");
            }
        } while (opcion != 4);

        double totalConDescuento = compraTotal;

        if (compraTotal > UMBRAL_DESCUENTO){
            totalConDescuento = compraTotal - (compraTotal * DESCUENTO_COMPRA_SUPERIOR) / 100;
        }
        System.out.println("Total con descuento: $" + totalConDescuento);

        double valorIva = (totalConDescuento * IVA) / 100;
        System.out.println("El IVA es:" + valorIva);

        double totalPago = totalConDescuento + valorIva;
        System.out.println("El valor total a pagar es de: $" + totalPago);   
        
        double porcentajePremium = 0;
        if (cantidadArticulos >= 1) {
            porcentajePremium = ((double) productosPremium / cantidadArticulos ) * 100;
        }
        System.out.println("Porcentaje de productos premium:" + porcentajePremium + "%");
    }
}