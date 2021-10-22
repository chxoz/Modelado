import java.util.LinkedList;
import java.util.Random;

/**
 * Clase concreta que implementa la interfaz Servicio y es la clase del servicio Memeflix
 * @author Daniela Anaya Solis, Mauricio López Miranda
 * @version 1.0, Oct/2021/
 */
public class Momazon implements Servicio{
    public LinkedList<Usuario> usuarios;
    public LinkedList<Usuario> historial;
    public LinkedList<String> recomendaciones;

    /**
     * Constructor de la clase momazon donde inicializamos las listas que recibe la clase como parametro
     */
    public Momazon(){
        this.usuarios = new LinkedList<Usuario>();
        this.historial = new LinkedList<Usuario>();
        this.recomendaciones = new LinkedList<String>();
    }
    
    /**
     * Sobreescritura del método agregarUsuario de la interfaz Servicio(Observable)
     * @param agrePersona usuario a agregar
     * @param hisUsuario lista que nos ayudará a saber si ya han estado suscritos anteriormente
     */
    @Override
    public void agregarUsuario(Usuario agrePersona, LinkedList<Usuario> hisUsuarios) {
        int cantidadUsuarios = usuarios.size();
        int i;
        if(hisUsuarios.size()==0){
            usuarios.add(agrePersona);
            historial.add(agrePersona);
            System.out.println("Ya está todo listo para que comiences a disfrutar la experiencia, \n¡Bienvenido a Momazon " +agrePersona.getNombre()+ "!\n");
        }else{
        for(i=0; i<cantidadUsuarios-1; i++){
            if(hisUsuarios.get(i)==agrePersona){
                usuarios.add(agrePersona);
                historial.add(agrePersona);
                System.out.println("Que bueno que regresaste "+agrePersona.getNombre()+"\n Nos encanta tener novedades de ti.\n");
            }
        }
        usuarios.add(agrePersona);
        historial.add(agrePersona);
        System.out.println("Ya está todo listo para que comiences a disfrutar la experiencia, \n¡Bienvenido a Momazon " +agrePersona.getNombre()+ "!\n");
    }
    }

    /**
     * Sobreescritura del método removerUsuario de la interfaz Servicio(Observable)
     * @param remPersona usuario que se eliminara de la lista usuarios
     */
    @Override
    public void removerUsuario(Usuario remPersona) {
        usuarios.remove(remPersona);    
    }

    /**
    * Sobreescritura del método llenarListaRecomendaciones de la interfaz Servicio(Observable)
    * que llena una lista con recomendaciones de peliculas y series del servicio Momazon
    */
    @Override
    public void llenarListaRecomendaciones(){
        String enero = "The Office";
        String febrero="Backdoor";
        String marzo= "Joker";
        String abril= "Modern  Love";
        String mayo = "Dr. House";
        String junio = "Cenicienta";
        String julio = "The Good Doctor";
        String agosto= "Mean Girls";
        String septiembre= "El juego de las llaves";
        String octubre= "De viaje con los Derbez";
        String noviembre= "Amar te  duele"; 
        String diciembre = "El  niño de Medellín";
        recomendaciones.add(enero);
        recomendaciones.add(febrero);
        recomendaciones.add(marzo);
        recomendaciones.add(abril);
        recomendaciones.add(mayo);
        recomendaciones.add(junio);
        recomendaciones.add(julio);
        recomendaciones.add(agosto);
        recomendaciones.add(septiembre);
        recomendaciones.add(octubre);
        recomendaciones.add(noviembre);
        recomendaciones.add(diciembre); 
        
    }
    /**
     * Sobreescritura del método getRecomendaciones de la interfaz Servicio(Observable)
     * que sirve como auxiliar en el método cobrar de las clases que implementan la interfaz Planes
     * para poder hacer recomendaciones
     * @return lista con las recomendaciones de cada clase
     */
    @Override
    public LinkedList<String> getRecomendaciones(){
        return recomendaciones;
    }


    /**
     * Sobreescritura del método recomendar de la interfaz Servicio(Observable)
     * que sirve de axiliar para el metodo get de las listas ligadas
     * @return indice aleatorio de 1 al tamaño de la lista
     */
    @Override
    public int recomendar(){
        Random rec = new Random();
        int iAleatoria = rec.nextInt(recomendaciones.size());
        return iAleatoria;
    }
    
}

