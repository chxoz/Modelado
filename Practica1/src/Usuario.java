import java.util.LinkedList;

/**
 * Usuario va a devolver una instancia usuario con un nombre, un saldo, 
 * una lista de servicios ......................................................
 * @authors Daniela Anaya Solis, Mauricio López Miranda
 * @version 1.0, Oct/2021/
 */
public class Usuario implements Observador {
public Usuario usuario;
public String nombre;
public Servicio servicio;
public LinkedList<String> recomendaciones;
public LinkedList<Servicio> servicios;
public int saldo;
public LinkedList<String> planesDeServicios;
/**
 * Constructor de la clase
 * @param n
 * @param s
 */
public Usuario(String n, int s){
    this.nombre=n;
    this.saldo=s;
    this.recomendaciones= new LinkedList<String>();
    this.servicios = new LinkedList<Servicio>();
    this.planesDeServicios = new LinkedList<String>();
    }

@Override
public void actualizar(){
    int i;
    for(i=0;i<recomendaciones.size();i++){
    //recomendaciones;
    }
}
/**
 * Método get que obtiene una lista de servicios a los que está suscrito el usuario 
 * @return lista de sevicios de cada usuario
 */
public LinkedList<Servicio> getServicios(){
    return servicios; 
} 
/**
 * Método get que obtiene las recomendacioes del servicio
 * @return recomendaciones
 */
public LinkedList<String> getRecomendaciones(){
    return recomendaciones;
}
/**
 * Método get que obtiene el nombre del Usiario
 * @return nombre del usuario
 */
public String getNombre(){
    return nombre;
}
/**
 * Método get que obtiene el saldo del usuario
 * @return un entero que representa el dinero del usuario
 */
public int getSaldo(){
    return saldo;
}
/**
 * Método set para asignar el nombre del usuario
 * @param nomPersona nombre del usuario
 */
public void setNombre(String nomPersona){
    nombre = nomPersona;
}
/**
 * Método set para asignar el dinero del que dispone el usuario
 * @param dineroDispoible saldo del usuario
 */
public void setSaldo(int dineroDispoible){
    saldo = dineroDispoible;
}
/**
 * Método get que obtine el tipo de plan del usuario
 * @param plan
 * @return
 */
public LinkedList<String> getPlanes(){
    return planesDeServicios;
}
public void establecerPlanes(String plan){
    planesDeServicios.add(plan); 
}
/**
 * Cada que termine un mes de la sumulación se mandará una recomendación
 */
public void actualizarRecomendaciones(){
    
}
/**
 * Recibe un servicio y anula la suscripcción
 * @param appStreaming es un servicio de streaming(memeflix, momazon, HVO)
 */
public void anularSuscripccion(Servicio appStreaming, Usuario u){
    this.usuario=u;
    this.servicio = appStreaming;
    LinkedList<Servicio> servicios = new LinkedList<Servicio>();
    servicios.remove(appStreaming);
    appStreaming.removerUsuario(u);
}

}
