package loginprogram;

import java.util.Scanner;

public class Checker {
    public int CheckerInt(){
        int x = 0;
        String test;
        boolean pass = false;
        Scanner sc = new Scanner(System.in);
        while(pass != true){
            try{
                test = sc.nextLine();
                x = Integer.parseInt(test);
                pass = true;
            }catch(Exception e){
                System.out.println("Error, vuelva a introducir el valor");
            }
        }
        return x;
    }
    
    public String CheckerAge(){
        String word = null;
        boolean pass = false;
        Scanner sc = new Scanner(System.in);
        while(pass != true){
                   try{
                       word = sc.nextLine();
                       if ((Integer.parseInt(word) > 12) && (Integer.parseInt(word) < 80)){
                           pass = true;
                       }
                       else{
                           System.out.println("Error, edad no valida, vuelva a intentarlo");
                       }
                   } catch(Exception e){
                       System.out.println("Error, vuelva a introducir el valor");
                   }
               }
        
        return word;
    }
}