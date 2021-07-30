package control;

import imp.NewsServiceImpl;
import imp.NoticeServiceImpl;
import label.News;
import label.Notice;
import service.NewsService;
import service.NoticeService;
import util.NavUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/newsServlet")
public class NewsServlet extends HttpServlet {
    private static final long serialVersionUID = 1;
    private NewsService newsService = new NewsServiceImpl();
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取前台传来的noticeId
        int newsId = Integer.parseInt(req.getParameter("newsId"));
        News news = newsService.getNewsById(newsId);
        String navCode = NavUtil.getNavCode("新闻");
        String mainPage = "news/newsDetails.jsp";

        req.setAttribute("news", news);
        req.setAttribute("navCode", navCode);
        req.setAttribute("mainPage", mainPage);

        req.getRequestDispatcher("/newsMain.jsp").forward(req,resp);
    }
}
