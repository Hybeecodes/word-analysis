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
public class PosAdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double sum=0;
        int count=0;
        System.out.println("You have 1000 trials");
        for(int x=0;x<=1000;x++){
            System.out.println("enter data "+x);
            double N = input.nextDouble();
            if(N >= 0){
                sum += N;
                count++;
            }
            else{
                break;
            }
        }System.out.println("You entered "+count +" positive numbers and their sum is "+sum);
        
        
    }
    
}
