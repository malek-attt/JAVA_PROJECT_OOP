package Dijkstra;

public class ProgrammePrincipal{
	public static void main(String[] args) {
		Graphe g = new Graphe();
		g.ajouterArc("A", "B", 4.8);
		g.ajouterArc("A", "C", 2.0);
		g.ajouterArc("B", "C", 3.0);
		g.ajouterArc("B", "D", 10.12);
		g.ajouterArc("C", "E", 3.58);
		g.ajouterArc("E", "D", 4.0);
		g.ajouterArc("D", "F", 11.0);

		
		
		
		Dijkstra.calculer(g, "A");
		}

}
