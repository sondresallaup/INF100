/* Oppgave 2.11
 * Et program som tilordner karakterer
 */
import java.util.Scanner;

public class Karakterberegner{
  public static void main(String[] args){
    
    int studentnr;
    double poengsum;
    String karakter;
    
    //Henter informasjon fra brukeren
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Oppgi studentnummer [heltall] :");
    studentnr = keyboard.nextInt();
    
    if ((studentnr%2.0)<1){
      System.out.print("Oppgi poengsum [flyttall] :");
    poengsum = keyboard.nextDouble();
    
     assert poengsum > 100.0 : "Ugyldig poengsum for eksamen " + poengsum + "\n Tillatte verdier fra 0.0 til 100.0";
    
    //Finner ut hvilken karakter studenten skal ha
    if(poengsum<15)
      karakter = "F";
    
    else if(poengsum<31)
      karakter = "E";
    
    else if(poengsum<61)
      karakter = "D";
    
    else if(poengsum<81)
      karakter = "C";
    
    else if(poengsum<91)
      karakter = "B";
    else
      karakter = "A";
    
    //Skriver resultat
   System.out.println("Student " + studentnr + " får karakter " + karakter);
    }
    
    else
      System.out.println("ERROR: Studentnummer må være partall");
    
  }
}