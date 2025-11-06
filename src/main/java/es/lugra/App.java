package es.lugra;
public class App 
{
    public static void main( String[] args )
    {
        String textoPrueba = "Texto con tildes y eñes: á, é, í, ó, ú, Á, É, Í, Ó, Ú, ñ, Ñ.";
        String rutaSinFormato = "texto_sin_formato.txt";
        String rutaConUTF8 = "texto_UTF8.txt";

        EscritorLector.escribirSinUTF8(rutaSinFormato, textoPrueba);
        EscritorLector.escribirConUTF8(rutaConUTF8, textoPrueba);

        System.out.println("Lectura sin UTF-8:");
        EscritorLector.leerSinUTF8(rutaSinFormato);
        System.out.println("\nLectura con UTF-8:");
        EscritorLector.leerConUTF8(rutaConUTF8);
    }
}
