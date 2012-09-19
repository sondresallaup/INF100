/* Oppgave 2.8
 * Loekkesummering
 */

import java.util.Scanner;
public class LoekkeSummerer{
  public static void main(String[] args){
    
    int numberNumber,numberRead;
    int nextNumber,sum;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Gi antall heltall som skal summeres: ");
    numberNumber = keyboard.nextInt();
    keyboard.nextLine();
    
    numberRead = 0;
    sum = 0;
    
    while (numberRead < numberNumber) {
      System.out.printf("Gi %d. tall [heltall]: ", numberRead+1);
      nextNumber = keyboard.nextInt();
      keyboard.nextLine();
      sum = sum + nextNumber;
      numberRead = numberRead+1;
    }
    
    System.out.printf("Summen av %d heltall er %d%n", numberRead, sum);
  }
}