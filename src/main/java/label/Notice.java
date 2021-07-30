package label;

import java.util.Date;

public class Notice {
    private Integer id;
    private String content;
    private Date creatTime;
    private String title;
    public Notice(){

    }
    public Notice(Integer id, String content, Date creatTime, String title) {
        this.id = id;
        this.content = content;
        this.creatTime = creatTime;
        this.title = title;
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

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
