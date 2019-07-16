package com.interfaces;

public class InterfaceMain {
	
	public static void main(String[] args) {
		MyConnection con = MyConnFactory.getDBConn("db2");
		System.out.println(con.getConnectionInfo());
		System.out.println(MyConnection.TYPE);
		
	}

}
