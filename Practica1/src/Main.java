import java.util.LinkedList;
public class Main {
    public static void main(String [] args){
        LinkedList<String> planes = new LinkedList<String>();
        LinkedList<Usuario> usuarios = new LinkedList<Usuario>();
        LinkedList<Usuario> historial = new LinkedList<>();
        LinkedList<String> recomendaciones = new LinkedList<String>();
        Momazon m = new Momazon();
        //Momazon m = new Momazon(usuarios, historial, recomendaciones, planes);
        m.llenarListaPlanes();
        Memeflix n= new Memeflix(usuarios,historial,recomendaciones,planes);
        n.llenarListaPlanes();
        
        System.out.println("esta es la lista de momazon:"+m.getListaPlanes());
        Usuario u1 = new Usuario("Diego", 1200 );
        Usuario u2 = new Usuario("Mau",700);
        n.agregarUsuario(u1, historial);
        m.agregarUsuario(u1, historial );
        m.agregarUsuario(u2, historial);
        System.out.println("historial:" + m.getHistorial());
        m.asignarPlan("Plan Normal", u1);
        u2.establecerPlanes("Plan Premium");
        System.out.println("tipo de plan:"+u2.getPlanes());
        System.out.println("tipo de plan de diego:"+u1.getPlanes());
        System.out.println("historial:" + n.getHistorial());
        System.out.println("Saldo de diego:"+u1.getSaldo());
        System.out.println("usuarios:"+ m.getUsuarios());
        System.out.println("usuarios:"+ n.getUsuarios());
        u1.anularSuscripccion(m, u1);
        System.out.println("lista de usuarios de momazon"+m.getUsuarios());
    }
}
