/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shiva
 */
import javax.swing.JOptionPane;
import java.sql.*;

public class javaconnect {
	Connection conn = null;
	
	public static Connection ConncrDB() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Shiva\\Documents\\NetBeansProjects\\New Folder\\Banking System Management\\Bank.db");
			return conn;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			
			return null;
		}
	}

}
