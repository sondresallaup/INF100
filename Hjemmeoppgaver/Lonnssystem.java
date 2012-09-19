/*
 * Oppgave 2.4
 * Lage et program som skal regne ut ansattes lønn etter et provisjonsbasert system
 */
import java.util.Scanner;
public class Lonnssystem{
  public static void main(String[] args){
    
    //Lager produkter
    double productA = 239.99;
    double productB = 129.75;
    double productC = 99.95;
    double productD = 350.89;
    
//Leser antall solgte produkter fra tastaturet
    double numberProductA = -1;
    double numberProductB;
    double numberProductC;
    double numberProductD;
    
    Scanner keyboard = new Scanner(System.in);
    
    while (numberProductA < 0){
      System.out.print("Gi antall solgte enheter av Produkt A: ");
      numberProductA = keyboard.nextDouble();
    }
    
    do {
    System.out.print("Gi antall solgte enheter av Produkt B: ");
    numberProductB = keyboard.nextDouble();
    } while (numberProductB < 0);
    
    do{
    System.out.print("Gi antall solgte enheter av Produkt C: ");
    numberProductC = keyboard.nextDouble();
    } while (numberProductC<0);
    
    do{
    System.out.print("Gi antall solgte enheter av Produkt D: ");
    numberProductD = keyboard.nextDouble();
    } while (numberProductD<0);
 
    
    double fee = 200 + (productA*numberProductA*0.09) + (productB*numberProductB*0.09)+ 
      (productC*numberProductC*0.09)+ (productC*numberProductC*0.09);
    
    System.out.println("Selgerens lønn er kr " + fee);
    
    System.out.println("Produkt A: pris: " + productA + " solgte enheter: " + numberProductA);
    System.out.println("Produkt B: pris: " + productB + " solgte enheter: " + numberProductB);
    System.out.println("Produkt C: pris: " + productC + " solgte enheter: " + numberProductC);
    System.out.println("Produkt D: pris: " + productD + " solgte enheter: " + numberProductD);

  }
}