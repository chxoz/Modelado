/**
 * Clase concreta que implementa la interfaz Planes(Strategy) y crea instancias de el plan MemeflixDosDispositivos
 * @author Daniela Anaya Solis, Mauricio López Miranda
 * @version 1.0, Oct/2021/
 */
public class MemeflixDosDispositivos implements Planes{
    Servicio n;
    /**
     * Constructor de MemeflixDosDispositivos
     * @param net servicio que utilizará el método cobrar
     */
    public MemeflixDosDispositivos(Servicio net){
        this.n=net;
    }
    /**
     * método para cobrar el plan de dos dispositivo de memeflix
     * @param usuarioAppSreaming usuario a cobrar
     * @param n servicio Memeflix
     */
    public void cobrar(Usuario usuarioAppStreaming, Servicio n){
        int saldoActual=usuarioAppStreaming.getSaldo();
        int indice = n.recomendar();
        n.getRecomendaciones();
        if(saldoActual>=150){
            int nuevoSaldo = saldoActual -150;
            usuarioAppStreaming.setSaldo(nuevoSaldo);
            usuarioAppStreaming.actualizar("Es un gusto informarte que el pago del servicio para dos dispositivo fue exitoso. \n Memeflix te agradece por un mes más con nosotros "+usuarioAppStreaming.getNombre()+"\n La recomendación de este mes es:" + n.getRecomendaciones().get(indice)+"\n");
        }else{
            n.removerUsuario(usuarioAppStreaming);
            usuarioAppStreaming.actualizar("Pago rechazado.\n Mensaje de Memeflix para ti "+usuarioAppStreaming.getNombre()+ "\nEres basura Brok\n");
        }

    }
}

