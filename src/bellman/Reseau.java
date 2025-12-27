package Bellman;

public class Reseau {
    public Ligne[] tab_line = new Ligne[1000];
    public int nbline = 0;

    public Reseau() {}

    public Reseau(Ligne[] t) {
        tab_line = t;
        nbline = t.length;
    }

    public void add_line(String d, String a, double p) {
        Ligne L = new Ligne(d, a, p);
        tab_line[nbline] = L;
        nbline++;
    }

    public String[] adjascence(String station) {
        String[] adj = new String[1000];
        int k = 0;
        for (int i = 0; i < nbline; i++) {
            if (tab_line[i].stdepart.equals(station)) {
                adj[k] = tab_line[i].starrivee;
                k++;
            }
        }
        return adj;
    }

    public int index(String station) {
        for (int i = 0; i < Ligne.nbstation; i++) {
            if (Ligne.tab_station[i].equals(station)) return i;
        }
        return -1;
    }

    public void afficher() {
        for (int i = 0; i < nbline; i++) {
            System.out.println(tab_line[i]);
        }
    }
}
