import java.util.ArrayList;
/**
 * Servicio va a tener los métodos de una aplicación de streaming, que serán
 * implementados en clases en clases concretas
 * @authors Daniela Anaya Solis, Mauricio López Miranda  
 * @version 1.0, Oct/2021/
 */
public interface Servicio {
    /**
     * agregaUsuario toma un usuario y verifica si este está en la lista historial,
     * si lo está mandará una notificación de "bienvenido de vuelta", si no lo está
     * mandará "Bienvenido a @service"
     * @param u es una instancia de la clase Usuario
     * @param h es una lista de Usuarios
     */
    public void agregarUsuario(String u);
    /**
     * 
     * @param u es una instancia de la clase Usuario
     * @param h es una lista de Usuarios
     */
    public void removerUsuario();
}
