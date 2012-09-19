/**
 * Oppgave 2.1, 2.2 og 2.3
 * Lage et program som omregner celsius til fahrenheit og kelvin
 */
import java.util.Scanner;
public class Tempomregner {
  public static void main(String[] args){
    
    double graderCelsius;
    
//Leser celsiusverdi fra tastaturet
    Scanner tastatur = new Scanner(System.in);
    System.out.print("Gi antall grader celsius: ");
    graderCelsius = tastatur.nextDouble();
    
//Regner ut fahrenheit, deretter kelvin
    double graderFahrenheit = (9.0* graderCelsius)/ 5.0 + 32.0;
    double graderKelvin = graderCelsius + 273.16;
    
//Skriver ut resultatet
    System.out.println(graderCelsius + " grader celsius tilsvarer " +
                       graderFahrenheit + " grader fahrenheit. I kelvin tilsvarerer dette " +
                       graderKelvin + " grader kelvin.");
    
  }
  
}

