import java.util.LinkedList; 
/**
 * Clase concreta que implementa la interface Servicio y es la clase del servicio Memeflix
 * @author Daniela Anaya Solis, Mauricio López Miranda
 * @version 1.0, Oct/2021/
 */
public class Memeflix implements Servicio{
    public LinkedList<Usuario> usuarios;
    public LinkedList<Usuario> historial;
    public LinkedList<String> recomendaciones;
    //public tipo  cobrador 
    public LinkedList<String> planes;
    public Memeflix(LinkedList<Usuario> u,LinkedList<Usuario> h, LinkedList<String> r,LinkedList<String> p){
        this.usuarios=u;
        this.historial=h;
        this.recomendaciones=r;
        this.planes=p;
    }
    public Memeflix(){
        this.usuarios = new LinkedList<Usuario>();
        this.historial = new LinkedList<Usuario>();
        this.recomendaciones = new LinkedList<String>();
        this.planes = new LinkedList<String>();
    }
    /**
     * Sobreescritura del método agregarUsuario de la interface Servicio
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
            System.out.println("Gracias por confiarnos tu tiempo de ocio, ¡Bienvenido a Memeflix "+agrePersona.getNombre()+"!");
        }else{
        for(i=0; i<cantidadUsuarios-1; i++){
            if(hisUsuarios.get(i)==agrePersona){
                usuarios.add(agrePersona);
                System.out.println("Bienvenido devuelta a Memeflix!"+agrePersona.getNombre()+", te echamos de menos UnU ");
            }
        }
        usuarios.add(agrePersona);
        historial.add(agrePersona);
        System.out.println("Gracias por confiarnos tu tiempo de ocio, ¡Bienvenido a Memeflix "+agrePersona.getNombre()+"!");
        }
    }
    /**
     * Sobreescritura del método removerUsuario de la interface Servicio
     * @param remPersona usuario que se eliminara de la lista usuarios
     */
    @Override
    public void removerUsuario(Usuario remPersona) {
        usuarios.remove(remPersona);    
    }
    /**
     * Método cobrar recibe dos parametros para restarlos y actualizar el saldo del usuario
     * @param usuarioMemeflix usuario a cobrar
     * @param CostoDelPlan costo del plan de suscripción 
     */
    public void cobrar( Usuario usuarioMemeflix, int CostoDelPlan){
        int saldoActual = usuarioMemeflix.getSaldo();
        int nuevoSaldo = saldoActual - CostoDelPlan;
        usuarioMemeflix.setSaldo(nuevoSaldo);
    }
    @Override
    public void llenarListaPlanes(){
        String planUnDispositivo = "Un Dispositivo";
        String planDosDispositivos = "Dos Dispositivos";
        String planTresDispositivos = "Tres Dispositivos";
        planes.add(planUnDispositivo);
        planes.add(planDosDispositivos);
        planes.add(planTresDispositivos);
    }
     
    /*public int cobrador(LinkedList<String> planes, Usuario usuarioMemeflix){
        int numero=0;
        switch (numero) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
*/
    @Override
    public void asignarPlan(String plan, Usuario usuarioMemeflix){
        usuarioMemeflix.establecerPlanes(plan);
    }
    @Override
    public void CancelarSuscripcion(Usuario us){

    }
    public LinkedList<Usuario> getHistorial(){
        return historial;
    }
    public LinkedList<Usuario> getUsuarios(){
        return usuarios;
    }
}
