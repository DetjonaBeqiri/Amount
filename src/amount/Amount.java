/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amount;

/**
 *
 * @author Detjona
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Amount {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
	System.out.print("Type total amount: ");
	double total = scan.nextDouble();
	System.out.print("Type the number of payments: ");
	int payments = scan.nextInt();
        func(total,payments);
    }
    
    public static void func(double sum, int num){
        double value = sum/num;
	value = Double.parseDouble(new DecimalFormat(".##").format(value));
        System.out.println("RegularAmount:" + Double.toString(value));
        double mbetja = sum - value*num;
        System.out.println("LastAmount:" + Double.toString( value+mbetja));
    }

}
