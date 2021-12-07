package loginprogram;

//import java.io.*;
import java.util.Scanner;




public class CreateAccount {
    /*public void LeerTxt() throws IOException{
        String array[][] = new String[5][2];
        array[0][0] = "Hola";
        
        
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("C:\\Users.txt"));
        salida.writeObject(array);
        salida.flush();
        salida.close();
       }*/
    
    public String[][] CreateAccount(String matriz[][], int count){
        Scanner sc = new Scanner(System.in);
        System.out.println("nombre: ");
        matriz[0][count] = sc.nextLine();
        System.out.println("semanas pagadas: ");
        matriz[2][count] = sc.nextLine();
        System.out.println("fecha en que se pago la inscripcion: ");
        matriz[3][count] = sc.nextLine();
        
        return matriz;
    }
    
}



class CreateAccountKids extends CreateAccount{
    public String[][] CreateAccountKids (String matriz[][], int count){
        Scanner sc = new Scanner(System.in);
        this.CreateAccount(matriz, count);
        System.out.println("¿Cuenta con beca?");
        matriz[4][count] = sc.nextLine();
        
        return matriz;
    }
}
