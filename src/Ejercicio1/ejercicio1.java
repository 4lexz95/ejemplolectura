package Ejercicio1;

import javax.swing.text.NumberFormatter;
import java.io.*;
import java.text.NumberFormat;

public class ejercicio1 {
    private int importe;
    public static void main(String[] args) throws IOException {
        /*Disponemos de un archivo de texto en el que en cada una de sus líneas aparece
una anotación correspondiente a un cargo o abono en una cuenta bancaria. Se pide
desarrollar un programa que procese esta información mostrando al finalizar el saldo
bancario por pantalla, así como el número de cargos y abonos que se han procesado.
         */
        /*
        File fichero = new File("src/cargo");
        FileReader fr = null;
        try {
            fr = new FileReader(fichero);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bf = new BufferedReader(fr);

        String linea = null;
        while ((linea = bf.readLine()) != null) {
            System.out.println(linea);
        }

         */
        // Correcion

        double saldo = 0;
        int numcargos = 0, numabonos= 0;


        File ficherocargos = new File("cargo.txt");
        try (FileReader fr = new FileReader(ficherocargos)) {
            BufferedReader bf = new BufferedReader(fr);
            String linea;
            while ((linea = bf.readLine()) != null){
                double cargo = Double.parseDouble(linea);
                if (cargo >0){
                    numabonos++;
                }
                else{
                    numcargos++;

                }

            }
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            System.out.printf("Tienes %f en cuenta, con cargo y %d", nf.format(saldo), numcargos,numabonos);
            bf.close();
            fr.close();
        }




    }
}
