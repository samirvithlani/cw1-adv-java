package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.ProductBean;
import com.util.DBConnection;

public class ProductDao {

	
	public boolean updateProduct(ProductBean productBean) {
		
		boolean flag = false;
		Connection conn = DBConnection.getDbConnection();
		if(conn!=null) {
			
			String updateSQl = "update product set pName =?,pprice =? where pid =?";
			try {
				PreparedStatement pstmt = conn.prepareStatement(updateSQl);
				pstmt.setString(1, productBean.getpName());
				pstmt.setInt(2, productBean.getpPrice());
				pstmt.setInt(3, productBean.getpId());
				int res = pstmt.executeUpdate();
				if(res>0) {
					flag =true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
		
	}
	
	public ProductBean getProductById(int id) {

		ProductBean productBean = null;

		Connection conn = DBConnection.getDbConnection();
		if (conn != null) {

			String deleteSQL = "select * from product where pid =?";
			try {
				PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					productBean = new ProductBean();
					productBean.setpId(rs.getInt("pid"));
					productBean.setpName(rs.getString("pname"));
					productBean.setpPrice(rs.getInt("pprice"));

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return productBean;

	}

	public boolean deleteProduct(int id) {

		boolean flag = false;
		Connection conn = DBConnection.getDbConnection();
		if (conn != null) {

			String deleteSQl = "delete from product where pid =?";
			try {
				PreparedStatement pstmt = conn.prepareStatement(deleteSQl);
				pstmt.setInt(1, id);
				int res = pstmt.executeUpdate();
				System.out.println("res.." + res);
				if (res > 0) {
					flag = true;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return flag;

	}

	public List<ProductBean> productList() {

		List<ProductBean> products = new ArrayList<ProductBean>();
		Connection conn = DBConnection.getDbConnection();
		if (conn != null) {

			String selectSQL = "select * from product";
			try {
				PreparedStatement pstmt = conn.prepareStatement(selectSQL);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					ProductBean productBean = new ProductBean();
					productBean.setpId(rs.getInt("pid"));
					productBean.setpName(rs.getString("pname"));
					productBean.setpPrice(rs.getInt("pprice"));
					products.add(productBean);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return products;
	}

	public boolean addProduct(ProductBean productBean) {
		boolean flag = false;

		Connection conn = DBConnection.getDbConnection();
		if (conn != null) {

			String insertSQL = "insert into product(pname,pprice)values(?,?)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(insertSQL);
				pstmt.setString(1, productBean.getpName());
				pstmt.setInt(2, productBean.getpPrice());

				int res = 0;
				res = pstmt.executeUpdate();
				System.out.println("res.." + res);
				if (res > 0) {
					flag = true;
				} else {
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
