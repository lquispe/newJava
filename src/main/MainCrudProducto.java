package main;

import Interfaces.implemetation.CrudProducto;
import model.Producto;

import java.util.ArrayList;

public class MainCrudProducto {

    public static void main(String[] args){

        CrudProducto crudProducto=new CrudProducto();

        ArrayList<Producto> zapatos=crudProducto.populate();

        System.out.println(zapatos);

        Producto newZapato= new Producto(10, "mocasines oro",38, "imagen", 6000L,true, 0);

        ArrayList<Producto> productoAfterCreate=crudProducto.addNewProducto(newZapato);

        Producto newZapatobuscar= new Producto(10, "mocasines oro",38, "imagen", 6000L,true, 0);


        //redefinir por dos o cuatro atributos usar if &&
        if (zapatos.contains(newZapatobuscar)){
            System.out.println("*********se encuentra el zapato se va a realizar la búsqueda*************");
            ArrayList<Producto> listaZapatos= crudProducto.getProductoById(newZapatobuscar,10);
            System.out.println(listaZapatos);
        }else{
            System.out.println("no se encuentra");
        }






    }
}
