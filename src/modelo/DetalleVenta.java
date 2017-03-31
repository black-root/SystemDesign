package modelo;

/**
 *
 * @author ronal
 */
import controlador.Conexion;

public class DetalleVenta {
    //OBJETOS//
   private Producto PRODUCTO;
   private Integer Cantidad;
   private Double PrecioUnitario;

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

    public Double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(Double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }
  
   
   
   
               //METODOS//
               
    //para ingresar los campos en la base de datos   
    public void agregarDetalleVenta(Integer IdVenta, String CodBarra, Integer Cantidad, Double PrecioUnitario) {
        Conexion cn = new Conexion();           
        try{
            cn.conectar();
            cn.UID("INSERT INTO detalleventa(IdVenta,CodBarra,Cantidad,PrecioUnitario) VALUES('" + IdVenta + "','" + CodBarra + "','" + Cantidad + "','" + PrecioUnitario + "')");
            cn.desconectar();            
        }catch(Exception e) {
            cn.desconectar();            

        }        
    }
     
    //para hacer el proceso de calculo de precio
  public void calcularPrecio(){
    //Lo siguiente nos permite calcular el total para cada artículo,
    //esto tomando en cuenta total de compra y precio de compra.
    int canCompra = 0;
    int pCompra = 0;
    int totalPrecio = 0 ;
    try {
        canCompra = Integer.parseInt("");
        pCompra = Integer.parseInt("");       
           totalPrecio = canCompra * pCompra;
//           this.total.setText(String.valueOf(totalParcial)); 
//           this.agregar.requestFocus();
           
    } catch (Exception e) {
    }
    
    
}

}