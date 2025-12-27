package Bellman;

public class Ligne {
    static String[] tab_station = new String[1000];
    static int nbstation = 0;
    public String stdepart;
    public String starrivee;
    private double poids;
    public Ligne(String depart, String arrivee, double poids) {
        this.stdepart = depart;
        this.starrivee = arrivee;
        this.poids = poids;
        if (!existe(depart)) {
            tab_station[nbstation] = depart;
            nbstation++;
        }
        if (!existe(arrivee)) {
            tab_station[nbstation] = arrivee;
            nbstation++;
        }
    }
    private static boolean existe(String station) {
        for (int i = 0; i < nbstation; i++) {
            if (tab_station[i].equals(station)) {
                return true;
            }
        }
        return false;
    }

    public String getStdepart() { return stdepart; }
    public String getStarrivee() { return starrivee; }
    public double getPoids() { return poids; }
    public void setStdepart(String stdepart) { this.stdepart = stdepart; }
    public void setStarrivee(String starrivee) { this.starrivee = starrivee; }
    public void setPoids(double poids) { this.poids = poids; }

    public String toString() {
        int minutes = (int) poids;
        int secondes = (int) ((poids - minutes) * 100);
        return "Pour aller de station \"" + stdepart + "\" à la station \"" + 
               starrivee + "\" compter " + minutes + " minutes et " + 
               secondes + " secondes.";
    }
}
