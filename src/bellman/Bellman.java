package Bellman;

public class Bellman {

    public static void main(String[] args) {

        Reseau res = new Reseau();

        res.add_line("A", "B", 4.8);
        res.add_line("A", "C", 2.0);
        res.add_line("B", "C", 3.0);
        res.add_line("B", "D", 10.12);
        res.add_line("C", "E", 3.58);
        res.add_line("E", "D", 4.0);
        res.add_line("D", "F", 11.0);

        res.afficher();
        int n = Ligne.nbstation;
        double[] dist = new double[n];
        String[] pred = new String[n];
        for (int i = 0; i < n; i++) {
            dist[i] = Double.MAX_VALUE;
            pred[i] = null;
        }
        dist[res.index("A")] = 0.0;
        for (int k = 0; k < n - 1; k++) {
            for (int i = 0; i < res.nbline; i++) {
                Ligne L = res.tab_line[i];
                int u = res.index(L.stdepart);
                int v = res.index(L.starrivee);

                if (dist[u] != Double.MAX_VALUE &&
                    dist[v] > dist[u] + L.getPoids()) {
                    dist[v] = dist[u] + L.getPoids();
                    pred[v] = L.stdepart;
                }
            }
        }
        System.out.println("\n Tableau dist :");
        for (int i = 0; i < n; i++) {
            System.out.println(Ligne.tab_station[i]+" : " +dist[i]);
        }

        System.out.println("\nTableau pred :");
        for (int i=0; i < n; i++) {
            System.out.println(Ligne.tab_station[i]+ " : " + pred[i]);
        }
    }
}
