/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordanalysis;

/**
 *
 * @author Obikoya Emmanuel
 */
import java.util.Scanner;
public class Sales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /** N = number of stores
         * M = number of department
         *S_sales = weekly sales for a store
         * D_sales = weekly sales for a department
         */
        Scanner input = new Scanner(System.in);
        int N,M;
        double  D_sales, S_sales=0,Total=0;
        System.out.println("How many stores are in your company :");
        N = input.nextInt();
        
        for(int i=1; i<=N; i++){
            System.out.println("Store "+ i);
            System.out.println("How many departments are in this store :");
            M = input.nextInt();
            for(int j=1; j<=M; j++){
                System.out.println("Enter weekly sales for department "+j+" store "+i+":");
                D_sales = input.nextDouble();
                
                S_sales += D_sales;
            }
            System.out.println("The  weekly sales for this store is "+S_sales);
            Total+=S_sales;
        }
        System.out.println("The total sales for this week is "+ Total);
        System.exit(0);
       
    }
    
}
