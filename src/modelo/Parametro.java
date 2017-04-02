
package modelo;

import controlador.Conexion;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

public class Parametro {
    
    private String IdParamatro;
    private String Nombre;
    private String Valor;
    
    
    public Parametro(){
    
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
    
    public static void obtener(){
    Conexion cn = new Conexion();
        try{
        cn.conectar();
        cn.UID("SELECT * FROM parametro");
        
        //Parametro prm = new Parametro();//creamos el objeto persona
        //ArrayList<Parametro> arrayList;
        //arrayList = new ArrayList<Parametro>();
        } catch (Exception e){
             
        }finally{
            cn.desconectar();
        }
    
    }
    
    public static Parametro obtenerUtilidad(){
     Conexion cn= new Conexion();
     Parametro prm = new Parametro();

     try {
           cn.conectar();
           cn.UID("SELECT precio from producto WHERE");
           prm.setValor(0.05);
           //// calcular la utilidad, que metodo usar?
           cn.desconectar();
        } catch (Exception e) {
        
        
        }finally{
        
        
        }
    return prm;
    }

    private void setValor(double d) {
         
    }
    
}
