package controlador;

import java.sql.ResultSet;
import modelo.Compra;
import modelo.DetalleCompra;




/**
 *
 * @author ronal
 */
public class ControladorCompra {
    
  
   
    public void Agregar(Compra p) {  
        Conexion cn = new Conexion();
        try{
        cn.conectar();
        cn.UID("INSERT INTO compra(IdCompra,Fecha,IdProveedor,Total) VALUES('" + p.getIdCompra() + "','" + p.getFecha() + "','" + p.getPROVEEDOR().getIdProveedor() + "','" + p.getTotal() + "')");
        } catch (Exception e){
        }finally{
            cn.desconectar();
        }
        
    }
    
    public void ActulizarInventario(Compra p) {
        Conexion cn = new Conexion();
        try{
        cn.conectar();
        cn.UID("UPDATE compra SET IdCompra='" + p.getIdCompra() + "',Fecha='" + p.getFecha() + "',IdProveedor='" + p.getPROVEEDOR().getIdProveedor() + "',Total='" + p.getTotal()+"'");
        } catch (Exception e){
            
        }finally{
            cn.desconectar();
        }
    }
  
    public void ActulizarPrecioPromedioProducto(DetalleCompra p){
        Conexion cn = new Conexion();
        try{
        cn.conectar();
        cn.UID("UPDATE detallecompra SET CodBarra='" + p.getPRODUCTO().getCodBarra() + "',Cantidad='" + p.getCantidad() +"',CostoUnitario='"+p.getCostoUnitario()+"'");
        } catch (Exception e){
            
        }finally{
            cn.desconectar();
        }
    }
     
    public ResultSet ObtenerCompra(int IdCompra)
    {   
        Conexion cn = new Conexion();
        try{
        cn.conectar();
        return( cn.getValores("SELECT IdCompra, Total FROM compra WHERE idCompra= '"+IdCompra+"'"));
        } catch (Exception e){
        cn.desconectar();
        return null;
        }
    } 
    /*      
    public ResultSet llenarTablaItem() {
        Conexion cn = new Conexion();
        return (cn.getValores("SELECT IdCompra,Fecha,IdProveedor,Total FROM compra"));
    }
    
    public ResultSet contarRegistros() {
       Conexion cn = new Conexion();
       return (cn.getValores("SELECT COUNT(IdCompra) FROM compra"));
    }

    public ResultSet mayorRegistro() {
        Conexion cn = new Conexion();
        return (cn.getValores("SELECT MAX(IdCompra) FROM compra"));
    }
    */
}
