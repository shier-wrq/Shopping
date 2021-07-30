package control;

import imp.NoticeServiceImpl;
import label.Notice;
import service.NoticeService;
import util.NavUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/noticeServlet")
public class NoticeServlet extends HttpServlet {
    private static final long serialVersionUID = 1;
    private NoticeService noticeService = new NoticeServiceImpl();

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取前台传来的noticeId
        int noticeId = Integer.parseInt(req.getParameter("noticeId"));
        Notice notice = noticeService.getNoticeById(noticeId);
        String navCode = NavUtil.getNavCode("公告信息");
        String mainPage = "notice/noticeDetails.jsp";

        req.setAttribute("notice", notice);
        req.setAttribute("navCode", navCode);
        req.setAttribute("mainPage", mainPage);
        req.getRequestDispatcher("/noticeMain.jsp").forward(req,resp);
    }
}
