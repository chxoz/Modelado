/**
 * Clase concreta que implementa la interfaz Planes(Strategy) y crea instancias de ThisneyPlanEspecial
 * @author Daniela Anaya Solis, Mauricio López Miranda
 * @version 1.0, Oct/2021/
 */
public class ThisneyPlanEspecial implements Planes{
    Servicio t;
    /**
     * Constructor de ThisneyPlanEspecial
     * @param thisn servicio que utilizará el método cobrar
     */
    public ThisneyPlanEspecial(Servicio thisn){
        this.t = thisn;
    }
    /**
     * método para cobrar el plan de Thisney
     * @param usuarioAppSreaming usuario a cobrar
     * @param t servicio Thisney
     */
    public void cobrar(Usuario usuarioAppStreaming, Servicio t){
        int saldoActual=usuarioAppStreaming.getSaldo();
        int meses = usuarioAppStreaming.getMesesThisney();
        int indice = t.recomendar();
        if(meses==3){
            int nuevoTiempo = meses +1;
            usuarioAppStreaming.setMesesThisney(nuevoTiempo);
            if(saldoActual>=120){
                int nuevoSaldo = saldoActual -120;
                usuarioAppStreaming.setSaldo(nuevoSaldo);
                usuarioAppStreaming.actualizar("AVISO: Hola "+usuarioAppStreaming.getNombre()+", Thisney te informa a partir del siguente mes se cobrara la tarifa completa $150, este es tu ultimo mes de $120.\nTe recomendamos ver:"+t.getRecomendaciones().get(indice)+"\n");
            }else{
                t.removerUsuario(usuarioAppStreaming);
                usuarioAppStreaming.actualizar("Thisney: Lamentamos informarte que tuvimos que suspender tu servicio por falta de pago :("+ usuarioAppStreaming.getNombre()+ "\n");
            }
        }else if (usuarioAppStreaming.getMesesThisney()>3){
            int nuevoTiempo = meses +1;
            usuarioAppStreaming.setMesesThisney(nuevoTiempo);
            if(saldoActual>=150){
                int nuevoSaldo = saldoActual -150;
                usuarioAppStreaming.setSaldo(nuevoSaldo);
                usuarioAppStreaming.actualizar("Es un gusto que sigas con nosotros, todo el equipo de Thisney te lo agradece "+usuarioAppStreaming.getNombre()+"\nTe recomendamos ver:"+t.getRecomendaciones().get(indice)+"\n");
            }else{
                t.removerUsuario(usuarioAppStreaming);
                usuarioAppStreaming.actualizar("Thisney: Lamentamos informarte que tuvimos que suspender tu servicio por falta de pago :("+usuarioAppStreaming.getNombre()+"\n");
            }
        }else if(usuarioAppStreaming.getMesesThisney()<=2){ 
            int nuevoTiempo = meses +1;
            usuarioAppStreaming.setMesesThisney(nuevoTiempo);
            if(saldoActual>=120){
                int nuevoSaldo = saldoActual -120;
                usuarioAppStreaming.setSaldo(nuevoSaldo);
                usuarioAppStreaming.actualizar("Todo el equipo de Thisney te agradece que sigas aquí, aún no termina tu promoción de $120 "+usuarioAppStreaming.getNombre()+"\nTe recomendamos ver:"+t.getRecomendaciones().get(indice)+" \n");
            }else{
                t.removerUsuario(usuarioAppStreaming);
                usuarioAppStreaming.actualizar("Thisney: Lamentamos informarte que tuvimos que suspender tu servicio por falta de pago :("+ usuarioAppStreaming.getNombre()+"\n");
            }
        }    
    }
    
}

