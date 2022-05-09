package metier;

import java.util.ArrayList;
import java.util.List;


import dao.AdjacentsDao;
import dao.VilleDao;



public class AppllicationAstar {
	
	public List<Node> applicationAstar(Ville vdepart,Ville vDariver){
		Node nd =convertToNode(vdepart.getNomville(), vDariver);
		Node na =convertToNode(vDariver.getNomville(), vDariver);
	
		Node narriver = AstarSearchAlgo.AstarSearch(nd, na);
		
		List<Node> path = AstarSearchAlgo.printPath(narriver);

		//System.out.println("Path: " + path);
		return path;
		
	}
	//convertaire ville en Node
	public Node convertToNode(String nomv,Ville arriver) {
		float horestique;
		Ville v =new Ville();
		VilleDao dao = new VilleDao();
		v =dao.getVille(nomv);
		Houristique h =new Houristique();
		horestique = h.calculHoristique(v, arriver);
		Node n = new Node(v.getNomville(), horestique);
		return n;
	}
	//ajouter les adjacents dans la node
	public void ajoutezAdjacents(Node n,Ville arriver) {
		AdjacentsDao a = new AdjacentsDao();
		List<Adjacents> adjacents =new ArrayList<Adjacents>();
		List<Node> ns = new ArrayList<Node>();
		adjacents = a.adjacent(n.value);
		
		for(int i =0;i<adjacents.size();i++) {
			ns.add(convertToNode(adjacents.get(i).getVilleB(), arriver));
		}
		n.adjacencies = new Edge[adjacents.size()];
		for(int i=0;i<adjacents.size();i++) {
			n.adjacencies[i] = new Edge(ns.get(i),adjacents.get(i).getDistance());
		}
	}

	public List<String> axtrairaVille(List<Node> nodes) {
		List<String> villes = new 	ArrayList<String>();
		for(int i=0;i<nodes.size();i++) {
			villes.add(nodes.get(i).value);
		}
		return villes;
	}

}


//initialize the edges

// CASA
/*nodes.get(0).adjacencies = new Edge[] { 
		new Edge(nodes.get(1), 86.6), 
		new Edge(nodes.get(6), 237), 
		new Edge(nodes.get(12),264 ) };

//RABAT
			nodes.get(1).adjacencies = new Edge[] { 
					new Edge(nodes.get(11), 133), 
					new Edge(nodes.get(4), 152), 
					new Edge(nodes.get(0),264 ) };
			// OUJDA
			nodes.get(2).adjacencies = new Edge[] { 
					new Edge(nodes.get(10), 331), 
					new Edge(nodes.get(7), 259) 
					};
			// MARAKECH
			nodes.get(3).adjacencies = new Edge[] { 
					new Edge(nodes.get(6), 191), 
					new Edge(nodes.get(5),158), 
					new Edge(nodes.get(12),312 ) };
			// MEKNESS
			nodes.get(4).adjacencies = new Edge[] { 
					new Edge(nodes.get(11), 114), 
					new Edge(nodes.get(10), 64.1), 
					new Edge(nodes.get(1),64.1 ) };
			// SAFI
			nodes.get(5).adjacencies = new Edge[] { 
					new Edge(nodes.get(3), 158)};
			// BENE MALLALE
			nodes.get(6).adjacencies = new Edge[] { 
					new Edge(nodes.get(0), 237), 
					new Edge(nodes.get(12), 131), 
					new Edge(nodes.get(3),191 ) };
			// AL HOSSIMA
			nodes.get(7).adjacencies = new Edge[] { 
					new Edge(nodes.get(2), 259) 
					 };
			// AZROU
			nodes.get(8).adjacencies = new Edge[] { 
					new Edge(nodes.get(12),80.6) };
			// IFRAN
			nodes.get(9).adjacencies = new Edge[] { 
					new Edge(nodes.get(10), 64) };
			// FES
			nodes.get(10).adjacencies = new Edge[] { 
					new Edge(nodes.get(12), 154), 
					new Edge(nodes.get(2), 331), 
					new Edge(nodes.get(4),64.1 ),
					new Edge(nodes.get(9),64 )};
			// SOUK LARBEA
			nodes.get(11).adjacencies = new Edge[] { 
					new Edge(nodes.get(1),133), 
					new Edge(nodes.get(4), 114), 
					new Edge(nodes.get(10),154 ) };
			// KHNENIFRA
			nodes.get(12).adjacencies = new Edge[] { 
					new Edge(nodes.get(9), 80.6), 
					new Edge(nodes.get(6), 131), 
					new Edge(nodes.get(3),312),
					new Edge(nodes.get(0),264)};*/