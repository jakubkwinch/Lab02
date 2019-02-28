package lab02;
import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
             
        //Constants
        final double LOW_TIP_RATE = 0.10;
        final double MED_TIP_RATE = 0.15;
        final double HIGH_TIP_RATE = 0.20;
        final double CT_TAX_RATE = 0.0635;
       
        //Menu
        System.out.println("*****Barber Shop Menu*****");
        System.out.println("*Haircut:          $15.25*");
        System.out.println("*Shave             $12.50*");
        System.out.println("*Beard Trim:       $10.75*");
        System.out.println("**************************");
        
        //Ask user to enter services        
        System.out.print("Customer's haircut price: \t" );
        Scanner in = new Scanner(System.in);
        double haircutPrice = input.nextDouble();
        
        System.out.print("Customer's shave price:  \t" );
        double shavePrice = input.nextDouble();
        
        System.out.print("Customer's beard trim price:\t");
        double beardTrimPrice = input.nextDouble();
        System.out.println("\n");
        
        //Show Entered Services to Customer       
        System.out.println("Haircut price: \t\t$" + (haircutPrice));
        System.out.println("Shave price: \t\t$" + (shavePrice));
        System.out.println("Beard trim price: \t$" + (beardTrimPrice));
        
        //Seperation
        System.out.println("---------------------------------------------");
        
        //Calculate Totals
        double totalServices = (haircutPrice + shavePrice + beardTrimPrice);
        double taxTotal = (totalServices * CT_TAX_RATE);
        double totalBill = (totalServices + taxTotal);
        
        //Show Totals
        System.out.println("Services: \t\t$" + ((int)(totalServices *100)/100.0));
        System.out.println("CT tax: \t\t$" + ((int)(taxTotal * 100)/100.0));
        System.out.println("Total bill: \t\t$" + ((int)(totalBill * 100) /100.0));
        System.out.println("\n");
        
        //(int)(tax * 100 + 0.5) / 100.0 
        //((((int)totalServices * LOW_TIP_RATE)*100)/100.0);
        
     
        //Tip Calculations
        double lowTip = ((int)((totalServices * LOW_TIP_RATE)*100)/100.0);
        double medTip = ((int)((totalServices * MED_TIP_RATE)*100)/100.0);
        double highTip = ((int)((totalServices * HIGH_TIP_RATE)*100)/100.0);
        
        //Amount Due w. Tip Totals
        double amountLowTip  = ((int)((lowTip + totalBill)*100)/100.0);
        double amountMedTip  = ((int)((medTip + totalBill)*100)/100.0);
        double amountHighTip = ((int)((highTip + totalBill)*100)/100.0);
        
        System.out.println("Tip Recommendations:");
        System.out.println("Low tip (10%):" + "\t\t$"+ lowTip  + "\tAmount due:" + "\t$" + (amountLowTip));
        System.out.println("Medium tip (15%):" +"\t$"+ medTip  + "\tAmount due:" + "\t$" + (amountMedTip));
        System.out.println("High tip (20%):" +"\t\t$"+ highTip + "\tAmount due:" + "\t$" + (amountHighTip));
        System.out.println("\n");
        
        System.out.println("Thank you. Your barber's name is Jakub. \u263A");
        
        
        
    }
    
}
