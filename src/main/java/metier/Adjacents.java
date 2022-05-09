package metier;

public class Adjacents {
	private String  villeA;
	private double distance;
	private String  villeB;
	public Adjacents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adjacents(String villeA, double distance, String villeB) {
		super();
		this.villeA = villeA;
		this.distance = distance;
		this.villeB = villeB;
	}
	@Override
	public String toString() {
		return "Adjacents [villeA=" + villeA + ", distance=" + distance + ", villeB=" + villeB + "]";
	}
	public String getVilleA() {
		return villeA;
	}
	public void setVilleA(String villeA) {
		this.villeA = villeA;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public String getVilleB() {
		return villeB;
	}
	public void setVilleB(String villeB) {
		this.villeB = villeB;
	}
	
	
}
