package jcgm.proyecto3;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jcgm.proyecto3.adapters.GaleriaAdapter;
import me.relex.circleindicator.CircleIndicator;

public class GaleriaActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private CircleIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        indicator = (CircleIndicator) findViewById(R.id.indicator);

        GaleriaAdapter galeriaAdapter = new GaleriaAdapter(getSupportFragmentManager());
        viewPager.setAdapter(galeriaAdapter);

        // Sincroniza la cantidad de datos que tenemos en el viewPager con la cantidad de bolitas
        indicator.setViewPager(viewPager);

        // Agregamos animacion en la transicion de pantallas
        viewPager.setPageTransformer(true, new DepthPageTransformer());

        // Obtenemos el dato que se a enviado desde la pantalla anterior
        int posicion = getIntent().getIntExtra("posicion", -1);

        // Verificamos que la posicion que esta llegando es superior a -1
        if (posicion > -1){

            // Se indica al newPager que se muestra en la posicion enviada
            viewPager.setCurrentItem(posicion);
        }
    }
}
