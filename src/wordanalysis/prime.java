/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordanalysis;

/**
 *
 * @author Obikoya Emmanuel
 */import java.util.*;
public class prime {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        boolean check=false;
       int j = input.nextInt();
        for(int num=2; num<=j; num++){
            for(int i=2; i<= num; i++){                
                if(num% i ==0 && num!=i){
                   
                    check=false;
                    break;
                    
                }else{
                    check=true;
                    continue;
                }
            }
            if(check == true){
                
                System.out.println(num);
            }
        }
    }
    
}
