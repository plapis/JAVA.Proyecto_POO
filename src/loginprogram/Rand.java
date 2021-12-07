package loginprogram;

import java.util.Random;

public class Rand{
    public int x = 0;
    public String[][] Rand(String[][] matriz, int count){
        Checker checker = new Checker();
        boolean pass = false;
        
        System.out.println("\n\n\n\n\n\t Bienvenido a la opcion de pruebas");
        System.out.println("Seleccione cuantos usuarios quiere crear: (max "+ (100-count) + ")");
        while(pass != true){
            x = checker.CheckerInt();
            if((x>0)&&(x<=(99-count))){
                pass = true;
            }
            else{
                System.out.println("Error, valor fuera de rango, vuelva a intentarlo");
            }
        }
        x = x + count;
        
        BotMachine(matriz, x, count);
        
        return matriz;
    }
    
    public String[][] BotMachine(String matriz[][], int x, int count){
        String name[] = {"Juan","Pedro","Pepe","Marcos","Luis","Peter","Oscar","Ivan","Antonio","Jimmy","Ana","Maria","Isabel","Arlette","Alejandra","Karen","Melisa","Emilie","Anastasia","Martha"};
        String last[] = {"Hernández","García","Martínez","López","González","Pérez","Rodriguez","Sánchez","Ramírez","Cruz","Flores","Acosta","Morales","Núñez","Cruz","Gutiérrez","Mendez","Marquez","Romero","Velardez"};
        String beca[] = {"Sí","No"};
        int i;
        Random r =new Random();
        Modification pause = new Modification();
        
        for(i=count;i<x;i++){
            matriz[0][i] = name[new Random().nextInt(name.length)] + " " + last[new Random().nextInt(last.length)] + " " + last[new Random().nextInt(last.length)];
            //j = r.nextInt(79 -13) + 13;
            matriz[1][i] = String.valueOf(r.nextInt(79 - 13) + 13);
            matriz[2][i] = String.valueOf(r.nextInt(20 - 1) + 1);
            matriz[3][i] = String.valueOf(r.nextInt(28 - 1) + 1) + "/" + String.valueOf(r.nextInt(12 - 1) + 1 + "/20" + String.valueOf(r.nextInt(21 - 10) + 10));
            if(Integer.parseInt(matriz[1][i]) > 18){
                matriz[4][i] = beca[new Random().nextInt(2)];
            }
        }
        System.out.println("\nCuentas creadas con éxito");
        pause.pressAnyKeyToContinue();
        System.out.println("\n\n\n\n\n");
            
        return matriz;
    }
}