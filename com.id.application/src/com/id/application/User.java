package com.id.application;

import java.util.ArrayList;

public class User {

	private ArrayList<String> _permissions = new ArrayList<String>();
	private ArrayList<String> _roles = new ArrayList<String>();

	private boolean _is_authenticated = false;
	
	public User(){
		
	}
	
	public boolean is_signed_in(){
		return false;
	}
	
	public boolean has_role(final String role){
		if(_is_authenticated){
			// TODO sign in
		}
		return _roles.contains(role);
	}
	
	public boolean has_permission(final String permission){
		if(_is_authenticated){
			// TODO sign in
		}
		return _permissions.contains(permission);
	}
	
	public void authenticate(final String name, final String pw) throws SecurityException {
		throw new SecurityException("Incorrect username and password combination");
	}
	
	public void sign_in(){
		// TODO log_in
	}
	
	public void sign_out(){
		// TODO log out
	}
}
