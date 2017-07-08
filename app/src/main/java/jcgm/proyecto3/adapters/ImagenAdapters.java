package jcgm.proyecto3.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;

import jcgm.proyecto3.R;
import jcgm.proyecto3.modelos.Imagen;

/**
 * Created by juancarlosguevaramendo on 5/07/17.
 */


// CREAMOS LA CONFIGURACION PARA GENERAR LOS ELEMENTOS QUE VEMOS EN PANTALLA

public class ImagenAdapters extends ArrayAdapter <Imagen> {

    private Context context;
    private ArrayList<Imagen> lista;

    public ImagenAdapters(@NonNull Context context, @NonNull ArrayList<Imagen> objects) {
        super(context, 0, objects);
        this.context = context;
        this.lista = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.item_imagen, parent, false);

        Imagen imagen = lista.get(position);

        SimpleDraweeView sdvImagen=(SimpleDraweeView) convertView.findViewById(R.id.sdvImagen);
        TextView tvTexto = (TextView) convertView.findViewById(R.id.tvTexto);
        sdvImagen.setImageURI(Uri.parse(imagen.getRuta()));
        tvTexto.setText(imagen.getTexto());
        return convertView;
    }
}

