package metier;

import java.util.List;

public class Houristique {
	private List<Float> Horistiques;
	
	public float calculHoristique(Ville villeDep,Ville villeArriver) {	
		float houristique = 0;
		double vale;
		vale = Math.pow((villeDep.getAmplitude()-villeArriver.getAmplitude()),2) + 
				Math.pow((villeDep.getLangtitude()-villeArriver.getLangtitude()),2);
		houristique =(float) Math.sqrt(vale);
		return houristique;
	}

}
