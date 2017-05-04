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
public class MirrorWord {
    
    public void MirrorTest( String user_word){
      String words= user_word.toUpperCase();
        boolean flag = false;
        boolean check = false;
    char mirror[] = {'A','H','I','J','M','N','O','Q','T','U','V','W','X','Y'};
    for(int i=0; i< words.length(); i++){
       for(int j=0; j< mirror.length; j++){
           
           if( words.charAt(i) == mirror[j]){
               check=true;
               break;
           }else{
               check = false;
               
           }
           
       }if(check){
           flag = true;
       }else{
           flag = false;
       }
    }if(flag){
        System.out.println(words + " is a mirror word.");
    }else{
        System.out.println(words+ " is Not a mirror word.");
    }
    }
}
