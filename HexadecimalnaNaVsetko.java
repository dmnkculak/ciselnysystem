import java.util.Scanner;
public class HexadecimalnaNaVsetko {
    public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    // pole do ktorého vložíme číslo
    System.out.println("Vložte Hexadecimálne číslo : ");
    // reťazce
    String hexadecimal;
    hexadecimal=sc.nextLine();
    int decimal = 0;
    String binary;
    //Tieto metódy vrátia reťazce ako celé číslo
    binary=Integer.toBinaryString(decimal);
    decimal=Integer.parseInt(hexadecimal, 16);
    //pole ktoré nám vypíše dané číslo
    System.out.println("Binary : "+binary+" decimal : "+decimal);
    }
   }
