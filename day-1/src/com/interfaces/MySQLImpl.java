package com.interfaces;

public class MySQLImpl implements MyConnection {

	@Override
	public String getDBInfo() {
		
		return "MySQL DB 12c";
	}

	@Override
	public String getConnectionInfo() {
		
		return "MySQL DB Connection";
	}

}
