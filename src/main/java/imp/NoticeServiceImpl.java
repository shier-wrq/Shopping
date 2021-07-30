package imp;

import label.News;
import label.Notice;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import service.NoticeService;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NoticeServiceImpl implements NoticeService {
    @Override
    public List<Notice> findAll() {
        List<Notice> noticeList = new ArrayList<Notice>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = DBUtil.getCon();
            String sql = "SELECT * FROM NOTICE WHERE ID <= 7";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Notice notice = new Notice();
                notice.setId(rs.getInt("id"));
                notice.setContent(rs.getString("content"));
                notice.setCreatTime(rs.getDate("creatTime"));
                notice.setTitle(rs.getString("title"));
                noticeList.add(notice);
            }
            return noticeList;
        } catch (SQLException e) {
            System.out.println("public List<Notice> findAll() error");
            e.printStackTrace();
        } finally {
            DBUtil.closeALL(con, stmt, rs);
        }
        return null;
    }

    @Override
    public Notice getNoticeById(int noticeId) {
        Notice notice = null;
        Connection con = null;
        try {
            con = DBUtil.getCon();
            String sql = "SELECT * FROM NOTICE WHERE ID = " + noticeId;
            Object[] obj = new Object[] {noticeId};
            QueryRunner qr = new QueryRunner();
            qr.query(con, sql, new BeanHandler<Notice>(Notice.class));
        } catch (SQLException e) {
            System.out.println("getNoticeById error");
            e.printStackTrace();
        }finally {
            DBUtil.closeALL(con, null, null);
        }
        return notice;
    }
}

