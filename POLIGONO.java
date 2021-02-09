import java.util.Scanner;



public class POLIGONO
{
    public static void main(String[] args) 
    {   
        double longitud_lados;
        int numero_lados;
        double area_poligono;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("¿Cuál es la longitud del lado?");
        longitud_lados = teclado.nextDouble();

        System.out.print("¿Cuántos lados tiene el poligono?");
        numero_lados = teclado.nextInt();
        
        area_poligono = ( numero_lados * Math.pow ( longitud_lados,2 ) ) / ( 4  *  Math.tan ( ( Math.PI ) / ( numero_lados )));

        System.out.println("El área del poligono es de "  +  area_poligono  +  " unidades cuadradas");
      
    }

}
