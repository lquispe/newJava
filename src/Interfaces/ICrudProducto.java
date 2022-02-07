package Interfaces;

import model.Producto;

import java.util.ArrayList;

public interface ICrudProducto {

    ArrayList<Producto> addNewProducto(Producto zapato);
//usando equals
    ArrayList<Producto> getProductoById(Producto zapato, int id);

    ArrayList<Producto> deleteProductos(Producto zapatos, Producto zapato);
}
