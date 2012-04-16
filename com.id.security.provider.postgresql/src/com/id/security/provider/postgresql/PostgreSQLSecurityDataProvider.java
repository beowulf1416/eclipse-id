package com.id.security.provider.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.core.runtime.Status;

import com.id.application.security.ISecurityDataProvider;

public class PostgreSQLSecurityDataProvider implements ISecurityDataProvider {

	private Connection _cn;
	
	/**
	 * intializes the provider
	 * @param Properties
	 * 	should have the following properties:
	 * 	* host
	 *  * port
	 *  * database
	 *  * user
	 *  * password
	 * http://jdbc.postgresql.org/documentation/head/connect.html
	 */
	@Override
	public void initialize(Properties properties) {
		// jdbc:postgresql://host:port/database
		String host = properties.getProperty("host", "");
		String port = properties.getProperty("port", "");
		String db = properties.getProperty("db", "");
		
		String uri = "jdbc:postgresql://"+host+":"+port+"/"+db;
		
		try {
			_cn = DriverManager.getConnection(uri, properties);
		} catch(SQLException e){
			Activator.getDefault().getLog().log(
				new Status(
					Status.ERROR, 
					Activator.PLUGIN_ID, 
					"Unable to obtain a connection to a database instance"
				)
			);
		}
	}

	@Override
	public boolean authenticate(String name, String pw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<String> get_roles(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> get_permissions(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

}
