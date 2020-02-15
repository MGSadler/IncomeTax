/*Prompt a user for his or her marital status (single or married) and annual income (a double value),
and then uses nested if statements to compute that person's tax, based on the simplified tax-rate table.
 *Output of program should look close to the following and should be constructed using both String literals
and variables for income, tax rate, and income tax.
 *"Based on a status of "single" and an annual income of $10000.00,
the income tax is 15.00% of $10000.00, which equals $1500.00."
 */

/*Simplified Tax-Rate Table:
Income      Marital Status-Single  Marital Status-Married
<=$30,000       15%                  12%
>$30,000        25%                  20%
*/

package incometax;
import java.util.Scanner;

public class IncomeTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marital status (single or married): ");
        String status = scan.next();
        System.out.println("Enter the annual income: ");
        double income = scan.nextDouble();
        double taxRate;
        if(status.equalsIgnoreCase("single")){
            if(income > 30000){
                taxRate = 25;
            }else{
                taxRate = 15;
            }
        }else{
            if(income > 30000){
                taxRate = 20;
            }else{
                taxRate = 12;
            }
        }
        double incomeTax = (income * taxRate)/100;
        System.out.println("Based on a status of " + status + " and an annual income of $" + income);
        System.out.println("the income tax is " + taxRate + "% of $" + income + ", which equals $" + incomeTax);
    }
}
