package loginprogram;

import java.util.Scanner;

public class Menu {
    public int opc, x;
    public String test;
    public boolean pass;
    Scanner sc = new Scanner(System.in);
    
    public int Opcion(){
    pass = false;
    
    System.out.println("\t\tBienvenido");
    System.out.println("Por favor escoge una opción");
    System.out.println("1) Crear cuenta");
    System.out.println("2) Ver cuentas creadas");
    System.out.println("3) Modificar una cuenta");
    System.out.println("4) Crear cuentas falsas para testeo");
    System.out.println("0) Salir");
    while (pass != true) {
        test = sc.nextLine();
        

        try{
            opc = Integer.parseInt (test);
            if (opc == 0){break;}
            if ((opc > 0) && (opc < 10)){
                pass = true;
                }
            else{
                System.out.println("Error, vuelve a introducir el valor");
                }    
            }
        catch(NumberFormatException e){
                System.out.println("Error, vuelve a introducir el valor");    
            }
        }

    return opc;
    }
    
    
    public String[][] Opciones(String matriz[][], int count){
        boolean pass = false;
        Scanner sc = new Scanner(System.in);
        
        if(opc == 1){
               if(count<98){
                    System.out.println("\n\nEscriba los siguientes requerimientos\n");
                    System.out.println("edad: ");
                    while(pass != true){
                        try{
                            matriz[1][count] = sc.nextLine();
                            if ((Integer.parseInt(matriz[1][count]) > 12) && (Integer.parseInt(matriz[1][count]) < 80)){
                                pass = true;
                            }
                            else{
                                System.out.println("Error, edad no valida, vuelva a intentarlo");
                            }
                        } catch(Exception e){
                            System.out.println("Error, vuelva a introducir el valor");
                        }
                    }

                    if (Integer.parseInt(matriz[1][count]) > 17){
                        CreateAccount cuenta = new CreateAccount();
                        matriz = cuenta.CreateAccount(matriz, count);
                    }
                    else{
                        CreateAccountKids cuenta = new CreateAccountKids();
                        matriz = cuenta.CreateAccountKids(matriz, count);
                    }
                    count++;
               }
               else{
                   Modification asd = new Modification();
                   System.out.println("Error, ya no es posible crear mas usuarios.");
                   asd.pressAnyKeyToContinue();
                   System.out.println("\n\n\n\n\n");
               }
           }
        if(opc == 2){
            if (count != 0){
                Modification cuenta = new Modification();
                cuenta.ShowArray(matriz, count);
            }
            else{
                System.out.println("Error, no hay usuarios que mostrar");
                Modification asd = new Modification();
                asd.pressAnyKeyToContinue();
                System.out.println("\n\n\n\n\n");
            }
        }
        if(opc == 3){
            if (count != 0){
                Modification cuenta = new Modification();
                cuenta.ChangeArray(matriz, count);
            }
            else{
                System.out.println("Error, no hay usuarios que modificar");
                Modification asd = new Modification();
                asd.pressAnyKeyToContinue();
                System.out.println("\n\n\n\n\n");
            }
        }
        if(opc == 4){
            if (count != 99){
                Rand cuenta = new Rand();
                cuenta.Rand(matriz, count);
                count = cuenta.x;
            }
            else{
                System.out.println("Error, no es posible crear mas usuarios");
                Modification asd = new Modification();
                asd.pressAnyKeyToContinue();
                System.out.println("\n\n\n\n\n");
            }
        }
        x=count;
        return matriz;
    }
}