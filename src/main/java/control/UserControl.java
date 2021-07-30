package control;

import imp.UserServiceImpl;
import label.User;
import service.UserService;
import util.DateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;


@WebServlet("/UserServlet")

public class UserControl extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UserService userService = new UserServiceImpl();
    private String error = "";
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //获取请求参数
        String oper = req.getParameter("oper");
        if (!"".equals(oper) && "register".equals(oper)) {
            try {
                register(req, resp);
            } catch (ParseException e) {
                System.out.println("UserControl service error");
                e.printStackTrace();
            }
        }else if (!"".equals(oper) && "checkName".equals(oper)) {
            checkName(req, resp);
        }else if(!"".equals(oper) && "login".equals(oper)){
            userLogin(req,resp);
        }else if(!"".equals(oper) && "logout".equals(oper)){
            logout(req,resp);
        }

    }
    //退出登录
    private void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //注销session
        req.getSession().invalidate();
        //页面跳转
        resp.sendRedirect(req.getContextPath()+"/index");
    }

    //用户登录
    private void userLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数
        String username =req.getParameter("userName");
        String password = req.getParameter("password");
        //输入验证码
        String imageCodeInput = req.getParameter("imageCode");
        //获取我们生成好的验证码 通过session
        String imageCode = (String)req.getSession().getAttribute("sRand");
        User user = new User();
        //判断验证码
        if(imageCodeInput.equals(imageCode)){
            //判断用户是否注册
            User currentUser = userService.login(user);
            if(currentUser != null){
                req.getSession().setAttribute("currentUser", currentUser);
                req.getRequestDispatcher("/index").forward(req, resp);
                return;
            }else{
                error = "用户名和密码错误";
            }
        }else{
            error = "验证码错误";
        }
        req.setAttribute("error", error);
        req.getRequestDispatcher("/login,jsp").forward(req, resp);
    }

    //用户注册
    private void register(HttpServletRequest req, HttpServletResponse resp) throws ParseException, ServletException, IOException {
        //获取请求参数
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        Date birthday = DateUtil.formatString(req.getParameter("birthday"),"yyyy-MM-dd");
        String dentityCode = req.getParameter("dentityCode");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String address = req.getParameter("address");
        User user = new User(userName, password, sex, dentityCode, birthday, email, mobile, address);
        userService.register(user);
        req.getRequestDispatcher("/reg-result.jsp").forward(req,resp);
    }
    //用户验证
    private void checkName(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uname = req.getParameter("userName");
        boolean flag = userService.checkName("userName");
        PrintWriter out = resp.getWriter();
        out.print(flag);
    }
}
