/**
 * Clase concreta que implementa la interfaz Planes(Strategy) y crea instancias de el plan de HVO MAX
 * @author Daniela Anaya Solis, Mauricio López Miranda
 * @version 1.0, Oct/2021/
 */
public class HvoMaxPlanEspecial implements Planes{
    Servicio h;
    /**
     * Constructor de HvoMaxPlanEspecial 
     * @param hvo servicio que utilizara el método cobrar
     */
    public HvoMaxPlanEspecial(Servicio hvo ){
        this.h=hvo;
    }
    /**
     * método para cobrar el plan de HVO MAX
     * @param usuarioAppSreaming usuario a cobrar
     * @param n servicio Memeflix
     */
    public void cobrar(Usuario usuarioAppStreaming, Servicio h){
        int saldoActual=usuarioAppStreaming.getSaldo();
        int meses = usuarioAppStreaming.getMesesHvo();
        int indice = h.recomendar();
        if(meses==3){
            int nuevoTiempo = meses +1;
            usuarioAppStreaming.setMesesHvo(nuevoTiempo);
            if(saldoActual>=0){
                int nuevoSaldo = saldoActual -0;
                usuarioAppStreaming.setSaldo(nuevoSaldo);
                usuarioAppStreaming.actualizar("AVISO: Hola "+usuarioAppStreaming.getNombre() +", HVO MAX te informa a partir del siguente mes se cobrara la tarifa completa $130, este es tu ultimo mes gratis.\nTe recomendamos ver:"+h.getRecomendaciones().get(indice)+"\n");
            }
        }else if (usuarioAppStreaming.getMesesHvo()>3){
            int nuevoTiempo = meses +1;
            usuarioAppStreaming.setMesesHvo(nuevoTiempo);
            if(saldoActual>=130){
                int nuevoSaldo = saldoActual -130;
                usuarioAppStreaming.setSaldo(nuevoSaldo);
                usuarioAppStreaming.actualizar("Gracias por seguir con la familia Hvo Max "+usuarioAppStreaming.getNombre()+"\nTe recomendamos ver:"+h.getRecomendaciones().get(indice)+"\n");
            }else{
                h.removerUsuario(usuarioAppStreaming);
                usuarioAppStreaming.actualizar("Nuestros caminos se separan, pero siempre puedes volver "+usuarioAppStreaming.getNombre()+"\nHVO Espera con ansias ese día, y no olvides traer dinero xp\n");
            }
        }else if(usuarioAppStreaming.getMesesHvo()<=2){ 
            int nuevoTiempo = meses +1;
            usuarioAppStreaming.setMesesHvo(nuevoTiempo);
            if(saldoActual>=0){
                int nuevoSaldo = saldoActual -0;
                usuarioAppStreaming.setSaldo(nuevoSaldo);
                usuarioAppStreaming.actualizar("Gracias por seguir con la familia Hvo Max "+usuarioAppStreaming.getNombre()+"\nTe recomendamos ver:"+h.getRecomendaciones().get(indice)+"\n");
            }
        }    
    }
    
}
