package imp;

import label.Product;
import label.ProductBigType;
import label.ProductSmallType;
import service.ProductBigTypeService;
import service.ProductSmallTypeService;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductBigTypeServiceImpl implements ProductBigTypeService {
    private  ProductSmallTypeService smallService = new ProductSmallTypeServiceImpl();
    public List<ProductBigType> findAllBigType() {
        List<ProductBigType> list = new ArrayList<ProductBigType>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = DBUtil.getCon();
            String sql = "SELECT * FROM BIGTYPE";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                ProductBigType pbt = new ProductBigType();
                pbt.setId(rs.getInt("id"));
                pbt.setName(rs.getString("name"));
                pbt.setRemark(rs.getString("remark"));
                List<ProductSmallType> pst = smallService.findBigTypeId(rs.getInt("id"));
                pbt.getSmallTypeList(pst);
                list.add(pbt);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeALL(con, stmt, rs);
        }
        return null;


    }
}
