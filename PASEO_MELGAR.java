import java.util.Scanner;


public class PASEO_MELGAR
{
   public static void main(String[] args) 
    {
        double flacos;
        double gordos;
        double dias_paseo;
        double numero_buses;
        double numero_comidas;
        double numero_comidas_total;
        double costo_comida_dia;
        double costo_comida_total;
        double numero_habitaciones;
        double costo_habitaciones_dia;
        double costo_habitaciones_total;
        double costo_comida = 10000;
        double costo_habitaciones = 25000;
        double numero_sillas;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("¿Cuántos estudiantes flacos asistirán al paseo?");
        flacos = teclado.nextDouble();

        System.out.print("¿Cuántos estudiantes gordos asistirán al paseo?");
        gordos = teclado.nextDouble();
        
        System.out.print("¿Cuántos días durará el paseo?");
        dias_paseo = teclado.nextDouble();
                     
        numero_sillas=(gordos*2) + (flacos*1);
        
        numero_buses=numero_sillas / 60;
               
        double buses=Math.ceil(numero_buses);
        
        numero_comidas = ( gordos*5 ) + ( flacos*3 );
        
        numero_comidas_total = numero_comidas * dias_paseo;
        
        costo_comida_dia = numero_comidas * costo_comida;
        
        costo_comida_total = costo_comida_dia * dias_paseo;
        
        numero_habitaciones = ((gordos +  flacos) / (4));
        
        double habitaciones=Math.ceil(numero_habitaciones);
        
        costo_habitaciones_dia = habitaciones * costo_habitaciones;
        
        costo_habitaciones_total = costo_habitaciones_dia * costo_habitaciones;
        

        System.out.println("El número de buses requeridos es de "  +  buses );
        System.out.println("Son necesarios "  +  numero_comidas_total + " platos de comida");
        System.out.println(("El costo total de la comida es de "  + costo_comida_total + " pesos"));
        System.out.println("Se requieren "  +  habitaciones + " habitaciones");
        System.out.println(( "El costo de habitaciones por día es de "  +  costo_habitaciones_dia + " pesos"));
        System.out.println(( "El costo total de habitaciones  es de "  +  costo_habitaciones_total + " pesos"));
    } 
}
