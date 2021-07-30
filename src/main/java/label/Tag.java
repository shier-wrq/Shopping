package label;

public class Tag {
    private  int id;//标签id
    private String name;//标签名称
    private String url;//标签的地址
    public Tag(){

    }
    public Tag(int id, String name, String url){
        super();
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
