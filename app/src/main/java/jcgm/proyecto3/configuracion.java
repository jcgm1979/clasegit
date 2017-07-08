package jcgm.proyecto3;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by juancarlosguevaramendo on 5/07/17.
 */

public class configuracion extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(getApplicationContext());
    }
}
