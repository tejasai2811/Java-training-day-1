package com.interfaces;

public class MyConnFactory {

	public static MyConnection getDBConn(String db) {
		if(db.equals("Oracle")) {
			return new OracleDBImpl();
		}
		if(db.equals("mysql")) {
			return new MySQLImpl();
		} else {
			throw new RuntimeException("DB does not match");
		}
	}
}
