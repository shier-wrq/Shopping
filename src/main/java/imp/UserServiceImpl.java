package imp;

import label.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import service.UserService;
import util.DBUtil;

import javax.management.Query;
import java.sql.Connection;
import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    @Override
    public void register(User user) {
        Connection con = null;
        try {
            con = DBUtil.getCon();
            String sql = "INSERT INTO USER (ADDRESS,BIRTHDAY,DENTITYCODE,EMAIL,MOBILE,PASSWORD,SEX,STATUS,USERNAME) VALUES(?,?,?,?,?,?,?,?,?)";
            //设置绑定变量
            Object[] pars = new Object[]{
                    user.getAddress(),
                    user.getBirthday(),
                    user.getDentityCode(),
                    user.getEmail(),
                    user.getMobile(),
                    user.getPassword(),
                    user.getSex(),
                    user.getStatus(),
                    user.getUserName()
            };
            QueryRunner qr = new QueryRunner();
            //执行修改操作
            qr.update(con, sql, pars);
        }catch (SQLException e){
            System.out.println("register error");
            e.printStackTrace();
        }finally {
            DBUtil.closeALL(con, null, null);
        }
    }

    @Override
    public boolean checkName(String userName) {
        boolean flag = false;
        Connection con = null;
        try {
            con = DBUtil.getCon();
            String sql = "SELECT * FROM USER WHERE USERNAME = ?";
            //设置绑定变量
            QueryRunner qr = new QueryRunner();
            Object[] obj = new Object[]{userName};
            User u = qr.query(con, sql, new BeanHandler<User>(User.class), obj);
            //如果为空该用户名可使用，否则不能
            if(null == u){
                flag = true;
            }else{
                flag = false;
            }
        }catch (SQLException e){
            System.out.println("checkName error");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public User login(User user) {
        User u = null;
        Connection con = null;
        try {
            con = DBUtil.getCon();
            String sql = "SELECT * FROM USER WHERE USERNAME =? AND PASSWORD =?";
            Object[] pars = new Object[]{user.getUserName(), user.getPassword()};
            QueryRunner qr = new QueryRunner();
            u = qr.query(con, sql, new BeanHandler<User>(User.class), pars);
        }catch (SQLException e){
            System.out.println("UserServiceImpl login error");
            e.printStackTrace();
        }finally {
            DBUtil.closeALL(con, null, null);
        }
        return u;
    }
}
