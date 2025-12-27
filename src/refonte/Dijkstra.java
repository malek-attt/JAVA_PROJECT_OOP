package Dijkstra;

public class Dijkstra {
	public static void calculer(Graphe g, String source) {
		int n=g.nbStations;
		double[] dist=new double[n];
		String[] pred=new String[n];
		boolean[] visite=new boolean[n];
		for (int i=0; i < n; i++) {
		dist[i] = Double.MAX_VALUE ;
		pred[i] = null;
		visite[i] = false;
		}
		int src=g.indiceStation(source);
		dist[src]=0.0;
		for (int k=0; k < n; k++) {
		int u = -1;
		double minDist = Double.MAX_VALUE ;
		for (int i = 0; i < n; i++) {
		if (!visite[i] && dist[i] < minDist) {
		minDist = dist[i];
		u = i;
		}
		}
		if (u== -1)break;visite[u]= true;
        
		for (int i=0; i< g.nbArcs;i++) {
		Arc arc = g.arcs[i];
		if (g.stations[u].equals(arc.depart)) {
		int v = g.indiceStation(arc.arrivee);
		if (dist[u] + arc.poids < dist[v]) {
		dist[v] = dist[u] + arc.poids;
		pred[v] = arc.depart;}}}
		}
		System.out.println("Distances depuis " + source + " :");
		for (int i = 0; i < n; i++)
		System.out.println(g.stations[i] + " = " + dist[i]);


		System.out.println("Prédécesseurs :");
		for (int i=0; i < n; i++)
		System.out.println( pred[i]+" <- "+g.stations[i]);
		}

}
