/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 *
 * @author oracle
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       try {
//           FileInputStream leer = new FileInputStream("/home/oracle/Desktop/ProbaExer3/foto.jpg");
//            //Para que no sobreescriba hay que poner true aumentando asi su tamaño, con false si sobreescribe
//            FileOutputStream escribir = new FileOutputStream("/home/oracle/Desktop/ProbaExer3/foto2.jpg");
//            int c;
//            //Mientras tenga algo que leer que escriba
//            while ((c = leer.read()) != -1 ) {
//                escribir.write(c);
//            }
//            escribir.close();
//            leer.close();
//        } catch (Exception e) {
//        }
        
         try {
           BufferedInputStream leer =new BufferedInputStream(new FileInputStream("/home/oracle/Desktop/ProbaExer3/foto.jpg"));
            //Para que no sobreescriba hay que poner true aumentando asi su tamaño, con false si sobreescribe
            BufferedOutputStream escribir =new BufferedOutputStream(new FileOutputStream("/home/oracle/Desktop/ProbaExer3/foto2.jpg",true));
            int c;
            //Mientras tenga algo que leer que escriba
            while ((c = leer.read()) != -1 ) {
                escribir.write(c);
            }
            escribir.close();
            leer.close();
        } catch (Exception e) {
        }
    }
    }