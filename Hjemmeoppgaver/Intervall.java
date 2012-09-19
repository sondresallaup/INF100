/* Oppgave 2.6
 * Et program som finner ut om et gitt tall er innenfor
 * et gitt intervall
 */

import java.util.Scanner;

public class Intervall{
  public static void main(String[] args){
    
    //Henter intervall fra brukeren
    int startValue;
    int endValue;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Skriv inn startverdi: ");
    startValue = keyboard.nextInt();
    
    System.out.print("Skriv inn sluttverdi: ");
    endValue = keyboard.nextInt();
    
    //Undersoker om startverdien er større enn sluttverdien
    assert (startValue - endValue)<0.0 : "Intervallets startverdi maa vaere mindre enn dets sluttverdi";
   
    //Henter punktverdi fra brukeren
    int dotValue;
    
    System.out.print("Skriv inn verdi for punkt: ");
    dotValue = keyboard.nextInt();
    
    //Informerer om punktet befinner seg i intervallet
    if (dotValue > startValue && dotValue < endValue)
      System.out.println("Punktet med verdi " + dotValue +
                         " ligger innenfor intervallet fra " +
                         startValue + " til " + endValue);
    else if (dotValue == startValue ||dotValue == endValue)
      System.out.println("Punktet med verdi " + dotValue +
                         " ligger utenfor, dog på grensen til interallet fra " +
                         startValue + " til " + endValue);
    else
      System.out.println("Punktet med verdi " + dotValue + 
                         " ligger utenfor intervallet fra " +
                         startValue + " til "+ endValue);
     
  }
  
}