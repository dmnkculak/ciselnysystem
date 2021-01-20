import java.util.Scanner;
public class BinarnaNaVsetko {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    // pole do ktorého vložíme číslo
    System.out.println("Vložte binárne číslo : ");
    // reťazce
    String binary;
    binary=sc.nextLine();
    int decimal;
    String hexadecimal;
    //Tieto metódy vrátia reťazce ako celé číslo
    decimal=Integer.parseInt(binary, 2);
    hexadecimal=Integer.toHexString(decimal);
    //pole ktoré nám vypíše dané číslo
    System.out.println("Decimálne : "+decimal+" Hexadecimálne : "+hexadecimal);
    }
   }
