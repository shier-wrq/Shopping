package control;

import imp.*;
import label.*;
import service.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * 请求初始化
 */
@WebServlet("/productServlet")
public class InitControl extends HttpServlet {
    //序列化
    private static final long serialVersionUID = 1L;
    //多态 通过接口，以及接口实例化来降低耦合度，让程序更加容易扩展
    private ProductBigTypeService bigTypeService = (ProductBigTypeService) new ProductBigTypeServiceImpl();
    //热门标签
    private TagService tagService = (TagService) new TagServiceTmpl();
    //新闻
    private NewsService newsService = new NewsServiceImpl();
    //公告
    private NoticeService noticeService = new NoticeServiceImpl();
    //商品
    private ProductService productService = new ProductServiceImpl();

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //查询大类别信息存放到作用域中
        List<ProductBigType> bigTypeList = bigTypeService.findAllBigType();
        /**
        System.out.println(bigTypeList + "bigTypeList");
         **/
        //查询热门标签导航栏
        List<Tag> tagList = tagService.findAll();
        //获取公告信息
        List<Notice> noticeList = noticeService.findAll();
        //获取新闻信息
        List<News> newsList = newsService.findAll();
        //获取特价商品信息
        List<Product> specialPriceProductList = productService.findSpecialPrice();
        //获取热门商品信息
        List<Product> hotProductList = productService.findHotProductList();
        HttpSession session = req.getSession();
        //将查询结果放到域对象里面
        session.setAttribute("tagList", tagList);
        session.setAttribute("bigTypeList", bigTypeList);
        session.setAttribute("noticeList", noticeList);
        session.setAttribute("newsList", newsList);
        session.setAttribute("specialPriceProductList", specialPriceProductList);
        session.setAttribute("hotProductList", hotProductList);

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
