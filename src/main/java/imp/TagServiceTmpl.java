package imp;

import label.Tag;
import service.TagService;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TagServiceTmpl implements TagService {
    public List<Tag> findAll(){
        List<Tag> list = new ArrayList<Tag>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = DBUtil.getCon();
            String sql = "SELECT * FROM TAG";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Tag tag = new Tag();
                tag.setId(rs.getInt("id"));
                tag.setName(rs.getString("name"));
                tag.setUrl(rs.getString("url"));
                list.add(tag);
            }
            return list;
        }catch(SQLException e){
            System.out.println("TagService findAll error");
            e.printStackTrace();
        }finally {
            DBUtil.closeALL(con, stmt, rs);
        }
        return null;
    }
}
