/**
 * interfaz Planes que usaremos para implementar diferentes estrategias para cobrar
 * @author Daniela Anaya Solis, Mauricio López Miranda
 * @version 1.0, Oct/2021/
 */
public interface Planes {
    /**
     * método que hará el cobro con diferentes estrategias dependiendo del servicio
     * de streaming y el plan del servicio
     * @param usuarioAppStreaming
     * @param dinero
     */
    public void cobrar(Usuario usuarioAppStreaming, Servicio m);
}
