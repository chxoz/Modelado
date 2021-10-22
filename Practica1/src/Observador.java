/**
 * interfaz Observador para implementar el patron de diseño Observer
 * @authors Daniela Anaya Solis, Angel Mauricio López Miranda
 * @version 1.0 Oct/2021/
 */
public interface Observador {
    /**
     * método que se sobreescribirá en Usuario para para actualizar las notificiones
     * @param informacion mensaje que se imprimirá en la consola
     */
    public void actualizar(String informacion);
    
}
