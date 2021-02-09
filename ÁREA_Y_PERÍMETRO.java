import java.util.Scanner;


public class ÁREA_Y_PERÍMETRO
{
    public static void main(String[] args) 
    {
        double eje_mayor;
        double eje_menor;
        double area_elipse;
        double perimetro_elipse;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("¿Cuál es la longitud del eje mayor a?");
        eje_mayor = teclado.nextDouble();

        System.out.print("¿Cuál es la longitud del eje menor b?");
        eje_menor = teclado.nextDouble();
                     
        area_elipse = (Math.PI)*eje_mayor*eje_menor;
        
        perimetro_elipse = (2*(Math.PI))*(Math.sqrt((Math.pow(eje_mayor,2)+Math.pow(eje_menor,2))/2));

        System.out.println("El área de la elipse es de "  +  area_elipse  +  " unidades cuadradas");
        System.out.println("El perímetro de la elipse es de "  +  perimetro_elipse  +  " unidades");
    }
}
