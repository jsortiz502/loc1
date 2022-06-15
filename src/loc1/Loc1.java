/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loc1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Acer
 */
public class Loc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Indicamos que fichero va a leer el programa, por lo que es un fichero por defecto.
        //En la vble siguiente definimos la ruta en la cual se encuentra el fichero

        String nombreFich;
        nombreFich = "C:/Users/Acer/Documents/NetBeansProjects/ListasEntrelazadas/src/listasentrelazadas/ListasEntrelazadas.java";
        File fichero = new File(nombreFich);

        try {
            BufferedReader fich = new BufferedReader(new FileReader(nombreFich));
            //Usamos la clase BufferReadeader para tener acceso a un metodo propio (readLine()) y asi mediante un contador contar las lineas.
            int contadorL = 0;
            String linea;
            try {
                //En este caso la condicion final del while corresponde a null, para indicar el final de linea
                while ((linea = fich.readLine()) != null) {
                    contadorL++;
                }
                System.out.println("El número de líneas :" + contadorL);
            } catch (IOException e) {
                // TODO Bloque catch generado automáticamente
                e.printStackTrace();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
