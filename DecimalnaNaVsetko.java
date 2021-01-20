import java.util.Scanner;
public class DecimalnaNaVsetko {
    public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    // pole do ktorého vložíme číslo
    System.out.println("Vložte decimálne číslo : ");
    // reťazce
    int decimal;
    decimal=sc.nextInt();
    String binary,octal,hexadecimal;
    //Tieto metódy vrátia reťazce ako celé číslo
    binary=Integer.toBinaryString(decimal);
    octal=Integer.toOctalString(decimal);
    hexadecimal=Integer.toHexString(decimal);
    //pole ktoré nám vypíše dané číslo
    System.out.println("Binary : "+binary+" Octal : "+octal+" Hexadecimal : "+hexadecimal);
    }
   }
