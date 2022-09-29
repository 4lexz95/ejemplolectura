package ejemploescritura;

import java.io.*;

public class ejemescritura {
    public static void main(String[] args) {
    File destino = new File("EjemploEscritura1");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(destino,true));
            for (int i = 0; i < 1000; i++) {
                bw.write("esta es la linea: "+ (i+1));
                bw.newLine();
            }
            bw.close();

           // PrintWriter pw = new PrintWriter(new FileWriter(destino));
           // pw.println();



        } catch (IOException e) {

            throw new RuntimeException(e);
        }

    }

}
