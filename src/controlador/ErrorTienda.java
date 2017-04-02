package controlador;

/**
 *
 * @author yisus
 */
public class ErrorTienda extends Exception{
    private String CondicionDeError;

    public ErrorTienda(String msg) {
        super(msg);
    }
    
   public String exceptionSinProducto(){
        return "Se provoco la condicion de erro ya que el producto no esta disponible";
    }
   public String exceptionNoEncontrado(){
        return "No se encuentra el producto registrado en la base";
    }
   public String exceptionYaRegistrado(String param){
        return "El "+param+ "ya esta registrado";
    }
    
}
