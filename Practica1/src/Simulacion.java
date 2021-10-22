import java.util.LinkedList;
public class Simulacion {
    public static void main(String [] args){
        LinkedList<Usuario> historial = new LinkedList<Usuario>();

        Usuario alicia = new Usuario("Alicia",12000);
        Usuario bob = new Usuario("Bob",700);
        Usuario cesar = new Usuario("Cesar",5000);
        Usuario diego = new Usuario("Diego",7000);
        Usuario erika = new Usuario("Erika", 9000);
      
        Memeflix memeflix = new Memeflix();
        Thisney thisney = new Thisney();
        Momazon momazon = new Momazon ();
        HvoMax hvoMax = new HvoMax();
        Twitsh twitsh = new Twitsh();

        memeflix.llenarListaRecomendaciones();
        thisney.llenarListaRecomendaciones();
        momazon.llenarListaRecomendaciones();
        hvoMax.llenarListaRecomendaciones();
        twitsh.llenarListaRecomendaciones();

        System.out.println("Mes enero  de la simulación\n");
        alicia.planMemeflix = new MemeflixCuatroDispositivos(memeflix);
        alicia.setPlanMemeflix(alicia.planMemeflix);
        alicia.planMemeflix.cobrar(alicia, memeflix);
        memeflix.agregarUsuario(alicia,historial);

        alicia.planThisney = new ThisneyPlanEspecial(thisney);
        alicia.setPlanThisney(alicia.planThisney);
        alicia.planThisney.cobrar(alicia, thisney);
        thisney.agregarUsuario(alicia,historial);

        alicia.planMomazon = new  MomazonPlanPremium(momazon);
        alicia.setPlanMomazon(alicia.planMomazon);
        alicia.planMomazon.cobrar(alicia, momazon);
        momazon.agregarUsuario(alicia, historial);

        alicia.planHvoMax = new HvoMaxPlanEspecial(hvoMax);
        alicia.setPlanHvoMax(alicia.planHvoMax);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        hvoMax.agregarUsuario(alicia,historial);
    
        alicia.planTwitsh = new TwitshPlanPremium(twitsh);
        alicia.setPlanTwitsh(alicia.planTwitsh);
        alicia.planTwitsh.cobrar(alicia, twitsh);
        twitsh.agregarUsuario(alicia,historial);

        bob.planMemeflix = new MemeflixCuatroDispositivos(memeflix);
        bob.setPlanMemeflix(bob.planMemeflix);
        bob.planMemeflix.cobrar(bob, memeflix);
        memeflix.agregarUsuario(bob,historial);

        bob.planThisney = new ThisneyPlanEspecial(thisney);
        bob.setPlanThisney(bob.planThisney);
        bob.planThisney.cobrar(bob, thisney);
        thisney.agregarUsuario(bob,historial);

        bob.planMomazon = new  MomazonPlanPremium(momazon);
        bob.setPlanMomazon(bob.planMomazon);
        bob.planMomazon.cobrar(bob, momazon);
        momazon.agregarUsuario(bob, historial);

        bob.planHvoMax = new HvoMaxPlanEspecial(hvoMax);
        bob.setPlanHvoMax(bob.planHvoMax);
        bob.planHvoMax.cobrar(bob, hvoMax);
        hvoMax.agregarUsuario(bob,historial);

        bob.planTwitsh = new TwitshPlanPremium(twitsh);
        bob.setPlanTwitsh(bob.planTwitsh);
        bob.planTwitsh.cobrar(bob, twitsh);
        twitsh.agregarUsuario(bob,historial);

        diego.planMemeflix = new MemeflixDosDispositivos(memeflix);
        diego.setPlanMemeflix(diego.planMemeflix);
        diego.planMemeflix.cobrar(diego, memeflix);
        memeflix.agregarUsuario(diego, historial);
      
        diego.planMomazon = new MomazonPlanPremium(momazon);
        diego.setPlanMomazon(diego.planMomazon);
        diego.planMomazon.cobrar(diego, momazon);
        momazon.agregarUsuario(diego, historial);

        cesar.planThisney = new ThisneyPlanEspecial(thisney);
        cesar.setPlanThisney(cesar.planThisney);
        cesar.planThisney.cobrar(cesar, thisney);
        thisney.agregarUsuario(cesar,historial);

        cesar.planHvoMax = new HvoMaxPlanEspecial(hvoMax);
        cesar.setPlanHvoMax(cesar.planHvoMax);
        cesar.planHvoMax.cobrar(cesar, hvoMax);
        hvoMax.agregarUsuario(cesar,historial);

        erika.planMemeflix = new MemeflixCuatroDispositivos(memeflix);
        erika.setPlanMemeflix(erika.planMemeflix);
        erika.planMemeflix.cobrar(erika, memeflix);
        memeflix.agregarUsuario(erika,historial);

        erika.planTwitsh = new TwitshPlanNormal(twitsh);
        erika.setPlanTwitsh(erika.planTwitsh);
        erika.planTwitsh.cobrar(erika, twitsh);
        twitsh.agregarUsuario(erika,historial);

        erika.planHvoMax = new HvoMaxPlanEspecial(hvoMax);
        erika.setPlanHvoMax(erika.planHvoMax);
        erika.planHvoMax.cobrar(erika, hvoMax);
        hvoMax.agregarUsuario(erika, historial);

        System.out.println("*******************************************************************************\nMes febrero  de la simulación\n*******************************************************************************");
        
        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        bob.planMemeflix.cobrar(bob, memeflix);
        bob.planThisney.cobrar(bob, thisney);
        bob.planMomazon.cobrar(bob, momazon);
        bob.planHvoMax.cobrar(bob, hvoMax);
        bob.planTwitsh.cobrar(bob, twitsh);

        diego.planMemeflix.cobrar(diego, memeflix);
        diego.planMomazon.cobrar(diego, momazon);
    
        diego.planTwitsh = new TwitshPlanNormal(twitsh);
        diego.setPlanMomazon(diego.planTwitsh);
        diego.planMomazon.cobrar(diego, twitsh);
        twitsh.agregarUsuario(diego, historial);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        erika.planMemeflix.cobrar(erika, memeflix);
        erika.planTwitsh.cobrar(erika, twitsh);
        erika.planHvoMax.cobrar(erika, hvoMax);

        System.out.println("*******************************************************************************\nMes marzo de la simulación\n*******************************************************************************");

        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        bob.planThisney.cobrar(bob, thisney);
        bob.planHvoMax.cobrar(bob, hvoMax);

        diego.planMomazon.cobrar(diego, momazon);
        diego.anularSuscripcion(memeflix, diego);
        diego.planMomazon.cobrar(diego, twitsh);
        
        diego.planThisney = new ThisneyPlanEspecial(thisney);
        diego.setPlanThisney(diego.planThisney);
        diego.planThisney.cobrar(diego, thisney);
        thisney.agregarUsuario(diego, historial);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        erika.planMemeflix.cobrar(erika, memeflix);
        erika.planTwitsh.cobrar(erika, twitsh);
        erika.planHvoMax.cobrar(erika, hvoMax);

        System.out.println("*******************************************************************************\nMes abril de la simulación\n*******************************************************************************");

        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        bob.planHvoMax.cobrar(bob, hvoMax);

        diego.planMemeflix = new MemeflixCuatroDispositivos(memeflix);
        diego.setPlanMemeflix(diego.planMemeflix);
        diego.planMemeflix.cobrar(diego, memeflix);
        memeflix.agregarUsuario(diego,historial);        

        diego.planMomazon.cobrar(diego, momazon);        
        diego.planMomazon.cobrar(diego, twitsh);
        diego.planThisney.cobrar(diego, thisney);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        erika.planMemeflix.cobrar(erika, memeflix);
        erika.planTwitsh.cobrar(erika, twitsh);
        erika.planHvoMax.cobrar(erika, hvoMax);
        
        System.out.println("*******************************************************************************\nMes mayo de la simulación\n*******************************************************************************");

        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        diego.planMemeflix.cobrar(diego, memeflix);
        diego.planMomazon.cobrar(diego, momazon);        
        diego.planMomazon.cobrar(diego, twitsh);
        diego.planThisney.cobrar(diego, thisney);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        erika.planMomazon = new  MomazonPlanPremium(momazon);
        erika.setPlanMomazon(erika.planMomazon);
        erika.planMomazon.cobrar(erika, momazon);
        momazon.agregarUsuario(erika, historial);
        
        erika.anularSuscripcion(memeflix, erika);

        erika.planTwitsh = new TwitshPlanPremium(momazon);
        erika.setPlanTwitsh(erika.planTwitsh);
        erika.planTwitsh.cobrar(erika, twitsh);
    
        erika.planHvoMax.cobrar(erika, hvoMax);

        System.out.println("*******************************************************************************\nMes junio de la simulación\n*******************************************************************************");

        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        diego.planMemeflix.cobrar(diego, memeflix);
        diego.planMomazon.cobrar(diego, momazon);        
        diego.planMomazon.cobrar(diego, twitsh);
        diego.planThisney.cobrar(diego, thisney);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        erika.planMomazon.cobrar(erika, momazon);        
        erika.planTwitsh.cobrar(erika, twitsh);
        erika.planHvoMax.cobrar(erika, hvoMax);

        System.out.println("*******************************************************************************\nMes julio de la simulación\n*******************************************************************************");

        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        diego.planMemeflix.cobrar(diego, memeflix);
        diego.planMomazon.cobrar(diego, momazon);        
        diego.planMomazon.cobrar(diego, twitsh);
        diego.planThisney.cobrar(diego, thisney);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        erika.planMomazon.cobrar(erika, momazon);        
        erika.planTwitsh.cobrar(erika, twitsh);
        erika.planHvoMax.cobrar(erika, hvoMax);

        System.out.println("*******************************************************************************\nMes agosto de la simulación\n*******************************************************************************");

        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        diego.planMemeflix.cobrar(diego, memeflix);
        diego.planMomazon.cobrar(diego, momazon);        
        diego.planMomazon.cobrar(diego, twitsh);
        diego.planThisney.cobrar(diego, thisney);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        erika.anularSuscripcion(momazon, erika);
        erika.anularSuscripcion(twitsh, erika);
        erika.anularSuscripcion(hvoMax, erika);

        System.out.println("*******************************************************************************\nMes septiembre de la simulación\n*******************************************************************************");
        
        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        diego.planMemeflix.cobrar(diego, memeflix);
        diego.planMomazon.cobrar(diego, momazon);        
        diego.planMomazon.cobrar(diego, twitsh);
        diego.planThisney.cobrar(diego, thisney);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        erika.planMomazon.cobrar(erika, momazon);        
        erika.planTwitsh.cobrar(erika, twitsh);
        erika.planHvoMax.cobrar(erika, hvoMax);

        System.out.println("*******************************************************************************\nMes agosto de la simulación\n*******************************************************************************");

        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        diego.planMemeflix.cobrar(diego, memeflix);
        diego.planMomazon.cobrar(diego, momazon);        
        diego.planMomazon.cobrar(diego, twitsh);
        diego.planThisney.cobrar(diego, thisney);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        System.out.println("*******************************************************************************\nMes octubre de la simulación\n*******************************************************************************");

        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        diego.planMemeflix.cobrar(diego, memeflix);
        diego.planMomazon.cobrar(diego, momazon);        
        diego.planMomazon.cobrar(diego, twitsh);
        diego.planThisney.cobrar(diego, thisney);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        erika.planMomazon.cobrar(erika, momazon);        
        erika.planTwitsh.cobrar(erika, twitsh);
        erika.planHvoMax.cobrar(erika, hvoMax);

        System.out.println("*******************************************************************************\nMes agosto de la simulación\n*******************************************************************************");

        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        diego.planMemeflix.cobrar(diego, memeflix);
        diego.planMomazon.cobrar(diego, momazon);        
        diego.planMomazon.cobrar(diego, twitsh);
        diego.planThisney.cobrar(diego, thisney);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        erika.planThisney = new ThisneyPlanEspecial(thisney);
        erika.setPlanThisney(erika.planThisney);
        erika.planThisney.cobrar(erika, thisney);
        thisney.agregarUsuario(erika,historial);


        System.out.println("*******************************************************************************\nMes noviembre de la simulación\n*******************************************************************************");

        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        diego.planMemeflix.cobrar(diego, memeflix);
        diego.planMomazon.cobrar(diego, momazon);        
        diego.planMomazon.cobrar(diego, twitsh);
        diego.planThisney.cobrar(diego, thisney);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        erika.planThisney.cobrar(erika, thisney);
        System.out.println("*******************************************************************************\nMes diciembre de la simulación\n*******************************************************************************");

        alicia.planMemeflix.cobrar(alicia, memeflix);
        alicia.planThisney.cobrar(alicia, thisney);
        alicia.planMomazon.cobrar(alicia, momazon);
        alicia.planHvoMax.cobrar(alicia, hvoMax);
        alicia.planTwitsh.cobrar(alicia, twitsh);

        diego.planMemeflix.cobrar(diego, memeflix);
        diego.planMomazon.cobrar(diego, momazon);        
        diego.planMomazon.cobrar(diego, twitsh);
        diego.planThisney.cobrar(diego, thisney);

        cesar.planThisney.cobrar(cesar, thisney);
        cesar.planHvoMax.cobrar(cesar, hvoMax);

        erika.planThisney.cobrar(erika, thisney);
    }

}
