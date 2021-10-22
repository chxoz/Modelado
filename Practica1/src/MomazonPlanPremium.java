/**
 * Clase concreta que implementa la interfaz Planes(Strategy) y crea instancias de MomazonPlanPremium 
 * @author Daniela Anaya Solis, Mauricio López Miranda
 * @version 1.0, Oct/2021/
 */
public class MomazonPlanPremium implements Planes {
    public Servicio m;
    /**
     * Constructor de MomazonPlanPremium
     * @param mom servicio que utilizará el método cobrar
     */
    public MomazonPlanPremium(Servicio moma){
        this.m = moma;
    }
    /**
     * método para cobrar el plan premium de momazon
     * @param usuarioAppSreaming usuario a cobrar
     * @param m servicio Memeflix
     */
    @Override
    public void cobrar(Usuario usuarioAppStreaming, Servicio m ){
        int saldoActual = usuarioAppStreaming.getSaldo();
        int indice=m.recomendar();
        m.getRecomendaciones();
        if(saldoActual>=160){
            int nuevoSaldo = saldoActual - 160;
            usuarioAppStreaming.setSaldo(nuevoSaldo);
            usuarioAppStreaming.actualizar("En hora buena "+usuarioAppStreaming.getNombre()+".\n en Momazon apreciamos que te quedes un mes más con nosotros con el plan premium, aquí está la reomendación del mes:"+m.getRecomendaciones().get(indice)+"\n");
        }else{
            m.removerUsuario(usuarioAppStreaming);
            usuarioAppStreaming.actualizar("Lo sentimos mucho "+usuarioAppStreaming.getNombre()+" tuvimos que darte de baja del servicio Momazon porque no tienes fondos, tu saldo actual es:"+saldoActual+"\n");
        }
        
    }
}
