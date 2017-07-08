package jcgm.proyecto3.modelos;

/**
 * Created by juancarlosguevaramendo on 5/07/17.
 */

public class Imagen {


    // Generamos metodos para obtener y modificar datos.

    private int id;
    private String ruta;
    private String texto;

    // Luego Click derecho - generate - getter and setter y creamos todo lo que sale aqui abajo

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
