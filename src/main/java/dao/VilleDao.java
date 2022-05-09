package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.Ville;

public class VilleDao {
	public List<Ville> getVilles() {
		List<Ville> vs = new ArrayList<Ville>();
		Connection connection = SingletonConnection.getConnection();
		try {
			
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM VILLE ");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Ville v = new Ville();
				v.setNomville(rs.getString("NOMVILLE"));
				v.setAmplitude(rs.getDouble("AMPLITUDE"));
				v.setLangtitude(rs.getDouble("LANGTITUDE"));
				vs.add(v);
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vs;
		
	}
	public Ville getVille(String nom) {
		Ville v = null;
		Connection connection = SingletonConnection.getConnection();
		try {
			
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM VILLE WHERE NOMVILLE LIKE ? ");
			ps.setString(1, nom);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				 v = new Ville();
				v.setNomville(rs.getString("NOMVILLE"));
				v.setAmplitude(rs.getDouble("AMPLITUDE"));
				v.setLangtitude(rs.getDouble("LANGTITUDE"));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
		
	}
}
