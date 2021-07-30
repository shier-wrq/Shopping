package service;

import label.Product;

import java.util.List;

public interface ProductService {
    //首页特价商品展示
    List<Product> findSpecialPrice();
    //首页热门商品展示
    List<Product> findHotProductList();
}
