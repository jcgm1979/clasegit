package jcgm.proyecto3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import jcgm.proyecto3.adapters.ImagenAdapters;
import jcgm.proyecto3.modelos.Imagen;

public class MainActivity extends AppCompatActivity {

    private GridView gvDatos;
    public static ArrayList<Imagen> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvDatos = (GridView) findViewById(R.id.gvDatos);
        lista = new ArrayList<>();

        Imagen imagen = new Imagen();
        imagen.setId(lista.size());
        imagen.setRuta("http://la-motorbit-media.s3.amazonaws.com/2016/07/Fenyr_SuperSport.jpg");
        imagen.setTexto("Imagen");
        lista.add(imagen);

        Imagen imagen1 = new Imagen();
        imagen1.setId(lista.size());
        imagen1.setRuta("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTQeAv2bR7zGSFKKf7vaea6TjFiYTbgyu5_YVe2RECE31WkcPa");
        imagen1.setTexto("Imagen");
        lista.add(imagen1);

        Imagen imagen2 = new Imagen();
        imagen2.setId(lista.size());
        imagen2.setRuta("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS49evLql1le3dGfHqa_m76iWWsTyYmMCMlXfOePPRiS4a9GLC1");
        imagen2.setTexto("Imagen");
        lista.add(imagen2);

        Imagen imagen3 = new Imagen();
        imagen3.setId(lista.size());
        imagen3.setRuta("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRe30lqh64vjTKd8HFSj9ww-4jCIYqmQMTSe4-DUMzHdpZqCkdG");
        imagen3.setTexto("Imagen");
        lista.add(imagen3);

        Imagen imagen4 = new Imagen();
        imagen4.setId(lista.size());
        imagen4.setRuta("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmmBX0l2tjK671V460iVDNChGkw8hvkH-FldSs27DHGSpxXW7obA");
        imagen4.setTexto("Imagen");
        lista.add(imagen4);

        Imagen imagen5 = new Imagen();
        imagen5.setId(lista.size());
        imagen5.setRuta("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQru2sahX2nQAspiX34bftDiKTkY59-1t5cmpyDv9_Yrt4wwI76");
        imagen5.setTexto("Imagen");
        lista.add(imagen5);

        ImagenAdapters adapters = new ImagenAdapters(MainActivity.this, lista);
        gvDatos.setAdapter(adapters);
    }

    @Override
    protected void onResume() {
        super.onResume();

        gvDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                /*
                Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
                intent.putExtra("ruta", lista.get(i).getRuta());
                intent.putExtra("texto", lista.get(i).getTexto());
                startActivity(intent);
                */
                Intent intent  = new Intent(MainActivity.this, GaleriaActivity.class);

                // Enviamos de dato la posicion
                intent.putExtra("posicion", i);
                startActivity(intent);
            }
        });
    }
}
