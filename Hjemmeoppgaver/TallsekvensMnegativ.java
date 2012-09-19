/*Oppgave 2.10
 * Et program som leser en sekvens positive og negative heltall
 */

import java.util.Scanner;

public class TallsekvensMnegativ{
  public static void main(String[] args){
    
    double sum = 0;
    int numberRead = 0;
    double nextNumber = 0;
    int numberNumber = 0;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("I dette programmet kan du skrive inn en sekvens positive og negative heltall.");
    
    System.out.print("Skriv inn antall tall sekvensen skal bestå av: ");
    numberNumber = keyboard.nextInt();
    keyboard.nextLine();
    
    while(numberRead<numberNumber) {
      System.out.printf("Skriv inn %d. heltall :",numberRead+1);
      nextNumber = keyboard.nextDouble();
      keyboard.nextLine();
      sum = sum + nextNumber;
      numberRead = numberRead+1;
      
    }
    
    double average = sum/numberRead;
    
    System.out.println("Summen av tallene er " + sum);
    System.out.println("Gjennomsnittet av de " + numberRead + " tallene er " + average);
    
  }
}