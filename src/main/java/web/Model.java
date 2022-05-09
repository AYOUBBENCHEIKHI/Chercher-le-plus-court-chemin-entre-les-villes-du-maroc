package web;

import java.util.ArrayList;
import java.util.List;


public class Model {
	List<String> villes = new ArrayList<String>();

	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Model(List<String> villes) {
		super();
		this.villes = villes;
	}

	public List<String> getVilles() {
		return villes;
	}

	public void setVilles(List<String> villes) {
		this.villes = villes;
	}
	
	
}
