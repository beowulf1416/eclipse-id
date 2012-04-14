package com.id.application.security;

import java.util.ArrayList;
import java.util.Properties;

public interface ISecurityDataProvider {

	public void initialize(final Properties properties);
	
	public boolean authenticate(final String name, final String pw);
	
	public ArrayList<String> get_roles(final int uid);
	
	public ArrayList<String> get_permissions(final int uid);
	
}
