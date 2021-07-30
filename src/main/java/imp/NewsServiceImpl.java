package imp;

import label.News;
import label.Notice;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import service.NewsService;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsServiceImpl implements NewsService {
    @Override
    public List<News> findAll() {
        List<News> newsList = new ArrayList<News>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = DBUtil.getCon();
            String sql = "SELECT * FROM NEWS WHERE ID < 7";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){
                News news = new News();
                news.setId(rs.getInt("id"));
                news.setContent(rs.getString("content"));
                news.setCreatTime(rs.getDate("creatTime"));
                news.setTitle(rs.getString("title"));
                newsList.add(news);
            }
            return newsList;
        }catch (SQLException e){
            System.out.println("public List<News> findAll() error");
            e.printStackTrace();
        }finally {
            DBUtil.closeALL(con, stmt, rs);
        }
        return null;
    }

    @Override
    public News getNewsById(int newsId) {
        News news = null;
        Connection con = null;
        try {
            con = DBUtil.getCon();
            String sql = "SELECT * FROM NEWS WHERE ID = " + newsId;
            Object[] obj = new Object[] {newsId};
            QueryRunner qr = new QueryRunner();
            qr.query(con, sql, new BeanHandler<News>(News.class));
        } catch (SQLException e) {
            System.out.println("getNewsById error");
            e.printStackTrace();
        }finally {
            DBUtil.closeALL(con, null, null);
        }
        return news;
    }

}
