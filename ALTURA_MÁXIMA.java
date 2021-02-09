import java.util.Scanner;


public class ALTURA_MÁXIMA
{
    public static void main(String[] args) 
    {
        double velocidad_inicial;
        double angulo;
        double altura_maxima;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("¿Cuál es la velocidad inical en m/s?");
        velocidad_inicial = teclado.nextDouble();

        System.out.print("¿Cuál es el ángulo de inclinación?");
        angulo = teclado.nextDouble();
        
        double angulo_rad = Math.toRadians( angulo ); 
               
        altura_maxima = ( ( velocidad_inicial * velocidad_inicial ) * (Math.sin ( angulo_rad ) ))/ ( 2  * 9.8 );

        System.out.println("La altura máxima son "  +  altura_maxima  +  " metros");
    }
}
