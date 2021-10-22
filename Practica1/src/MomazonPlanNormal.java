/**
 * Clase concreta que implementa la interfaz Planes(Strategy) y crea instancias de MomazonPlanNormal 
 * @author Daniela Anaya Solis, Mauricio López Miranda
 * @version 1.0, Oct/2021/
 */
public class MomazonPlanNormal implements Planes {
    public Servicio m;
    /**
     * Constructor de MomazonPlanNormal
     * @param mom servicio que utilizará el método cobrar
     */
    public MomazonPlanNormal(Servicio mom){
        this.m = mom;
    }
    /**
     * método para cobrar el plan normal de momazon
     * @param usuarioAppSreaming usuario a cobrar
     * @param m servicio Memeflix
     */
    @Override
    public void cobrar(Usuario usuarioAppStreaming, Servicio m){
    int saldoActual = usuarioAppStreaming.getSaldo();
    m.getRecomendaciones();
    int indice = m.recomendar();
    if(saldoActual>=120){
        int nuevoSaldo = saldoActual - 120;
        usuarioAppStreaming.setSaldo(nuevoSaldo);
        usuarioAppStreaming.actualizar("En hora buena "+usuarioAppStreaming.getNombre()+". \n en Momazon apreciamos que te quedes un mes más con nosotros con el plan normal, aquí está la reomendación del mes:"+m.getRecomendaciones().get(indice)+"\n");
    }else{
        m.removerUsuario(usuarioAppStreaming);
        usuarioAppStreaming.actualizar("Lo sentimos mucho "+usuarioAppStreaming.getNombre()+" tuvimos que darte de baja del servicio Momazon porque no tienes fondos, tu saldo actual es:"+saldoActual+"\n");
    }
    
}
}
