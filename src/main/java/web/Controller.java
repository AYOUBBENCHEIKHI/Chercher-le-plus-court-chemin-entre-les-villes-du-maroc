package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.VilleDao;
import metier.Ville;
import metier.AppllicationAstar;
import metier.AstarSearchAlgo;
import metier.Node;
@WebServlet(name="/Controller",urlPatterns = {"*.php"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public List<String> VILLES =new ArrayList<String>();
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		this.VILLES.add("rabat");
		this.VILLES.add("Casablanca");
		this.VILLES.add("fes");
		this.VILLES.add("khenifra");
		this.VILLES.add("marrakech");
		if(path.equals("/chercher.php")&& (request.getMethod().equals("POST"))) {
			String villeDeparte =request.getParameter("villeDeparte");
			String villedarriver =request.getParameter("villedarriver");
			if(villeDeparte.equals("")||villedarriver.equals("")) {
				villeDeparte="Fes";
				villedarriver="Fes";
			}
			VilleDao v =new VilleDao();
			Ville vd = v.getVille(villeDeparte);
			Ville va = v.getVille(villedarriver);
		
			List<Node> nodes = new ArrayList<Node>();
			AppllicationAstar ap = new AppllicationAstar();
			nodes = ap.applicationAstar(vd,va);
			Model m =new Model();
			m.setVilles(ap.axtrairaVille(nodes));
			request.setAttribute("model",m);
			request.getRequestDispatcher("/resultat.jsp").forward(request, response);
			
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
