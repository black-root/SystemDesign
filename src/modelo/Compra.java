package modelo;

import controlador.Conexion;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Compra {
    private Integer IdCompra;
    private Date Fecha;
    private Proveedor PROVEEDOR;
    private Double Total;
    private DetalleCompra[] ARTICULOS;

    
    public Integer getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(Integer IdCompra) {
        this.IdCompra = IdCompra;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Proveedor getPROVEEDOR() {
        return PROVEEDOR;
    }

    public void setPROVEEDOR(Proveedor PROVEEDOR) {
        this.PROVEEDOR = PROVEEDOR;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public DetalleCompra[] getARTICULOS() {
        return ARTICULOS;
    }

    public void setARTICULOS(DetalleCompra[] ARTICULOS) {
        this.ARTICULOS = ARTICULOS;
    }
    
    public void CalcularTotal(){
       
        ResultSet rsCompra =null;
        String datos[] = new String[3];
        ResultSet rs = null;
        Conexion cn = new Conexion();
        
        double total=0;           
              try {
                String codigo="";
                //llena la tabla 
                try{
                cn.conectar();
                rsCompra = cn.getValores("SELECT IdCompra,Fecha,IdProveedor,Total FROM compra");
                }catch(Exception e){
                    cn.desconectar();
                }

                while (rsCompra.next()) {//tablas base de datos
                    //tabla compra
                    datos[0] = rsCompra.getString(1);
                    datos[1] = rsCompra.getString(2);
                    datos[2] = rsCompra.getString(3);
                    datos[3] = rsCompra.getString(4);
                    
                    total=total+Double.parseDouble(datos[3]);//obtiene el costo del item            
                }            
            } catch (SQLException ex) {    

            }
        }
    public void AgregarItem(Producto PRODUCTO, Integer Cantidad, Double CostoUnitario){
        Object items[];
        items = (Object[]) new Object();
        items[0] = PRODUCTO;
        items[1] = Cantidad;
        items[2] = CostoUnitario;         
    }
    
}
