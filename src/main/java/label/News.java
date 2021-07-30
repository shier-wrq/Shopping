package label;

import java.util.Date;

public class News {
    private Integer id;
    private String content;//内容
    private String title;
    private Date creatTime;
    public News(){

    }
    public News(Integer id, String content, String title, Date creatTime) {
        this.id = id;
        this.content = content;
        this.title = title;
        this.creatTime = creatTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}
