package label;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private String orderNo;
    private Date creatTime;
    private int cost;
    private int status;//订单状态
    private List<OrderProduct> OrderProductList = new ArrayList<OrderProduct>();
    //private User user;
    public Order(){

    }

    public Order(int id, String orderNo, Date creatTime, int cost, int status, List<OrderProduct> orderProductList) {
        this.id = id;
        this.orderNo = orderNo;
        this.creatTime = creatTime;
        this.cost = cost;
        this.status = status;
        OrderProductList = orderProductList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<OrderProduct> getOrderProductList() {
        return OrderProductList;
    }

    public void setOrderProductList(List<OrderProduct> orderProductList) {
        OrderProductList = orderProductList;
    }
}
