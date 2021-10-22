/**
 * Clase concreta que implementa la interfaz Planes(Strategy) y crea instancias de TwitshPlanNormal
 * @author Daniela Anaya Solis, Mauricio López Miranda
 * @version 1.0, Oct/2021/
 */
public class TwitshPlanNormal implements Planes {
    public Servicio tw;
    /**
     * Constructor de TwitshPlanNormal
     * @param twit servicio que utilizará el método cobrar
     */
    public TwitshPlanNormal(Servicio twit){
        this.tw = twit;
    }
    /**
     * método para cobrar el plan normal de Twitsh
     * @param usuarioAppSreaming usuario a cobrar
     * @param tw servicio Memeflix
     */
    @Override
    public void cobrar(Usuario usuarioAppStreaming, Servicio tw){
    int saldoActual = usuarioAppStreaming.getSaldo();
    tw.getRecomendaciones();
    int indice = tw.recomendar();
    if(saldoActual>=60){
        int nuevoSaldo = saldoActual - 60;
        usuarioAppStreaming.setSaldo(nuevoSaldo);
        usuarioAppStreaming.actualizar("Gracias "+usuarioAppStreaming.getNombre()+". \n Twitsh está de fiesta porque sigues nosotros con el plan normal, el equipo te recomienda:"+ tw.getRecomendaciones().get(indice)+"\n");
    }else{
        tw.removerUsuario(usuarioAppStreaming);
        usuarioAppStreaming.actualizar("Como así "+usuarioAppStreaming.getNombre()+" :c, lamentamos noticarte que tuvimos que cancelar tu suscripción a Twitsh por falta de pago \n");
    }
        
    }
}
