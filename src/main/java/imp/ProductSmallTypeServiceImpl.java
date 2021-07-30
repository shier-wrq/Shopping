package imp;

import label.ProductSmallType;
import service.ProductSmallTypeService;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductSmallTypeServiceImpl implements ProductSmallTypeService {
    @Override
    public List<ProductSmallType> findBigTypeId(int bitTypeId) {
        List<ProductSmallType> list = new ArrayList<ProductSmallType>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = DBUtil.getCon();
            /**
             String sql = "SELECT * FROM SMALLTYPE WHERE BIGTYPEID =" + bitTypeId;
             **/
            String sql = "SELECT * FROM SMALLTYPE WHERE BIGTYPEID = ? ";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1,bitTypeId);
            rs = stmt.executeQuery();
            while(rs.next()){
                ProductSmallType pst = new ProductSmallType();
                pst.setId(rs.getInt("id"));
                pst.setName(rs.getString("name"));
                pst.setRemark(rs.getString("remark"));
                pst.setBigTypeId(rs.getInt("id"));
                list.add(pst);
            }
            return list;
        }catch (SQLException e){
            System.out.println("List<ProductSmallType> error");
            e.printStackTrace();
        }finally {
            DBUtil.closeALL(con, stmt, rs);
        }
        return null;
    }
}
