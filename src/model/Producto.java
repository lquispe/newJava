package model;

public class Producto {
    private int id;
    private String descripcion;//modelo con color
    private int talle;
    private String imagen;// tipo de valor sería?
    private Long precioUnitario;
    private Boolean suspendido;
    private int stock;


    public Producto(int id, String descripcion, int talle, String imagen, Long precioUnitario, Boolean suspendido, int stock) {
        this.id = id;
        this.descripcion = descripcion;
        this.talle = talle;
        this.imagen = imagen;
        this.precioUnitario = precioUnitario;
        this.suspendido = suspendido;
        this.stock = stock;
    }

    //buscar por equals
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Long getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Long precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Boolean getSuspendido() {
        return suspendido;
    }

    public void setSuspendido(Boolean suspendido) {
        this.suspendido = suspendido;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", suspendido=" + suspendido +
                ", stock=" + stock +
                '}';
    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return (id==producto.id
                && talle==producto.talle);
    }

//cuándo se redefine el hashcode?
}
