
package modelo;

import static java.rmi.Naming.list;
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
    
}
