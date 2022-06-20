package com.ppai.config.vendors;

import io.quarkus.runtime.Startup;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
@Startup
public class MiscVendor {
    private static ArrayList<String> metodosDeNotificacion;

    @PostConstruct
    public void init() {
        metodosDeNotificacion = new ArrayList();
        crearMetodosDeNotificacion();
    }

    public static ArrayList<String> getMetodosDeNotificacion() {
        return metodosDeNotificacion;
    }

    public void crearMetodosDeNotificacion() {
        metodosDeNotificacion.add("WhatsApp");
        metodosDeNotificacion.add("Email");
    }
}
