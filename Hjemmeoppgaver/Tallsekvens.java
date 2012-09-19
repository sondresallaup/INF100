/*Oppgave 2.9
 * Et progra som leser en sekvens positive heltall
 */

import java.util.Scanner;

public class Tallsekvens{
  public static void main(String[] args){
    
    int sum = 0;
    int numberRead = 0;
    int nextNumber = 0;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("I dette programmet kan du skrive inn en sekvens positive heltall. For å avslutte sekvensen, tast inn et negativt tall");
    
    while(nextNumber>=0) {
      System.out.printf("Skriv inn %d. heltall :",numberRead+1);
      nextNumber = keyboard.nextInt();
      if (nextNumber>=0){
        keyboard.nextLine();
        sum = sum + nextNumber;
        numberRead = numberRead+1;
      }
    }
    
    double average = sum/numberRead;
    
    System.out.println("Summen av tallene er " + sum);
    System.out.println("Gjennomsnittet av de " + numberRead + " tallene er " + average);
    
  }
}