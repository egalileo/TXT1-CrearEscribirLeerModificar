package txt1;

import java.io.*;

public class ArchivoTexto {

    File archivo;

    public void crearArchivo() {
        archivo = new File("C:\\archivos\\prueba.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado con exito");
            } else {
                System.out.println("Error al crear archivo");
            }
        } catch (IOException exepcion) {
            exepcion.printStackTrace(System.out);
        }
    }

    public void eliminarArchivo() {
        
        if (archivo.delete()) {
            System.out.println("Archivo eliminado con exito");
        } else {
            System.out.println("Error al eliminar el archivo");
        }
    }

    public void escribirArchivo() {
        try {
            FileWriter escritura = new FileWriter(archivo, true); //true no borra lo ya hecho
            escritura.write("Hola Mundo");
            //escritura.write("\nMi nombre es Galileo!");

            escritura.close();
            System.out.println("Texto agregado con exito");
            
        } catch (IOException exepcion) {
            exepcion.printStackTrace(System.out);
        }
    }

    public void leerArchivo() {
        String salida;
        try {
            FileReader lector = new FileReader(archivo); //indicar archivo a leer
            BufferedReader lectura = new BufferedReader(lector); //pasar archivo a leer
            salida = lectura.readLine();

            while (salida != null) {

                System.out.println(salida);
                salida = lectura.readLine();
            }
            lector.close();
        } catch (IOException exepcion) {
            exepcion.printStackTrace(System.out);
        }
    }

}
