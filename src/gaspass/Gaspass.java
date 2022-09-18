/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package gaspass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author RafaelNR
 */
public class Gaspass {

    /**
     * @param args the command line arguments
     */
public static void main( String[] args )
{
    int i =0;

	while(true) {
		
	i++;
	
	int n = (int)(Math.random()*6+1);
	
	try {
	      File file = new File("GasPassInfo"+i+".dat");
	      file.createNewFile();
	    } catch (IOException e) {
	      System.out.println("An error occurred creating the archive.");
	      e.printStackTrace();
	    }
	
	try {
	      
	      FileWriter flujo = new FileWriter("GasPassInfo"+i+".dat", true);
          PrintWriter escritor = new PrintWriter(flujo);
          escritor.print(n);
          escritor.close();
          flujo.close();
	    } catch (IOException e) {
	      System.out.println("An error occurred writting the archive.");
	      e.printStackTrace();
	    }
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	}
	
}
}
