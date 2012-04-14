package com.id.application.security;

import java.util.ArrayList;
import java.util.Properties;

public class DefaultSecurityDataProvider implements ISecurityDataProvider {

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
