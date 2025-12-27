package Dijkstra;

public class Arc {
	public String depart;
	public String arrivee;
	public double poids;
	public Arc(String d,String a, double p) {
	depart = d;
	arrivee = a;
	poids = p;
	}
	@Override
	public String toString() {
	return depart + " -> " + arrivee + " : " + poids;
	}

}
