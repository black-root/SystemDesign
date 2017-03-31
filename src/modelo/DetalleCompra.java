package modelo;


public class DetalleCompra {


    private Producto PRODUCTO;
    private Integer Cantidad;
    private Double CostoUnitario;
    



    //finalizacion.
    //inicio metodos

    public Producto getPRODUCTO() {
        return PRODUCTO;
    }

    public void setPRODUCTO(Producto PRODUCTO) {
        this.PRODUCTO = PRODUCTO;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Double getCostoUnitario() {
        return CostoUnitario;
    }

    public void setCostoUnitario(Double CostoUnitario) {
        this.CostoUnitario = CostoUnitario;
    }

}
