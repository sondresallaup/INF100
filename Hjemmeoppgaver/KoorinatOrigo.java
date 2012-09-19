/* Oppgave 2.7
 * Program som sier hvor et punkt befinner
 * seg i forhold til origo
 */

import java.util.Scanner;

public class KoorinatOrigo{
  public static void main(String[] args){
    
    // Henter brukerens koordinater
    int xKoordinat;
    int yKoordinat;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Oppgi valgfri x-koordinat: ");
    xKoordinat = keyboard.nextInt();
    
    System.out.print("Oppgi valgfri y-koordinat: ");
    yKoordinat = keyboard.nextInt();
    
    // Finner ut hvor punktet er iforhold til origo
    String xText = "heey";
    String yText;
    
    if(xKoordinat==0&&yKoordinat==0)
      System.out.println("Punktet ligger i orgio");
    
    else
      
      if(xKoordinat>0)
      xText = "hoeyre kvadrant";
    else if(xKoordinat==0)
      xText = "paa y-linjen";
      else
      xText = "venstre kvadrant";
    
    if(yKoordinat>0)
      yText = "oevre";
    else if(xKoordinat==0)
      yText = "paa x-linjen";
    else
      yText = "nedre";
    
    if(!(xKoordinat==0)&&!(yKoordinat==0))
      System.out.println("Punktet (x=" + xKoordinat + ",y=" + 
                         yKoordinat + ") ligger i " + yText + ", " + xText);
  }
}
    