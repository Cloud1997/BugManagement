package com.zf.bm;

import java.sql.Connection;

public class Startor {

	private Connection con;
	public static void main(String[] args){
		Startor s=new Startor();
		DatabaseConnector dconnector=new DatabaseConnector();
		s.con=	dconnector.connect("org.sqlite.JDBC", "jdbc:sqlite:mydb");
		System.out.println("end");
	}
}
