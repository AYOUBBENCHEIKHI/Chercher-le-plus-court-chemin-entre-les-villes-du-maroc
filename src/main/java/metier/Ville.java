package metier;

public class Ville {
	private String  nomville;
	private double amplitude;
	private double 	 langtitude;
	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ville(String nomville, double amplitude, double langtitude) {
		super();
		this.nomville = nomville;
		this.amplitude = amplitude;
		this.langtitude = langtitude;
	}
	@Override
	public String toString() {
		return "Ville [nomville=" + nomville + ", amplitude=" + amplitude + ", langtitude=" + langtitude + "]";
	}
	public String getNomville() {
		return nomville;
	}
	public void setNomville(String nomville) {
		this.nomville = nomville;
	}
	public double getAmplitude() {
		return amplitude;
	}
	public void setAmplitude(double amplitude) {
		this.amplitude = amplitude;
	}
	public double getLangtitude() {
		return langtitude;
	}
	public void setLangtitude(double langtitude) {
		this.langtitude = langtitude;
	}
	
}
