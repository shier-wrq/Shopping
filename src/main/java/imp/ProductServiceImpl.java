package imp;

import label.Product;
import service.ProductService;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> findSpecialPrice() {
        List<Product> productList = new ArrayList<Product>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = DBUtil.getCon();
            String sql = "SELECT * FROM PRODUCT WHERE SPECIALPRICE = 1 AND ID < 40 ORDER BY SPECIALPRICETIME DESC";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setDescription(rs.getString("description"));
                product.setHot(rs.getInt("hot"));
                product.setHotTime(rs.getDate("hotTime"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getInt("price"));
                product.setProPic(rs.getString("proPic"));
                product.setSpecialPrice(rs.getInt("specialPrice"));
                product.setSpecialPriceTime(rs.getDate("specialPriceTime"));
                product.setStock(rs.getInt("stock"));
                productList.add(product);
            }
            return productList;
        }catch (SQLException e){
            System.out.println("findSpecialPrice error");
            e.printStackTrace();
        }finally {
            DBUtil.closeALL(con, stmt, rs);
        }
        return null;
    }

    @Override
    public List<Product> findHotProductList() {
        List<Product> productHotList = new ArrayList<Product>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = DBUtil.getCon();
            String sql = "SELECT * FROM PRODUCT WHERE HOT = 1 AND ID < 17 ORDER BY HOTTIME DESC";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setDescription(rs.getString("description"));
                product.setHot(rs.getInt("hot"));
                product.setHotTime(rs.getDate("hotTime"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getInt("price"));
                product.setProPic(rs.getString("proPic"));
                product.setSpecialPrice(rs.getInt("specialPrice"));
                product.setSpecialPriceTime(rs.getDate("specialPriceTime"));
                product.setStock(rs.getInt("stock"));
                productHotList.add(product);
            }
            return productHotList;
        }catch (SQLException e){
            System.out.println("findHotProductList error");
            e.printStackTrace();
        }finally {
            DBUtil.closeALL(con, stmt, rs);
        }
        return null;
    }
}
