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

    
}
