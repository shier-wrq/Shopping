package service;

import label.ProductBigType;

import java.util.List;

public interface ProductBigTypeService {
    //查询所有大类别的信息
    List<ProductBigType> findAllBigType();
}
