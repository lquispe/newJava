package Interfaces.implemetation;

import Interfaces.ICrudProducto;
import model.Producto;

import java.util.ArrayList;

public class CrudProducto implements ICrudProducto {
    private ArrayList<Producto> zapatos = new ArrayList<>();


    public ArrayList populate() {
        Producto botanegra = new Producto(1, "botasNegras", 36, "imagen", 10000L, false, 3);
        Producto botanegra2 = new Producto(2, "botasNegras", 37, "imagen", 10000L, false, 2);
        Producto botanegra3 = new Producto(3, "botasNegras", 38, "imagen", 10000L, false, 1);
        Producto botaNaranjoSuela = new Producto(4, "bota naranjo suela", 36, "imagen", 10000L, false, 1);
        Producto zandaliaBeige = new Producto(5, "zandalia Beige", 36, "imagen", 10000L, false, 3);
        Producto mocasinNatural = new Producto(6, "mocasin natural", 36, "imagen", 10000L, false, 3);
        Producto zuecoBeige = new Producto(7, "zueco beige", 36, "imagen", 10000L, false, 3);
        zapatos.add(botanegra);
        zapatos.add(botanegra2);
        zapatos.add(botanegra3);
        zapatos.add(botaNaranjoSuela);
        zapatos.add(zandaliaBeige);
        zapatos.add(mocasinNatural);
        zapatos.add(zuecoBeige);
        return zapatos;


    }

    @Override
    public ArrayList<Producto> addNewProducto(Producto zapato) {
        zapatos.add(zapato);
        return zapatos;
    }

    @Override
    public ArrayList<Producto> getProductoById(Producto zapato, int id) {
        ArrayList<Producto> foundZapato = new ArrayList();
        if (zapatos != null) {

            for (Producto p : zapatos) {
                if (p.equals(zapato)) {
                    foundZapato.add(p);
                }

            }

        }
        return foundZapato;

    }

    @Override
    public ArrayList<Producto> deleteProductos(Producto zapatos, Producto zapato) {
        return null;
    }


}
