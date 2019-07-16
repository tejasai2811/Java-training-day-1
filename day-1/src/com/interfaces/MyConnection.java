package com.interfaces;

public interface MyConnection {

	String TYPE = "RDBMS"; //must be initialized.... because by default interface variables are final
	
	String getDBInfo();
	
	String getConnectionInfo();
	
	
}
