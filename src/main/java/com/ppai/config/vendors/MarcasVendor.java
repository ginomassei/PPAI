package com.ppai.config.vendors;

import com.ppai.domain.Marca;
import com.ppai.domain.Modelo;
import io.quarkus.runtime.Startup;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
@Startup
public class MarcasVendor {
    private static ArrayList<Modelo> modelos;
    private static ArrayList<Marca> marcas;

    @PostConstruct
    public void init() {
        modelos = new ArrayList<>();
        marcas = new ArrayList<>();

        crearModelos();
        crearMarcas();
    }

    public static ArrayList<Marca> getMarcas() {
        return marcas;
    }

    public ArrayList<Modelo> getModelos() {
        return modelos;
    }

    public void crearModelos() {
        Modelo modelo1 = new Modelo("TXB312", null);
        Modelo modelo2 = new Modelo("TXB203", null);
        Modelo modelo3 = new Modelo("TXB465", null);
        Modelo modelo4 = new Modelo("MM001", null);
        Modelo modelo5 = new Modelo("MM302", null);
        Modelo modelo6 = new Modelo("MM789", null);
        Modelo modelo7 = new Modelo("PTA209", null);
        Modelo modelo8 = new Modelo("PTA421", null);
        Modelo modelo9 = new Modelo("PTA803", null);
        Modelo modelo10 = new Modelo("SLQ821", null);
        Modelo modelo11 = new Modelo("SLQ746", null);
        Modelo modelo12 = new Modelo("SLQ002", null);
        Modelo modelo13 = new Modelo("IPW491", null);
        Modelo modelo14 = new Modelo("IPW298", null);
        Modelo modelo15 = new Modelo("IPW991", null);

        modelos.add(modelo1);
        modelos.add(modelo2);
        modelos.add(modelo3);
        modelos.add(modelo4);
        modelos.add(modelo5);
        modelos.add(modelo6);
        modelos.add(modelo7);
        modelos.add(modelo8);
        modelos.add(modelo9);
        modelos.add(modelo10);
        modelos.add(modelo11);
        modelos.add(modelo12);
        modelos.add(modelo13);
        modelos.add(modelo14);
        modelos.add(modelo15);
    }

    public void crearMarcas() {
        ArrayList<Modelo> modelosMarca1 = new ArrayList<>();
        ArrayList<Modelo> modelosMarca2 = new ArrayList<>();
        ArrayList<Modelo> modelosMarca3 = new ArrayList<>();
        ArrayList<Modelo> modelosMarca4 = new ArrayList<>();
        ArrayList<Modelo> modelosMarca5 = new ArrayList<>();

        modelosMarca1.add(modelos.get(0));
        modelosMarca1.add(modelos.get(1));
        modelosMarca1.add(modelos.get(5));

        Marca marca1 = new Marca("Mettler",null,modelosMarca1);

        modelosMarca2.add(modelos.get(3));
        modelosMarca2.add(modelos.get(4));
        modelosMarca2.add(modelos.get(9));

        Marca marca2 = new Marca("Baxtran",null,modelosMarca2);

        modelosMarca3.add(modelos.get(12));
        modelosMarca3.add(modelos.get(14));
        modelosMarca3.add(modelos.get(7));

        Marca marca3 = new Marca("Nikon",null,modelosMarca3);

        modelosMarca4.add(modelos.get(2));
        modelosMarca4.add(modelos.get(6));
        modelosMarca4.add(modelos.get(8));

        Marca marca4 = new Marca("Gram",null,modelosMarca4);

        modelosMarca5.add(modelos.get(10));
        modelosMarca5.add(modelos.get(11));
        modelosMarca5.add(modelos.get(13));

        Marca marca5 = new Marca("Fuzion",null,modelosMarca5);

        marcas.add(marca1);
        marcas.add(marca2);
        marcas.add(marca3);
        marcas.add(marca4);
        marcas.add(marca5);
    }
}
