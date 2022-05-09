package dao;

import java.util.ArrayList;
import java.util.List;

import metier.Adjacents;
import metier.AppllicationAstar;
import metier.AstarSearchAlgo;
import metier.Node;
import metier.Ville;


public class Test {

	public static void main(String[] args) {
		/*AdjacentsDao dao= new AdjacentsDao();
		List<Adjacents> distances = new ArrayList<Adjacents>();
		distances = dao.adjacent("Khenifra");
		for (Adjacents distance : distances) {
			System.out.println(distance.toString());
		}*/
		//Casablanca
		//33.53333
		//-7.58333
		
		/*Fes
34.0333
-5*/
		VilleDao v =new VilleDao();
		Ville vd = new Ville("Fes",34.0333,-5);
		Ville va = new Ville("Casablanca",33.53333,-7.58333);
		System.out.println("debuts de programme.....");
		AppllicationAstar ap = new AppllicationAstar();
		 //Node n = AstarSearchAlgo.AstarSearch(ap.convertToNode("Fes", va), ap.convertToNode("Casablanca", va));
		 
		 System.out.println(ap.applicationAstar(vd, va));
		
		
	}

}
