package com.ppai.config;

import com.ppai.domain.Caracteristica;
import io.quarkus.runtime.Startup;

import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
@Startup
public class GlobalVendor {
    public static ArrayList<Caracteristica> caracteristicas;


    private static void crearCaracteristicas() {
        Caracteristica caracteristica1 = new Caracteristica();
        Caracteristica caracteristica2 = new Caracteristica();
        Caracteristica caracteristica3 = new Caracteristica();
        Caracteristica caracteristica4 = new Caracteristica();
        Caracteristica caracteristica5 = new Caracteristica();
        Caracteristica caracteristica6 = new Caracteristica();
        Caracteristica caracteristica7 = new Caracteristica();
        Caracteristica caracteristica8 = new Caracteristica();
    }
}
