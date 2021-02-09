import java.util.Scanner;

public class CARGA_SASAIMA
{
   public static void main(String[] args) 
    {
        double carga_camion;
        double carga_total;
        double galones_km;
        double costo_galon=10000;
        double distancia=78.5;
        double numero_viajes;
        double galones_consumidos;
        double costo_total;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("¿Cuánta carga soporta el camión?");
        carga_camion = teclado.nextDouble();

        System.out.print("¿Cuánta es la carga total?");
        carga_total = teclado.nextDouble();
        
        System.out.print("¿Cúal es el consumo del camión en galones/km ?");
        galones_km = teclado.nextDouble();
                     
        numero_viajes = carga_total/carga_camion;
        
        double viajes=Math.ceil(numero_viajes);
        
        galones_consumidos = ((numero_viajes*2)*distancia)/(galones_km);
        
        costo_total = costo_galon*galones_consumidos;

        System.out.println("El número de viajes es de "  +  viajes );
        System.out.println("Los galones consumidos son "  +  galones_consumidos);
        System.out.println("El costo total del viaje es de "  +  costo_total + " pesos");
    } 
}
