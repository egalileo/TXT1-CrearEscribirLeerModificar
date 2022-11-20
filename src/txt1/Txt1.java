package txt1;

public class Txt1 {

    public static void main(String[] args) {

        ArchivoTexto txt = new ArchivoTexto();
        txt.crearArchivo();
        txt.escribirArchivo();
        txt.leerArchivo();
        txt.eliminarArchivo();
    }

}
