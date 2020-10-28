/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.ucenfotec.bl.iu;

import java.util.Scanner;


public class IU {
    
    
    private final Scanner input = new Scanner(System.in);
    
    
    public String readString(){
        return input.nextLine();
    }
    
    public int readInt(){
        try{
            return Integer.parseInt(readString());
        } catch (NumberFormatException ex){
            return -1;
        }
    }
    
    public void imprimir(String toPrint){
        System.out.println(toPrint);
    }

}
