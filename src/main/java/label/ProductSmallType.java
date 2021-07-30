package label;

public class ProductSmallType {
    private Integer id;
    private String name;
    private String remark;
    private int bigTypeId;

    public ProductSmallType(){

    }

    public ProductSmallType(Integer id, String name, String remark, int bigTypeId) {
        this.id = id;
        this.name = name;
        this.remark = remark;
        this.bigTypeId = bigTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getBigTypeId() {
        return bigTypeId;
    }

    public void setBigTypeId(int bigTypeId) {
        this.bigTypeId = bigTypeId;
    }
}
