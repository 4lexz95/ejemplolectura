package ejercicio2;

import modelos.estadopartida;

import java.io.*;

public class ejercicio02 {
    //private static File ficherito;


    public static void main(String[] args) throws IOException {
        /*
        En el contexto del desarrollo de un videojuego, se ha creado una clase llamada
        EstadoPartida para persistir el estado actual de una partida, de manera que se pueda
        implementar la funcionalidad de Guardar / Recuperar la partida. De manera
conceptual, la clase EstadoPartida tan solo dispone de dos atributos numéricos:
vidasRestantes y pantallaActual. Se pide al desarrollador que implemente la clase
EstadoPartida y estos dos métodos de la aplicación:
-void guardarPartida(EstadoPartida objEstadoPartida)
-EstadoPartida recuperarPartida()
         */


        estadopartida ep;
        ep = new estadopartida(3,6-1);
        guardarPartida(ep);
        recuperarpartida();



    }
    static void guardarPartida(estadopartida partidita) throws IOException {
        File file = new File("partida.bck");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(partidita.getVidasRestantes());
        bw.newLine();
        bw.write(partidita.getPantallaActual());
        bw.close();
        fw.close();



    }
    static estadopartida recuperarpartida() throws IOException {
        File file = new File("partida.bck");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int vidasRestantes = Integer.parseInt(br.readLine());
        int pantallaActual = Integer.parseInt(br.readLine());
        br.close();
        fr.close();

        return new  estadopartida(vidasRestantes, pantallaActual);

    }
}
