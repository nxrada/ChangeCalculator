import java.util.Scanner;
/**
 * Calculator for exact amount of change, in bills & coins. 
 * @author Nick Kammerer
 * @version 1.0
 */
public class ChangeCalculator {
    /**
     * Displays the amount of each U$D denomination for each input amount. 
     * @param args A reference to a string array to store
     *             command-line arguments
     */
    public static void main(String[] a1rgs){

        // Declaration of monetary variables. 
        int tenDollar = 1000;
        int fiveDollar = 500;
        int oneDollar = 100;
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        
        // Declaration of calculation variables & userInput scanner. 
        int remainBalance = 0;
        int tensCount = 0; 
        int fivesCount = 0; 
        int onesCount = 0; 
        int quartersCount = 0; 
        int dimesCount = 0; 
        int nickelsCount = 0; 
        int penniesCount = 0; 
        double originalAmount;
        int amountInPennies; 
        Scanner userInput = new Scanner (System.in);
       
        // Print user prompt.
        System.out.print("Enter monetary amount: ");

        // Declaration of originalAmount variable & assignment through nextDouble() method. 
        originalAmount = userInput.nextDouble();

        // Close scanner. 
        userInput.close();
        
        // Casting original amount into amount in penny. 
        amountInPennies = (int) (originalAmount * 100);

        // Algorithm for determining the appropriate # of bills. 
        if (amountInPennies >= tenDollar){
           tensCount = amountInPennies / tenDollar;
           remainBalance = amountInPennies % tenDollar;      
        }
        if (remainBalance >= fiveDollar){
           fivesCount = remainBalance / fiveDollar;
           remainBalance = remainBalance % fiveDollar;      
        }
        if (remainBalance >= oneDollar) {
           onesCount = remainBalance / oneDollar;
           remainBalance = remainBalance % oneDollar;      
        }
        if (remainBalance >= quarter){
           quartersCount = remainBalance / quarter;
           remainBalance = remainBalance % quarter;      
        }
        if (remainBalance >= dime){
           dimesCount = remainBalance / dime;
           remainBalance = remainBalance % dime;      
        }
        if (remainBalance >= nickel){
           nickelsCount = remainBalance / nickel;
           remainBalance = remainBalance % nickel;      
        }
        if (remainBalance >= penny){
           penniesCount = remainBalance / penny;
           remainBalance = remainBalance % penny;      
        }

        // Print output. 
        System.out.println("Enter monetary amount: $" + String.valueOf(originalAmount));
        System.out.println("That's equivalent to:");
        System.out.println(String.valueOf(tensCount) + " ten dollar bills");
        System.out.println(String.valueOf(fivesCount) + " five dollar bills");
        System.out.println(String.valueOf(onesCount) + " one dollar bills");
        System.out.println(String.valueOf(quartersCount) + " quarters");
        System.out.println(String.valueOf(dimesCount) + " dimes");
        System.out.println(String.valueOf(nickelsCount) + " nickels");
        System.out.println(String.valueOf(penniesCount) + " pennies");
        
    }
}
