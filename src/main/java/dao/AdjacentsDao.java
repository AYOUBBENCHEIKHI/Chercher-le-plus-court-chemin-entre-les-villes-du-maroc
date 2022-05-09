package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.Adjacents;

public class AdjacentsDao {
	public List<Adjacents> adjacent(String nomVille) {
		List<Adjacents> adjacent = new ArrayList<Adjacents>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM adjacents WHERE VilleA=?");
			ps.setString(1, nomVille);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {	
				Adjacents a =new Adjacents();
				a.setVilleA(rs.getString("VILLEA"));
				a.setDistance(rs.getDouble("DISTANCE"));
				a.setVilleB(rs.getString("VILLEB"));
				 
				
				adjacent.add(a);
			}
		
			ps.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return adjacent;
	}
}
