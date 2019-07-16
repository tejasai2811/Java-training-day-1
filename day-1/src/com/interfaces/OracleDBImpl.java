package com.interfaces;

public class OracleDBImpl implements MyConnection {

	@Override
	public String getDBInfo() {
		
		return "Oracle DB 12c";
	}

	@Override
	public String getConnectionInfo() {
		
		return "Oracle DB Connection";
	}

}
