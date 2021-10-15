import java.util.LinkedList;
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
     * asignarPlan método que se sobreercribirá en cada clase de las apps de streaming
     * para asignar los planes de los usuarios
     * @param plan plan de algún servicio de streaming
     * @param usuarioDeCadaServicio usuario que contrato el servicio
     */
    public void asignarPlan(String plan, Usuario usuarioDeCadaServicio);
    public void llenarListaPlanes();
    public void CancelarSuscripcion(Usuario u);
}
