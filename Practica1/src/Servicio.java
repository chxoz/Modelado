import java.util.LinkedList;
/**
 * interfaz servicio es el observable (sujeto) del patron Observer
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
     * @param persona es una instancia de la clase Usuario
     * @param hisUsuarios es una lista de Usuarios para saber si ya han estado registrados 
     */
    public void agregarUsuario(Usuario agrePersona, LinkedList<Usuario> hisUsuarios);
    /**
     * removerUsuario toma un usuario y lo quita de la lista de usuarios(consumidores) de cada servicio 
     * @param remPersona es una instancia de la clase Usuario
     */
    public void removerUsuario(Usuario remPersona);
    /**
     * Método que obtiene la lista de recomendaciones de cada apliación de streaming
     * @return lista de recomendaciones
     */
    public LinkedList<String> getRecomendaciones();
    
    /**
     * Método para automatizar el llenado de las recomendaciones de los servicios
     */
    public void llenarListaRecomendaciones();
    /**
     * Método para poder usar el método .get(index) de LinkedList con un indice aleatorio
     * @return int i que es un indice aleatorio
     */
    public int recomendar();
}
