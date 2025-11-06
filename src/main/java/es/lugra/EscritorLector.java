package es.lugra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EscritorLector {

    /**
     * Escribe texto en un fichero utilizando FileWriter.
     * Usa la codificación por defecto del sistema (puede ser UTF-8 o ISO-8859-1 según el entorno).
     *
     * @param ruta  Ruta del archivo donde se escribirá el texto.
     * @param texto Contenido a escribir.
     */
    public static void escribirSinUTF8(String ruta, String texto) {
        try (FileWriter fw = new FileWriter(ruta)) {
            // Escribe el texto directamente, sin especificar codificación
            fw.write(texto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Escribe texto en un fichero utilizando OutputStreamWriter con codificación UTF-8.
     * Asegura que los caracteres especiales (tildes, eñes, etc.) se representen correctamente.
     *
     * @param ruta  Ruta del archivo donde se escribirá el texto.
     * @param texto Contenido a escribir.
     */
    public static void escribirConUTF8(String ruta, String texto) {
        try (OutputStreamWriter osw =
                     new OutputStreamWriter(new FileOutputStream(ruta), "UTF-8")) {
            // Escribe el texto usando codificación UTF-8 explícita
            osw.write(texto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Lee el contenido de un archivo usando FileReader.
     * Interpreta los bytes del archivo con la codificación por defecto del sistema.
     *
     * @param ruta Ruta del archivo a leer.
     */
    public static void leerSinUTF8(String ruta) {
        try (FileReader fr = new FileReader(ruta)) {
            int c;
            // Lee carácter a carácter y lo muestra por consola
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Lee el contenido de un archivo usando InputStreamReader con codificación UTF-8.
     * Garantiza que los caracteres especiales se lean correctamente.
     *
     * @param ruta Ruta del archivo a leer.
     */
    public static void leerConUTF8(String ruta) {
        try (InputStreamReader isr =
                     new InputStreamReader(new FileInputStream(ruta), "UTF-8")) {
            int c;
            // Lee carácter a carácter con decodificación UTF-8
            while ((c = isr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
