package examen_1;

import java.io.File;
import java.io.IOException;

public class CrearArchivo {
    public static void main(String[] args) {
        try {
            File ficheroDatos = new File("datos.txt");            
            if (ficheroDatos.createNewFile()) {
                System.out.println("Fichero "+ ficheroDatos.getName() +" creado");
            }            
            else {
                System.out.println("No se ha podido crear el fichero. Probablemente ya exista.");
            }
        }catch(IOException error){
            System.out.println("Error al crear el fichero.");
            error.printStackTrace();
        }
    }
}
