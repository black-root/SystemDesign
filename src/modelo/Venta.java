
package modelo;

import controlador.Conexion;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ListModel;


public class Venta {
    
    
    private Integer IdVenta;
    private Date Fecha;
    private String Cliente;
    private double Total;
    private DetalleVenta[] ARTICULO;

    public Integer getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(Integer IdVenta) {
        this.IdVenta = IdVenta;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public DetalleVenta[] getARTICULO() {
        return ARTICULO;
    }

    public void setARTICULO(DetalleVenta[] ARTICULO) {
        this.ARTICULO = ARTICULO;
    }
    
    
    
    public void AgregarItem(DetalleVenta dv){
        
        List<DetalleVenta> venta;
        
        
    }
    
       public void CalcularTotal(){
       
        ResultSet rsVenta =null;
        String datos[] = new String[3];
        ResultSet rs = null;
        Conexion cn = new Conexion();
        
        double total=0;           
              try {
                String codigo="";
                //llena la tabla 
                try{
                cn.conectar();
                rsVenta = cn.getValores("SELECT IdVenta,Fecha,Cantidad,Total FROM Venta");
                }catch(Exception e){
                    cn.desconectar();
                }

                while (rsVenta.next()) {//tablas base de datos
                    //tabla compra
                    datos[0] = rsVenta.getString(1);
                    datos[1] = rsVenta.getString(2);
                    datos[2] = rsVenta.getString(3);
                    datos[3] = rsVenta.getString(4);
                    
                    total=total+Double.parseDouble(datos[3]);//obtiene el costo del item            
                }            
            } catch (SQLException ex) {    

            }
        }
    
    
}
