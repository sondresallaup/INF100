/* Oppgave 2.5
 * Program som overfører en brukergitt sekundverdi
 * til henholdsvis timer, minutter og sekunder
 */
import java.util.Scanner;
public class Tidsperiode{
  public static void main(String[] args) {
    
    // Henter inn sekundverdi fra brukeren
    double secondsInput;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Gi antall sekunder: ");
    secondsInput = keyboard.nextDouble();
    
    assert secondsInput > 0.0 : "Antall sekunder må være positiv";
    
    // Finner antall timer
    
    double hoursDesi = secondsInput/3600;
    
    int hours = (int) hoursDesi;
    
    // Finner minutter
    
    double minutesDesi = (secondsInput-(hours*3600))/60;
    
    int minutes = (int) minutesDesi;
    
    // Finner sekunder
    
    double seconds = secondsInput-(hours*3600)-(minutes*60);
    
    // Grammatiske korreksjoner
    
    String hoursGram;
    String minutesGram;
    String secondsGram;
    
    if (hours > 1)
      hoursGram = " timer, ";
    else
      hoursGram = " time, ";
    
    if (minutes > 1)
      minutesGram = " minutter og ";
    else
      minutesGram = " minutt og ";
    
    if (seconds > 1)
      secondsGram = " sekunder.";
    else
      secondsGram = " sekund.";
    
    // Skriver ut resultat
    
    System.out.println(secondsInput + " sekunder = " + hours + hoursGram +
                         minutes + minutesGram + seconds + secondsGram);
  }
}