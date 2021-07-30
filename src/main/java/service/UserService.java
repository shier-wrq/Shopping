package service;

import label.User;

public interface UserService {
    //用户注册
    void register(User user);
    //用户名唯一验证
    boolean checkName(String userName);
    //用户登录
    User login(User user);
}
