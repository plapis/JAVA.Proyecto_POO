package loginprogram;

import java.util.Scanner;

public class Modification {
    public void ShowArray(String matriz[][], int count){
        int i;
                
        System.out.println("\n\n\t\tMostrando los clientes\n");
        for (i=0;i < count; i++){
            System.out.println("cliente " + (i+1));
            System.out.println("nombre: " + matriz[0][i]);
            System.out.println("edad: " + matriz[1][i]);
            System.out.println("semanas pagadas: " + matriz[2][i]);
            System.out.println("inscripción: " + matriz[3][i]);
            if (Integer.parseInt(matriz[1][i]) < 18){
                System.out.println("beca: " + matriz[4][i]);
            }
            System.out.println("");
        }
        pressAnyKeyToContinue();
        System.out.println("\n\n\n\n\n");
    }
    
    public String[][] ChangeArray(String matriz[][], int count){
        String desicion;
        boolean pass = false;
        int x = 0, y = 0;
        Checker check = new Checker();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n¿Quiere ver los usuarios?");
        desicion = sc.nextLine();
        if ((desicion.equals("Si"))||(desicion.equals("Sí"))||(desicion.equals("si"))||(desicion.equals("sí"))||(desicion.equals("s"))||(desicion.equals("S"))){
            ShowArray(matriz, count);
        }
        System.out.println("\n\n\n\n\n\t\tModificando los clientes\n");
        System.out.println("¿Que usuario desea modificar?");
        while (pass != true){
            x = check.CheckerInt() - 1;
            if((x>=0) && (x<count)) {
                pass = true;
            }
            else{
                System.out.println("Error, el usuario no existe");
            }
        }
        System.out.println("1) Nombre");
        System.out.println("2) Edad");
        System.out.println("3) Semanas pagadas");
        System.out.println("4) Fecha de inscripción");
        if (Integer.parseInt(matriz[1][x]) > 18){
            System.out.println("5) Beca");
            while(pass != false){
                y = check.CheckerInt();
                if((y>0)&&(y<6)){
                    pass = false;
                }
            } 
        }
        else{
            while(pass != false){
                y = check.CheckerInt();
                if((y>0)&&(y<5)){
                    pass = false;
                }
            } 
        }
        y--;
        System.out.println("\nIntroduzca el nuevo valor: ");
        if(y == 1){
            while(pass != true){
                matriz[y][x] = check.CheckerAge();
                if ((Integer.parseInt(matriz[y][x]) > 12) && (y < 80)){
                    pass = true;
                }
                else{
                           System.out.println("Error, edad no valida, vuelva a intentarlo");
                }
            }
        }
        else{
            matriz[y][x] = sc.nextLine();
        }
        System.out.println("\nListo, valor modificado con éxito.");
        pressAnyKeyToContinue();
        System.out.println("\n\n\n\n\n");
        return matriz;
    }
    
    
    public void pressAnyKeyToContinue(){ 
        System.out.println("Presiona enter para continuar...");
        try{
            System.in.read();
        }  
        catch(Exception e){
        }
    }
}
