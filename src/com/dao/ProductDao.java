package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.ProductBean;
import com.util.DBConnection;

public class ProductDao {

	public boolean addProduct(ProductBean productBean) {
		boolean flag = false;
		
		Connection conn = DBConnection.getDbConnection();
		if(conn!=null) {
			
			String insertSQL = "insert into product(pname,pprice)values(?,?)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(insertSQL);
				pstmt.setString(1, productBean.getpName());
				pstmt.setInt(2, productBean.getpPrice());
				
				int res = pstmt.executeUpdate();
				if(res>0) {
					flag =true;
				}
				else {
					flag = false;
				}
									
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		return flag;
	}
}
