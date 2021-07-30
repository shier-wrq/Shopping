package label;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product {
    private int id;
    private String name;
    private int price;
    private int hot;//商品热度
    private Date hotTime;//热度时间
    private int stock;
    private String proPic;//商品路径
    private String description;
    private int specialPrice;
    private Date specialPriceTime;
    private ProductBigType bigType;//所属大类型
    private ProductSmallType smallType;//所属小类型
    private List<OrderProduct> orderProductList = new ArrayList<OrderProduct>();
    public Product(){

    }

    public Product(int id, String name, int price, int hot, Date hotTime, int stock, String proPic, String description, int specialPrice, Date specialPriceTime, ProductBigType bigType, ProductSmallType smallType, List<OrderProduct> orderProductList) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.hot = hot;
        this.hotTime = hotTime;
        this.stock = stock;
        this.proPic = proPic;
        this.description = description;
        this.specialPrice = specialPrice;
        this.specialPriceTime = specialPriceTime;
        this.bigType = bigType;
        this.smallType = smallType;
        this.orderProductList = orderProductList;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public Date getHotTime() {
        return hotTime;
    }

    public void setHotTime(Date hotTime) {
        this.hotTime = hotTime;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProPic() {
        return proPic;
    }

    public void setProPic(String proPic) {
        this.proPic = proPic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(int specialPrice) {
        this.specialPrice = specialPrice;
    }

    public Date getSpecialPriceTime() {
        return specialPriceTime;
    }

    public void setSpecialPriceTime(Date specialPriceTime) {
        this.specialPriceTime = specialPriceTime;
    }

    public ProductBigType getBigType() {
        return bigType;
    }

    public void setBigType(ProductBigType bigType) {
        this.bigType = bigType;
    }

    public ProductSmallType getSmallType() {
        return smallType;
    }

    public void setSmallType(ProductSmallType smallType) {
        this.smallType = smallType;
    }

    public List<OrderProduct> getOrderProductList() {
        return orderProductList;
    }

    public void setOrderProductList(List<OrderProduct> orderProductList) {
        this.orderProductList = orderProductList;
    }
}
