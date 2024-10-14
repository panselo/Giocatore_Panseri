package giocatore;

public class Funzioni {

    public static void aggiuntaGiocatore(Giocatore[] g, String nomeNuovo, int goalNuovo, String capitanoNuovo, int indice){

        g[indice] = new Giocatore();

    }

    public static String visualizzaGiocatori (Giocatore [] g, int indice){

        String s = "";
        for (int i = 0; i<indice; i++){
            s = s + g[indice].getNome() + " " + g[indice].getGoal() + " " + g[indice].getCapitano() + "\n";
        }
        return s;

    }

    public static void modificaGiocatore(Giocatore[] g, String nomeNuovo, int goalNuovo, String capitanoNuovo, int indice){

        g[indice].setNome(nomeNuovo);
        g[indice].setGoal(goalNuovo);
        g[indice].setCapitano(capitanoNuovo);

    }
}
