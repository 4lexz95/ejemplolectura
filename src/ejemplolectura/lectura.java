package ejemplolectura;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class lectura {
    public static void main(String[] args) {
        // Fichero de destino
        File fichero = new File("Ejemplolectura.txt");
        ArrayList<String> lineas = new ArrayList<>();

        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader bf = new BufferedReader(fr);

            String linea = null;
            while ((linea = bf.readLine()) != null) {
                lineas.add(linea);
                System.out.println(linea);
            }
            if (lineas.size() > 0) {
                System.out.printf("el fichero tiene %d lineas, dime la linea a mostrar", lineas.size());
                Scanner sc = new Scanner(System.in);
                int numlinea = sc.nextInt();
                try {

                    System.out.println(lineas.get(numlinea - 1));
                }
                // if (numlinea > 0 && numlinea <= lineas.size()) {
                catch (IndexOutOfBoundsException e) {
                    System.out.println("Esa linea no existe");
                } finally {
                    bf.close();
                    fr.close();
                }


            }
        }catch(FileNotFoundException e){
                System.out.println(e.getLocalizedMessage());
                System.out.println("El fichero no existe");

            } catch(IOException e){
                System.out.println("No tienes permisos para leer");
                throw new RuntimeException(e);
            }
        }
    }

