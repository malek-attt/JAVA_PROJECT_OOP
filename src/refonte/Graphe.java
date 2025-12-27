package Dijkstra;

public class Graphe {
	public Arc[] arcs=new Arc[1000];
	public int nbArcs =0;
	public String[] stations= new String[1000];
	public int nbStations =0;

	public void ajouterStation(String nom) {
	if (indiceStation(nom)!=-1) return;
	stations[nbStations++]=nom;}
	public void ajouterArc(String d,String a,double p) {
	ajouterStation(d);
	ajouterStation(a);
	arcs[nbArcs++] = new Arc(d,a, p);
	}


	public int indiceStation(String nom) {
	for (int i=0; i< nbStations;i++)
	if (stations[i].equals(nom)) return i;
	return -1;
	}

}
