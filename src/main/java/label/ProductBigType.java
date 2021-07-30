package label;

import java.util.ArrayList;
import java.util.List;

public class ProductBigType {
    private Integer id;
    private String name;
    private String remark;
    private List<ProductSmallType> smallTypeList = new ArrayList<>();
    public ProductBigType(){

    }

    public ProductBigType(Integer id, String name, String remark, List<ProductSmallType> smallTypeList) {
        super();
        this.id = id;
        this.name = name;
        this.remark = remark;
        this.smallTypeList = smallTypeList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<ProductSmallType> getSmallTypeList(List<ProductSmallType> pst) {
        return smallTypeList;
    }

    public void setSmallTypeList(List<ProductSmallType> smallTypeList) {
        this.smallTypeList = smallTypeList;
    }
    //toString()
}

