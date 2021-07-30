package service;

import label.News;

import java.util.List;

public interface NewsService {
    //查询所有新闻信息
    List<News> findAll();
    //通过id查询新闻
    News getNewsById(int newsId);
}
