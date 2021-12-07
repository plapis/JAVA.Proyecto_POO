package loginprogram;

//import java.io.IOException


public class Main {
       public static void main(String[] args) {
       String matriz[][] = new String[5][99];
       int opcion = 1, count = 0;
       Menu menu = new Menu();
       
       while (opcion != 0){
           opcion = menu.Opcion();
           
           matriz = menu.Opciones(matriz, count);
           count = menu.x;
                
       }
   }    
}