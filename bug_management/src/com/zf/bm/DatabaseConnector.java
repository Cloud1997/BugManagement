package com.zf.bm;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
	
	public Connection connect(String dbClass,String connectionUrl){
		Connection con=null;
		try{		
		Class.forName(dbClass);
		con=	DriverManager.getConnection(connectionUrl);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return con;
	}

}
