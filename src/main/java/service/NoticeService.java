package service;

import label.Notice;

import java.util.List;

public interface NoticeService {
    //查询所有公告
    List<Notice> findAll();
    //通过id查询公告
    Notice getNoticeById(int noticeId);
}
