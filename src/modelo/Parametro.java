
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

    /**
     * @return the IdParamatro
     */
    public String getIdParamatro() {
        return IdParamatro;
    }

    /**
     * @param IdParamatro the IdParamatro to set
     */
    public void setIdParamatro(String IdParamatro) {
        this.IdParamatro = IdParamatro;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Valor
     */
    public String getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    
    public static List<Parametro> Obtener() throws Exception {
    Conexion cn = new Conexion();
     List<Parametro> Lista = new ArrayList<>();
        try{
        cn.conectar();
           
            ResultSet rs = cn.getValores("SELECT * FROM parametro");

// Fetch each row from the result set
            while (rs.next()) {
                int id = rs.getInt("idParametro");
                String n = rs.getString("Nombre");
                String v = rs.getString("Nombre");
                //Assuming you have a user object
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
           rsParametro = cn.getValores("SELECT valor FROM parametro WHEN Nombre 'utilidad' ");
           String valor=rsParametro.getString(1);
           prm.setValor(valor);
           //// calcular la utilidad, que metodo usar
           cn.desconectar();
        } catch (SQLException e) {
        throw new ErrorTienda("se produjo un error al obtener la utilidad");
        
        }finally{
        cn.desconectar();
        
        }
    return prm;
    }

    private void setValor(double d) {
         
    }
    
}
