/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytextproject;

/**
 *
 * @author Rayhan
 */
public class Mytextproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            String timestr="01:06:53 AM";
            String datestr="03-15-2018";
            Runtime rt=Runtime.getRuntime();
            Process proc;
           // proc=rt.exec("cmd /C date "+ datestr);
            proc=rt.exec("cmd /C time "+ timestr);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
