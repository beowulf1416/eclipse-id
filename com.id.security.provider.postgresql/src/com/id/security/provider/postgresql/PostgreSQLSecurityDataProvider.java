package com.id.security.provider.postgresql;

import java.util.ArrayList;
import java.util.Properties;

import com.id.application.security.ISecurityDataProvider;

public class PostgreSQLSecurityDataProvider implements ISecurityDataProvider {

	@Override
	public void initialize(Properties properties) {
		// TODO Auto-generated method stub

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
