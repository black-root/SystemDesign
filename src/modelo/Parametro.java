
package modelo;

import controlador.Conexion;
import controlador.ErrorTienda;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Parametro {
    
    private String IdParamatro;
    private String Nombre;
    private String Valor;
    
    public Parametro(){
    
    }
    public Parametro(int id, String n, String v){
    
    }

    public String getIdParamatro() {
        return IdParamatro;
    }

    public void setIdParamatro(String IdParamatro) {
        this.IdParamatro = IdParamatro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    
    public static List<Parametro> Obtener() throws Exception {
    Conexion cn = new Conexion();
     List<Parametro> Lista = new ArrayList<>();
        try{
        cn.conectar();           
            ResultSet rs = cn.getValores("SELECT * FROM parametro");
            while (rs.next()) {
                int id = rs.getInt("idParametro");
                String n = rs.getString("Nombre");
                String v = rs.getString("Nombre");
                Parametro user = new Parametro(id, n, v);
                Lista.add(user);
            }
        } catch (SQLException e){
             throw new ErrorTienda("se pordujo un error al obtener los parametros");
        }finally{
            cn.desconectar();
        }
       return Lista; 
    }
    
    public static Parametro obtenerUtilidad() throws Exception{
     Conexion cn= new Conexion();
     Parametro prm = new Parametro();
     String datos[] = new String[1];
     try {
           cn.conectar();
          String  idProducto = null;
           ResultSet rsParametro = null;
           rsParametro = cn.getValores("SELECT valor FROM parametro WHEN Nombre  IS utilidad ");
           String valor=rsParametro.getString(1);
           prm.setValor(valor);
           cn.desconectar();
        } catch (SQLException e) {
        throw new ErrorTienda("se produjo un error al obtener la utilidad");
        
        }finally{
        cn.desconectar();
        
        }
    return prm;
    }
    
}
