package jcgm.proyecto3.adapters;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.NestedScrollingChild;

import jcgm.proyecto3.MainActivity;
import jcgm.proyecto3.fragmentos.ImagenFragment;

/**
 * Created by juancarlosguevaramendo on 5/07/17.
 */

public class GaleriaAdapter extends FragmentStatePagerAdapter {
    public GaleriaAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {

        //Creamos un fragmento
        ImagenFragment imagenFragment = new ImagenFragment();

        // Creamos una variable Bundle para poder pasar informacion
        Bundle bundle = new Bundle();

        // Enviamos datos atraves del Bundle
        bundle.putInt("posicion", position);

        // Agregamos los parametros a nuestros fragmentos
        imagenFragment.setArguments(bundle);

        // Retortnamos los fragmentos con los datos cargados
        return imagenFragment;
    }

    @Override
    public int getCount() {
        // cantidad de elementos que tiene la lista
        return MainActivity.lista.size();
    }
}
