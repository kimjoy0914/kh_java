package com.mvc;

import java.sql.Connection;

import com.util.DBConnectionMgr;

public class DBTest {

	public static void main(String[] args) {
		Connection con = null;
		DBConnectionMgr dbMgr = new DBConnectionMgr();
		try {
			con = dbMgr.getConnection();
			System.out.println(con);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
