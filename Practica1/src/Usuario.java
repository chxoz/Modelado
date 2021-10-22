import java.util.LinkedList;
/**
 * Usuario va a devolver una instancia usuario 
 * @authors Daniela Anaya Solis, Mauricio López Miranda
 * @version 1.0, Oct/2021/
 */
public class Usuario implements Observador {
    public Usuario usuario;
    public String nombre;
    public String mensaje;
    public Servicio servicio;
    public LinkedList<String> recomendaciones;
    public int saldo;
    public int mesesHvoMax;
    public int mesesThisney;

    public Planes planMemeflix;
    public Planes planMomazon;
    public Planes planThisney;
    public Planes planHvoMax;
    public Planes planTwitsh;
    /**
     * Constructor de la clase que recibe el nombre y el dinero e inicializa las listas de la clase
     * @param nombreUsuario nombre del usuario
     * @param saldoUsuario dinero del usuario
     */
    public Usuario(String nombreUsuario, int saldoUsuario){
    this.nombre=nombreUsuario;
    this.saldo=saldoUsuario;
    this.recomendaciones= new LinkedList<String>();
    this.mesesHvoMax=1;
    this.mesesThisney=1;
    }
    /**
     * Sobreescritura del método actualizar de la interfaz Observador que nos ayudará para imprimir
     * una notificación  
     * @param informacion mensaje a poner como notificación
     */
    @Override
    public void actualizar(String informacion){
    mensaje = informacion;
    System.out.println( mensaje); 
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
     * Método get que obtiene el tiempo en meses que ha usado un servicio
     * @return tiempo que ha estado en Thisney+
     */
    public int getMesesThisney(){
        return mesesThisney;
    }
    /**
     * Método get que obtiene el saldo del usuario
     * @return un entero que representa el dinero del usuario
     */
    public int getSaldo(){
        return saldo;
    }
    /**
     * Método get que obtiene el tiempo en meses que ha usado un servicio
     * @return tiempo que ha estado en HvoMax
     */
    public int getMesesHvo(){
        return mesesHvoMax;
    }
    /**
     * Método set para asignar el numero de meses que lleva el usuario del servicio
     * @param thisn número de meses en Thisney+
     */
    public void setMesesThisney( int thisn){
        mesesThisney = thisn;
    }
    /**
     * Método set para asignar el numero de meses que lleva el usuario del servicio
     * @param hvo número de meses en HVO MAX
     */
    public void setMesesHvo(int hvo){
        mesesHvoMax=hvo;
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
    public void setSaldo(int dineroDisponible){
        saldo = dineroDisponible;
    }
    
    /**
     * Recibe un servicio y un usario para anular la suscripcción
     * @param appStreaming es un servicio de streaming(memeflix,momazon,HVO,Thisney+,Twitsh)
     * @param u usuario que desea anular la suscripción 
     */
    public void anularSuscripcion(Servicio appStreaming, Usuario u){
        this.usuario=u;
        this.servicio = appStreaming;
        LinkedList<Servicio> servicios = new LinkedList<Servicio>();
        servicios.remove(appStreaming);
        appStreaming.removerUsuario(u);
        System.out.println(u.getNombre()+" La suscripción fue anulada correctamente");
    }

    /**
     * Método set para asignar el tipo de plan asociado al servicio memeflix
     * @param plan puede ser una instancia de MemeflixUnDispositivo,MemeflixDosDispositivos,MemeflixCuatroDispositivos
     */
    public void setPlanMemeflix(Planes plan){
        this.planMemeflix = plan;
    }
    /**
     * Método set para asignar el tipo de plan asociado al servicio Momazon
     * @param plan puede ser una instancia de MomazonPlanNormal,MomazonPlanPremium
     */
    public void setPlanMomazon(Planes plan){
        this.planMomazon = plan;
    }
    /**
     * Método set para asignar el tipo de plan asociado al servicio Thisney+
     * @param plan puede ser una instancia de ThisneyPlanEspecial
     */
    public void setPlanThisney(Planes plan){
        this.planThisney = plan;
    }
    /**
     * Método set para asignar el tipo de plan asociado al servicio HVO MAX
     * @param plan puede ser una instancia de HvoMaxPlanEspecial
     */
    public void setPlanHvoMax(Planes plan){
        this.planHvoMax = plan;
    }
    /**
     * Método set para asignar el tipo de plan asociado al servicio Twitsh
     * @param plan puede ser una instancia de TwitshPlanNormal,TwitshPlanPremium
     */
    public void setPlanTwitsh(Planes plan){
        this.planTwitsh = plan;
    }
}
