
package controlador;

import java.sql.Date;
import java.sql.ResultSet;
import modelo.DetalleVenta;
import modelo.Venta;


public class ControladorVenta {
   
    public void Agregar(Venta v) {  
        Conexion cn = new Conexion();
        try{
        cn.conectar();
        cn.UID("INSERT INTO compra(IdVenta,Fecha,Cliente,Total) VALUES('" + v.getIdVenta() + "','" + v.getFecha() + "','" + v.getCliente() + "','" + v.getTotal() + "')");
        } catch (Exception e){
             
        }finally{
            cn.desconectar();
        }
        
    }
    
     
    public ResultSet ObtenerIdVenta(int IdVenta){   
        Conexion cn = new Conexion();
        try{
        cn.conectar();
        return( cn.getValores("SELECT IdVenta, Total FROM venta WHERE IdVenta= '"+IdVenta+"'"));
        } catch (Exception e){
        cn.desconectar();
        return null;
        }
    }
    
    public void ActulizarInventario(DetalleVenta v) {
        Conexion cn = new Conexion();
        try{
        cn.conectar();
        cn.UID("UPDATE detalleventa SET CodBarra='" + v.getPRODUCTO().getCodBarra() +"'Cantidad='" + v.getCantidad()  +"',CostoUnitario='"+v.getPrecioUnitario()+"'");
        } catch (Exception e){
             
        }finally{
            cn.desconectar();
        }
    } 
    
    
    
}
