import java.util.LinkedList;
import java.util.Random;
/**
 * Clase concreta que implementa la interfaz Servicio(Observable) y es la clase del servicio Twitsh
 * @author Daniela Anaya Solis, Mauricio López Miranda
 * @version 1.0, Oct/2021/
 */
public class Twitsh implements Servicio {
    public LinkedList<Usuario> usuarios;
    public LinkedList<Usuario> historial;
    public LinkedList<String> recomendaciones;
    /**
     * Constructor de la clase Twitsh que no recibe nada, pero inicializa los parámetros
     */
    public Twitsh(){
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
            System.out.println("¡Bienvenido a Twitsh, "+agrePersona.getNombre()+"!"+" \n Esperamos que yutu morado sea de tu agrado\n");
        }else{
        for(i=0; i<cantidadUsuarios-1; i++){
            if(hisUsuarios.get(i)==agrePersona){
                usuarios.add(agrePersona);
                historial.add(agrePersona);
                System.out.println("Bienvenido devuelta a yutu morado+!"+agrePersona.getNombre()+"\n");
            }
        }
        usuarios.add(agrePersona);
        historial.add(agrePersona);
        System.out.println("¡Bienvenido a Twitsh, "+agrePersona.getNombre()+"!"+" \n Esperamos que yutu morado sea de tu agrado\n");
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
    * que llena una lista con recomendaciones de streamers de Twitsh
    */
    @Override
    public void llenarListaRecomendaciones(){
        String enero = "Ibai";
        String febrero = "Ari Gameplays";
        String marzo = "Rubius";
        String abril = "Soy Fercha";
        String mayo = "Auronplay";
        String junio =  "JuansGuarnizo";
        String julio = "Ninja";
        String agosto = "TheGrefg";
        String septiembre = "Pokimane";
        String octubre = "Summit1g";
        String noviembre = "Alanzoka";
        String diciembre = "Mistica Hinojosa";
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
    public LinkedList<String> getRecomendaciones() {
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
