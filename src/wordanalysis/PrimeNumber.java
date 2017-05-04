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
import java.util.*;
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean check =false;
        int N;
        System.out.println("Enter a positive number :");
        N = input.nextInt();
        
        for(int i=2; i<N; i++){
            if(N % i ==0){
               check = false;
                break;
            }else{
                check = true;
                continue;
             
                
            }
        } if(check==true){
         System.out.println(N+ " is a prime number");
        }else{
            System.out.println(N+ " is NOT a prime number");
        }
    }
    
}
